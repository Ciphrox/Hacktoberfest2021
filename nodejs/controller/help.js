exports.getHelp = (req, res) => {
  res.status(200).send("<h3>This is help page</h3>");
};

exports.postHelp = (req, res) => {
  const response = {
    success: true,
    welcome_message: "welcome to help page",
  };
  res.status(200).json(response);
};
