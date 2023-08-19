// npm install express, npm install mongoose, npm install body-parser, npm install ejs 
// node mongo.js

const express = require('express')
const app = express()
const mongoose = require('mongoose')
const bodyParser = require('body-parser')
const ejs = require('ejs')
const port = 3006

app.set('view engine', 'ejs')

app.use(bodyParser.urlencoded({extended: true}))

mongoose.connect("mongodb+srv://abraham:122345678@cluster0.tnggu.mongodb.net/personsDB")

const interested = {
    Name: String,
    Email: String,
    Message: String
}

const admin = {
    Email: String,
    Password: String
    
}

const Interested = mongoose.model("Interested", interested)
const Admin = mongoose.model("Admin", admin)

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

app.post('/login', function(req, res) {
    var email = req.body.LogEmail
    var password = req.body.password

    Admin.findOne({Email: email, Password: password}, function(err, admin) {
        if (admin != null)
        {
            Interested.find({}, function(err, interesteds) {
                res.render("index", {
                    peopleList: interesteds
                })
            })
        }
        else
        {
            res.redirect('/')
            console.log(err)
        }
    })
})

app.listen(port, function() {
    console.log("server on: " + port)
})
