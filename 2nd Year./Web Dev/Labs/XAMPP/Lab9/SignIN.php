<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>Login</title>

</head>

<body>
	<div>
		<h1><center>Please Login</center></h1>
	</div>

	<div>
		<br><br>

		<center>
			<?php
				if (isset($_SESSION["error"]) ) 
				{
					echo('<p style="color:red">Error:'.$_SESSION["error"]."</p>\n");unset($_SESSION["error"]);
				}
			?>

			<form method="post">
	            <div>
	            	<label>Username</label><br>
	                <input type="text" name="Username" placeholder="Enter Username here"/>
	                <br><br>
	            </div>    

	            <div>
	            	<label>Password</label><br>
	                <input type="text" name="Password" placeholder="Enter Password here"/>
	                <br><br>
	            </div>    

	            <div>
	            	<input class="button" type="submit"/>
	            </div>

	        </form>
			
		</center>

	</div>

	<?php
		session_start();
		require_once "ConnectDB.php";

		if(isset($_POST['Username']) && isset($_POST['Password']))
		{
		    $Username  = $_POST["Username"];
		    $Password  = $_POST["Password"];

		}

		$records = mysqli_query($db,"select * from User where Username='$Username' and Password='$Password'");

		if(isset($Username) && isset($Password) )
		{
			$_SESSION["Username"] = $_POST["Username"];            
			$_SESSION["success"] = "Logged in.";            
			header('Location: Address.php' );            
			return;    
		}
		else
		{
			$_SESSION["error"] = "Incorrect password.";                       
			return;  
			
		}

	?>

</body>
</html>
