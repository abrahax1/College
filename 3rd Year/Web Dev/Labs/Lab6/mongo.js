const express = require('express')
const app = express()
const mongoose = require('mongoose')
const bodyParser = require('body-parser')
const{body,validationResult}=require('express-validator');
const port = 3006


app.use(bodyParser.urlencoded({extended: true}))

mongoose.connect("mongodb+srv://abraham:122345678@cluster0.tnggu.mongodb.net/personsDB")

const interested = {
    Name: String,
    Email: String,
    Message: String
}

const Interested = mongoose.model("Interested", interested)

app.use(express.static(__dirname));

app.get("/", function(req, res) {
    res.sendFile(__dirname + "/Resume.html")
})

app.post("/", function(req, res) {
    let newInterested = new Interested({
        Name: req.body.Name,
        Email: req.body.Email,
        Message: req.body.Message
    })
    newInterested.save()
    res.redirect('/')
})

app.listen(port, function() {
    console.log("server on: " + port)
})
