$("#btnSum").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/sum", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnSub").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/sub", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnMult").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/mult", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnDiv").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/div", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnMod").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/mod", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnExp").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/exp", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnRoot").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/root", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnLog").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/log", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnSin").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        // num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/sin", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnCos").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        // num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/cos", data);

    post.done(handleDone);
    post.fail(handleFail);
});

$("#btnTan").click(function () {
    const data = {
        num1: $("#num1")[0].value,
        // num2: $("#num2")[0].value,
    };
    console.log(data);
    const post = $.post("http://localhost:3000/tan", data);

    post.done(handleDone);
    post.fail(handleFail);
});

function handleDone(response, status, xhr) {
    const result = response.result;
    $(`<div>${result}</div><a href='/'>Clear</a>`).insertAfter("#mainForm");
}

function handleFail(response, status, xhr) {
    $(`<div>Error!</div><a href='/'>Clear</a>`).insertAfter("#mainForm");
}