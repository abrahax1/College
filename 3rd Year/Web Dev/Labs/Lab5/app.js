const express = require('express');
const bodyParser = require('body-parser');

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static(__dirname + "/public"));
const port = 3000
app.listen(port, function() {
    console.log('Server running on port: ' + port);
});

app.get("/", function(req, res) {
    res.sendFile(__dirname + "/index.html");
});

app.post("/sum", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    console.log(num1 + num2);
    const result = {
        result: num1 + num2
    };
    res.json(result);
});

app.post("/sub", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    console.log(num1 - num2);
    const result = {
        result: num1 - num2
    };
    res.json(result);
});

app.post("/mult", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    console.log(num1 * num2);
    const result = {
        result: num1 * num2
    };
    res.json(result);
});

app.post("/div", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    console.log(num1 / num2);
    const result = {
        result: num1 / num2
    };
    res.json(result);
});

app.post("/mod", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    console.log(num1 % num2);
    const result = {
        result: num1 % num2
    };
    res.json(result);
});

app.post("/exp", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    console.log(num1 ** num2);
    const result = {
        result: Math.pow(num1, num2)
    };
    res.json(result);
});

app.post("/root", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    const result = {
        result: nthroot(num1, num2)
    };
    res.json(result);
});

function nthroot(x, n)
{
    ng = n % 2;
    if((ng == 1) || x<0)
       x = -x;
    var r = Math.pow(x, 1 / n);
    n = Math.pow(r, n);

    if(Math.abs(x - n) < 1 && (x > 0 === n > 0))
      return ng ? -r : r; 
}

app.post("/log", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    const result = {
        result: Math.log(num2) / Math.log(num1)
    };
    res.json(result);
});

app.post("/sin", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    // const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    const result = {
        result: Math.sin(num1)
    };
    res.json(result);
});

app.post("/cos", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    // const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    const result = {
        result: Math.cos(num1)
    };
    res.json(result);
});

app.post("/tan", function(req, res) {
    const num1 = parseFloat(req.body.num1);
    // const num2 = parseFloat(req.body.num2);
    console.log(req.body);

    const result = {
        result: Math.tan(num1)
    };
    res.json(result);
});