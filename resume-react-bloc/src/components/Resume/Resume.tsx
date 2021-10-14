import React from "react";
import { bloc, ResumeFormConcept } from "../../blocs/FormData";
export class Resume extends React.Component<
  { formData: ResumeFormConcept },
  {}
> {
  constructor(props: any) {
    super(props);
    this.state = {
      address: [],
      education: [],
      email: "",
      experience: [],
      firstName: "",
      lastName: "",
      phone: "",
      skills: [],
    };
    bloc.subject.subscribe((res) => {
      console.log(res);

      this.setState({ ...res });
    });
  }
  componentDidMount() {}
  render() {
    const formData = this.state as ResumeFormConcept;
    return (
      <div style={{ height: "100%" }}>
        <h4 className="text-right  pb-0 m-0">
          {formData.firstName} {formData.lastName}
        </h4>

        <small className="text-right text-secondary float-right">
          <i className="bi bi-phone m-1 mt-5"></i>
          {formData.phone}
        </small>
        <br />
        <small className="text-right text-secondary float-right">
          <i className="bi bi-envelope m-1"></i>
          {formData.email}
        </small>
        <br />
        <small className="text-right text-secondary float-right">
          <i className="bi bi-envelope m-1"></i>
          {formData.address[0]}, ${formData.address[1]}, {formData.address[2]}
        </small>
        <div className="mt-5">
          <h5 className="font-weight-light">Education Details</h5>
          {formData.education.map((t) => {
            <div>
              <small>
                <strong>{t.course}</strong>
              </small>
              <br />
              <small className="text-secondary">{t.institue}</small>
              <br />
              <small className="text-secondary">{t.year}</small>
            </div>;
          })}
        </div>
        <div className="mt-2">
          <h5 className="font-weight-light">Experience Details</h5>
          {formData.experience.map((t) => {
            return (
              <div>
                <small>
                  <strong>{t.company}</strong>
                </small>
                <br />
                <small className="text-secondary">{t.year}</small>
              </div>
            );
          })}
        </div>
      </div>
    );
  }
}
