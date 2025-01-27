const express = require("express")
const app = express();
const port = 3000;

const data = [
    { name: "Anastasia", age: 19 }, 
    { name: "Peter", age: 13 }, 
    { name: "Josef", age: 23 },
];

app.get("/", (req, res) => {
    res.send("I am here")
})
app.get("/people", (req, res) => {
    res.send(data)
})
app.post("/people", (req, res) => {
    res.send("Thanks")
})

app.listen(port, () => {
    console.log("Server running on port " + port)
})