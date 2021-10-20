exports.getAbout = (req, res) => {
  res.status(201).send("<h3>This is about page</h3>");
};

exports.PostAbout = (req, res) => {
  const { dob, username, name } = req.body;
  const registration = `${dob.split("-")[0]}${dob.split("-")[1]}${
    dob.split("-")[2]
  }${username}`;
  const response = {
    success: true,
    welcome_meessage: `welcome to about page ${name}, your registration number is ${registration}`,
  };
  res.status(201).json(response);
};
