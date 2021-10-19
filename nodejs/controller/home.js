exports.getHome = (req, res) => {
  res.status(200).send("<h5>This is home page</h5>");
};

exports.postHome = (req, res) => {
  const { name, address, number } = req.body;
  const username = `${name.split(" ")[0]}${number}`;

  const response = {
    success: true,
    welcome_message: `welcome ${name}, your username is ${username}`,
  };
  res.status(205).json(response);
};
