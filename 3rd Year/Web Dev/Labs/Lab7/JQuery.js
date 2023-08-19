document.title = "Resume";

// Text Section
$('#subTitles').append('<h2></h2>'); 
$("h2").attr('id', 'h2');
$("#h2").text("Abraham Izarra");

$('#subTitles').append('<h3></h3>'); 
$("h3").attr('id', 'h3');
$("#h3").text("Summary");

$('#resume').append('<p></p>'); 
$("p").attr('id', 'p');
$("#p").text("I am currently studying Computer Science, I believe we construct the future and shape the outcome of how it will look " + 
		      "My objective is to develop AI Robotics and design different technologies to benefit our society " +
		      "I am a very hard working person, I am prepared to learn as much as I can to be successful. " +
		      "I have excellent communication skills and I am able to communicate with all different levels of people.");

// List Section
$('#list').append('<h3>Work Experience</h3>'); 

$('#list').append('<ul id="ul1"></ul>');

	$('#ul1').append('<li id="jobs">Jobs</li>');
		$('#ul1').append('<ul id="ul2"></ul>');
			$('#ul2').append('<li><a href="https://ecomm365.com" target="_blank">eCOMM Merchant Solutions 2020 - Currently</a></li>');
			$('#ul2').append('<li><a href="https://www.buildingsofireland.ie/buildings-search/building/13316028/dean-egan-library-ballymahon-county-longford" target="_blank"</a>Dean Egans</li>');
			$('#ul2').append('<li><a href="https://www.exceldentalpractice.ie" target="_blank">Excel Dental Practice 2016 - 2016</li>');
			

	$('#ul1').append('<br><li id="Plang">Programming Languages</li>');
		$('#ul1').append('<ul id="ul3"></ul>');
			$('#ul3').append('<li>C, C++</li>');
			$('#ul3').append('<li>Pyhton</li>');
			$('#ul3').append('<li>Java</li>');
			$('#ul3').append('<li>HTML/CSS</li>');
			$('#ul3').append('<li>Currently learning C#</li>');
			
	$('#ul1').append('<br><li id="Hobby">Hobbies</li>');
		$('#ul1').append('<ul id="ul4"></ul>');
			$('#ul4').append('<li>Piano</li>');
			$('#ul4').append('<li>Photoshop</li>');
			$('#ul4').append('<li>Photography</li>');

// Table Section
$('#table').append('<table id="table1"></table>'); 
	$('#table1').append('<tr id="1stRow"></>');
		$('#1stRow').append('<th>Education</th>');
		$('#1stRow').append('<th>Year</th>');
		$('#1stRow').append('<th>Grade</th>');

	$('#table1').append('<tr id="2ndRow"></>');
		$('#2ndRow').append('<td><a href="https://mercyballymahon.ie" target="_blank">Mercy secondary school</td></a>');
		$('#2ndRow').append('<td>Leaving Cert</td>');
		$('#2ndRow').append('<td>65%</td>');

	$('#table1').append('<tr id="3rdRow"></>');
		$('#3rdRow').append('<td><a href="https://www.tudublin.ie" target="_blank">Technological University Dublin</td></a>');
		$('#3rdRow').append('<td>1st year</td>');
		$('#3rdRow').append('<td>70%</td>');

	$('#table1').append('<tr id="4thRow"></>');
		$('#4thRow').append('<td><a href="https://www.tudublin.ie" target="_blank">Technological University Dublin</td></a>');
		$('#4thRow').append('<td>2nd year</td>');
		$('#4thRow').append('<td>75%</td>');

// Bottoms Section
$('#parent1').append('<p id="Question">What is your favourite programming language</p>');
$('#parent1').append('<input onclick="button1()" type="button" value="Show" id="button1"></input>');
$('#parent1').append('<div id="myDiv1"></div>');

$('#parent2').append('<p id="Question">Where are you from</p>');
$('#parent2').append('<input onclick="button2()" type="button" value="Show" id="button2"></input>');
$('#parent2').append('<div id="myDiv2"></div>');

$('#parent3').append('<p id="Question">What do you want to do in the future</p>');
$('#parent3').append('<input onclick="button3()" type="button" value="Show" id="button3"></input>');
$('#parent3').append('<div id="myDiv3"></div>');

$('#buttons').append('<input onclick="swapStyleCreative()" type="button" value="Change style" id=swapButton></input>');


