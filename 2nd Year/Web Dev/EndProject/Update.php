<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>UpdateUser</title>
	<link rel="stylesheet" href="mystyle.css?v=<?php echo time(); ?>">

</head>

<body>
	<!--TITLE-->
	<div class="topBanner">
		<h1><center id="title">User Details</center></h1>
	</div>
	
	<!--LEFT MENU-->
	<div>
		<h2>-Menu-</h2>
		<div class="vertical-menu">
			<a href="StudentAccommodation.html">Home</a>
			<a href="StudentAccommodation_OnCampusAcc.html">On Campus Accommodation</a>
			<a href="StudentAccommodation_PrivateAcc.html">Private Accommodation</a>
			<a href="FAQ.html">FAQ</a>
			<a href="#" class="active">User</a>

		</div>
	</div>

	<!--CONTENT-->
	<div style="position: absolute; top:12%; right:46%;" class="signUp">
		<center>
	        <form action="Update.php" method="post">

            <div>
            	<label>New Username</label><br>
                <input type="text" name="NewUserName" placeholder="Enter New Username Here"/>
                <br><br>
            </div>    

            <div>
            	<input class="button" type="submit"/>
           
            </div>

	        </form>
	    </center>
    </div>    

	<div class="form">
		<?php  
			session_start();

			require_once "ConnectDB.php";

			$Username = $_SESSION['Username'];
			$NewUserName = $_POST['NewUserName'];

			mysqli_query($db,"Update Users set UserName = '$NewUserName' where UserName='$Username'");

			mysqli_close($db);

			if(isset($NewUserName))
			{
				header('Location: Login.php');
				exit;
			}

		?>
	</div>

</body>
</html>