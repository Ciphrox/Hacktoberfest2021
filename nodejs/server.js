const express = require("express");
const app = express();
const ConnectDb = require("./connectdb");

const homeRoutes = require('./router/home')
const aboutRoutes = require('./router/about')
const contactRoutes = require('./router/contact')
const helpRoutes = require('./router/help')

app.use(homeRoutes)
app.use(aboutRoutes)
app.use(contactRoutes)
app.use(helpRoutes)

app.all("*", (req,res)=>{
  res.status(404).send("<h3>Page Not Found</h3>");

})

app.use(express.json());
const port = process.env.PORT || 5000;
ConnectDb();

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
