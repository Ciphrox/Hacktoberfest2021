const mongoose = require("mongoose");

const db_url = "mongodb://localhost:27017/Nisha_db";

const ConnectDb = () => {
  mongoose.connect(db_url, (err) => {
    if (!err) {
      console.log("Database is connected");
    } else {
      console.log(err);
    }
  });
};

module.exports = ConnectDb;
