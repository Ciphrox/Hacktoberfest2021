exports.getContact = (req, res) => {
  res
    .status(205)
    .send(
      "<h4>If you want to contact me then mail me on <a href>nisha123@gmail.com</a></h4>"
    );
};

exports.postContact = (req, res) => {
  const { name, dob, marks, number, feedback } = req.body;

  const sum = `${marks + number}`;

  const response = {
    success: true,
    welcome_message: "welcome to contact page",
    result: `the result is ${sum}`,
  };
  res.status(205).json(response);
};
