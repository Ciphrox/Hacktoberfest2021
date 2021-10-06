import React from "react";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap-icons/font/bootstrap-icons.css";
import { ResumeForm } from "./components/ResumeForm/ResumeForm";
import { Resume } from "./components/Resume/Resume";
import { bloc } from "./blocs/FormData";
import { StreamBuilder } from "./components/StreamBuilder";

function App(): JSX.Element {
  return (
    <div style={{ height: "100%" }} className="container-fluid p-5 bg-dark ">
      <h3 className="text-white">Resume Builder</h3>
      <div className="row">
        <div className="card col-md-5 m-3">
          <ResumeForm />
        </div>
        <div className="card col-md-6 m-3">
          <StreamBuilder
            stream={bloc.subject}
            builder={(snapshot) => {
              if (snapshot.hasData) {
                const isEmpty = Object.values(snapshot.data!).every(
                  (x) => x.length < 1
                );
                if (!isEmpty) {
                  return <Resume formData={snapshot.data!} />;
                } else {
                  return <>Please Enter Data</>;
                }
              } else {
                return <>Please Enter Data</>;
              }
            }}
          />
        </div>
      </div>
    </div>
  );
}

export default App;
