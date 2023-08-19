<!--Program to create a Student Accommodation web with different pages (this is Login page)
	Author: Abraham Izarra/ C19340801
	Date: 11/04/2021-->
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>Login</title>
	<link rel="stylesheet" href="mystyle.css?v=<?php echo time(); ?>">

</head>

<body>

	<!--TITLE-->
	<div class="topBanner">
		<h1><center id="title">Student Accommodation</center></h1>
	</div>
	
	<!--LEFT MENU-->
	<div>
		<h2>-Menu-</h2>
		<div class="vertical-menu">
			<a href="StudentAccommodation.html">Home</a>
			<a href="StudentAccommodation_OnCampusAcc.html">On Campus Accommodation</a>
			<a href="StudentAccommodation_PrivateAcc.html">Private Accommodation</a>
			<a href="FAQ.html">FAQ</a>
			<a href="Register.php" class="active" >Register/Login</a>

		</div>
	</div>

	<!--CONTENT-->
	<div class="signUp">
        <h2>Login</h2>
        <p>Please fill this form to Login.</p>
        <form action="Login.php" method="post">
            <div>
                <label>Username</label><br>
                <input type="text" name="Username" placeholder="Enter username here" required/> 
                <br><br>
            </div>    

            <div>
                <label>Password</label><br>
                <input type="password" name="Password" placeholder="Enter password here" required/>
                <br><br>
            </div>

            <div>
                <input class="button" type="submit"/>
               
            </div>

            <p>Don't have an account? <a href="Register.php">Register here!</a></p>

        </form>

    </div>    

    <div class="form">
 
		<?php

			session_start();
			require_once "ConnectDB.php";

			if(isset($_POST['Username']) && isset($_POST['Password']))
			{
			    $Username  = $_POST["Username"];
			    $Password  = $_POST["Password"];

			}

			$records = mysqli_query($db,"select * from Users where UserName='$Username' and Password='$Password'");

			while($data = mysqli_fetch_array($records))
			{
			    if(!isset($_SESSION['user_id']))
			    {
			    	$_SESSION['Username'] = $Username;
			        header('Location: User.php');
			        exit;
			    }
			    else
			    {
			    	echo "<br>Oops Something Went Wrong";
			    }

			}

			mysqli_close($db);

		?>
		
	</div>

</body>
</html>