function button1() 
{
	var remove1 = document.getElementById("myDiv1").innerHTML;

	// removes answer from my div if <div> is not empty and changes text in button
	if (remove1 !== "")
	{

		var parent = document.getElementById("myDiv1");
		var child = document.getElementById("Answer1");
		parent.removeChild(child);

		var parent = document.getElementById("parent4");
		var child = document.getElementById("button4");
		parent.removeChild(child);

		document.getElementById("button1").setAttribute("value", "Show")
		
	}

	// adds answer from my div if <div> is empty and changes text in button
	else
	{
		let text = document.createElement("p");
		text.setAttribute("id", "Answer1")
		let answer = document.createTextNode("Python");
		text.appendChild(answer);

		let element = document.getElementById("myDiv1");
		element.appendChild(text);	
		document.getElementById("button1").setAttribute("value", "Hide")

		let button4 = document.createElement("input");
		button4.setAttribute("onclick", "closeAll()");
		button4.setAttribute("type", "button");
		button4.setAttribute("value", "Hide All");
		button4.setAttribute("id", "button4");
		var block = document.getElementById("parent4");
		block.appendChild(button4);


		// removes answer from div2 if <div> is not empty and changes text in buttons
		if (document.getElementById("myDiv2").innerHTML !== "")
		{
			var parent = document.getElementById("myDiv2");
			var child = document.getElementById("Answer2");
			parent.removeChild(child);
			document.getElementById("button2").setAttribute("value", "Show")

			var parent = document.getElementById("parent4");
			var child = document.getElementById("button4");
			parent.removeChild(child);
		}

		// removes answer from div3 if <div> is not empty and changes text in buttons
		else if (document.getElementById("myDiv3").innerHTML !== "")
		{
			var parent = document.getElementById("myDiv3");
			var child = document.getElementById("Answer3");
			parent.removeChild(child);
			document.getElementById("button3").setAttribute("value", "Show")

			var parent = document.getElementById("parent4");
			var child = document.getElementById("button4");
			parent.removeChild(child);
		}
	}
}

function button2() 
{
	var remove2 = document.getElementById("myDiv2").innerHTML;

	// adds answer from my div if <div> is empty and changes text in button
	if (remove2 !== "")
	{
		var parent = document.getElementById("myDiv2");
		var child = document.getElementById("Answer2");
		parent.removeChild(child);

		var parent = document.getElementById("parent4");
		var child = document.getElementById("button4");
		parent.removeChild(child);

		document.getElementById("button2").setAttribute("value", "Show")
	}

	// removes answer from div2 if <div> is not empty and changes text in buttons
	else
	{
		let text = document.createElement("p");
		text.setAttribute("id", "Answer2")
		let answer = document.createTextNode("Caracas, Venezuela");
		text.appendChild(answer);

		let element = document.getElementById("myDiv2");
		element.appendChild(text);	
		document.getElementById("button2").setAttribute("value", "Hide")

		let button4 = document.createElement("input");
		button4.setAttribute("onclick", "closeAll()");
		button4.setAttribute("type", "button");
		button4.setAttribute("value", "Hide All");
		button4.setAttribute("id", "button4");
		var block = document.getElementById("parent4");
		block.appendChild(button4);

		// removes answer from div1 if <div> is not empty and changes text in buttons
		if (document.getElementById("myDiv1").innerHTML !== "")
		{
			var parent = document.getElementById("myDiv1");
			var child = document.getElementById("Answer1");
			parent.removeChild(child);
			document.getElementById("button1").setAttribute("value", "Show")

			var parent = document.getElementById("parent4");
			var child = document.getElementById("button4");
			parent.removeChild(child);
		}

		// removes answer from div3 if <div> is not empty and changes text in buttons
		else if (document.getElementById("myDiv3").innerHTML !== "")
		{
			var parent = document.getElementById("myDiv3");
			var child = document.getElementById("Answer3");
			parent.removeChild(child);
			document.getElementById("button3").setAttribute("value", "Show")

			var parent = document.getElementById("parent4");
			var child = document.getElementById("button4");
			parent.removeChild(child);
		}
	}
}

function button3() 
{
	var remove3 = document.getElementById("myDiv3").innerHTML;

	// adds answer from my div if <div> is empty and changes text in button
	if (remove3 !== "")
	{
		var parent = document.getElementById("myDiv3");
		var child = document.getElementById("Answer3");
		parent.removeChild(child);

		var parent = document.getElementById("parent4");
		var child = document.getElementById("button4");
		parent.removeChild(child);

		document.getElementById("button3").setAttribute("value", "Show")
	}

	// removes answer from div2 if <div> is not empty and changes text in buttons
	else
	{
		let text = document.createElement("p");
		text.setAttribute("id", "Answer3")
		let answer = document.createTextNode("Machine Learning / Artificial Intelligence / Robotics");
		text.appendChild(answer);

		let element = document.getElementById("myDiv3");
		element.appendChild(text);	
		document.getElementById("button3").setAttribute("value", "Hide")

		let button4 = document.createElement("input");
		button4.setAttribute("onclick", "closeAll()");
		button4.setAttribute("type", "button");
		button4.setAttribute("value", "Hide All");
		button4.setAttribute("id", "button4");
		var block = document.getElementById("parent4");
		block.appendChild(button4);

		// removes answer from div1 if <div> is not empty and changes text in buttons
		if (document.getElementById("myDiv1").innerHTML !== "")
		{
			var parent = document.getElementById("myDiv1");
			var child = document.getElementById("Answer1");
			parent.removeChild(child);
			document.getElementById("button1").setAttribute("value", "Show")

			var parent = document.getElementById("parent4");
			var child = document.getElementById("button4");
			parent.removeChild(child);
		}

		// removes answer from div2 if <div> is not empty and changes text in buttons
		else if (document.getElementById("myDiv2").innerHTML !== "")
		{
			var parent = document.getElementById("myDiv2");
			var child = document.getElementById("Answer2");
			parent.removeChild(child);
			document.getElementById("button2").setAttribute("value", "Show")

			var parent = document.getElementById("parent4");
			var child = document.getElementById("button4");
			parent.removeChild(child);
		}
	}
}

// Function to close <div> if user opens another <div>
function closeAll()
{
	var remove1 = document.getElementById("myDiv1").innerHTML;
	var remove2 = document.getElementById("myDiv2").innerHTML;
	var remove3 = document.getElementById("myDiv3").innerHTML;

	// removes answer from div21 if <div> is not empty and changes text in buttons
	if (remove1 !== "")
	{
		var parent = document.getElementById("myDiv1");
		var child = document.getElementById("Answer1");
		parent.removeChild(child);

		var parent = document.getElementById("parent4");
		var child = document.getElementById("button4");
		parent.removeChild(child);

		document.getElementById("button1").setAttribute("value", "Show")
	}

	// removes answer from div2 if <div> is not empty and changes text in buttons
	if (remove2 !== "")
	{
		var parent = document.getElementById("myDiv2");
		var child = document.getElementById("Answer2");
		parent.removeChild(child);

		var parent = document.getElementById("parent4");
		var child = document.getElementById("button4");
		parent.removeChild(child);

		document.getElementById("button2").setAttribute("value", "Show")
	}

	// removes answer from div3 if <div> is not empty and changes text in buttons
	if (remove3 !== "")
	{
		var parent = document.getElementById("myDiv3");
		var child = document.getElementById("Answer3");
		parent.removeChild(child);

		var parent = document.getElementById("parent4");
		var child = document.getElementById("button4");
		parent.removeChild(child);

		document.getElementById("button3").setAttribute("value", "Show")
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