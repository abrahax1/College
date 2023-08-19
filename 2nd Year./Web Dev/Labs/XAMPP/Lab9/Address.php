<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>Address</title>

</head>

<body>
	<div>
		<h1><center>User Address</center></h1>
	</div>

	<div>
		<br><br>

		<center> 
			<form method="post">
	            <div>
	            	<label>Address</label><br>
	                <input type="text" name="Address" placeholder="Enter Address here"/>
	                <br><br>
	            </div>    

	            <div>
	            	<label>Zip</label><br>
	                <input type="text" name="Zip" placeholder="Enter Zip here"/>
	                <br><br>
	            </div>    

	            <div>
	            	<input class="button" type="submit"/>
	            </div>

	        </form>

	        <a href="Login.php">Log out</a>
		</center>

	</div>

	<?php
		session_start();

		require_once "ConnectDB.php";

		if(isset($_POST['Address']) && isset($_POST['Zip']))
		{
		    $Address  = $_POST["Address"];
		    $Zip  = $_POST["Zip"];

		}
		
		$sql = "INSERT INTO Address (Address, Zip) VALUES ('$Address', '$Zip')";

		if ($db->query($sql) === TRUE) 
                {
                    echo "<br><br>New user created";
                } 
                else 
                {
                  echo "<br><br>Error: " . $sql . "<br><br>" . mysqli_error($db);
                }

                $db->close();

	?>

</body>
</html>
