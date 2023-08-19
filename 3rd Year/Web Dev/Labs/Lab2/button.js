function button1() 
{
	let x1 = document.getElementById("myDiv1");
	var elem1 = document.getElementById("button1");

	if (x1.style.display === "block")
	{
		x1.style.display = "none";
		if (elem1.value=="Hide") elem1.value = "Show";
	}
	else
	{
		x1.style.display = "block"
		if (elem1.value=="Show") elem1.value = "Hide";
	}

}

function button2() 
{
	let x2 = document.getElementById("myDiv2");
	var elem2 = document.getElementById("button2");

	if (x2.style.display === "block")
	{
		x2.style.display = "none";
		if (elem2.value=="Hide") elem2.value = "Show";
	}
	else
	{
		x2.style.display = "block"
		if (elem2.value=="Show") elem2.value = "Hide";
	}
}

function button3() 
{
	let x3 = document.getElementById("myDiv3");
	var elem3 = document.getElementById("button3");

	if (x3.style.display === "block")
	{
		x3.style.display = "none";
		if (elem3.value=="Hide") elem3.value = "Show";
	}
	else
	{
		x3.style.display = "block"
		if (elem3.value=="Show") elem3.value = "Hide";
	}

}

function swapStyleSheet(sheet)
{
	if (sheet == "Creative.css")
	{
		document.getElementById("Style").setAttribute("href", "Creative.css");
		document.getElementById("swapButton").setAttribute("value", "Change to Professional")
		document.getElementById("swapButton").setAttribute("onClick", "swapStyleProfessional()")

	}
	if (sheet == "Professional.css")
	{
		document.getElementById("Style").setAttribute("href", "Professional.css");
		document.getElementById("swapButton").setAttribute("value", "Change to Creative")
		document.getElementById("swapButton").setAttribute("onClick", "swapStyleCreative()")
	}

}

function swapStyleProfessional()
{	
		swapStyleSheet("Professional.css")
}

function swapStyleCreative()
{
	swapStyleSheet("Creative.css")
}