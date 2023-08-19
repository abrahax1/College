<!--Program to create a Student Accommodation web with different pages (this is Login page)
	Author: Abraham Izarra/ C19340801
	Date: 11/04/2021-->
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>User</title>
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
			<a href="#" class="active" >User</a>

		</div>
	</div>

	<!--CONTENT-->
	<div class="signUp">
        <table border="2">
			<tr>
				<td>Username</td>
				<td>Full Name</td>
				<td>Surname</td>
				<td>Email</td>
	   			<td>Password</td>
			</tr>

    </div>    

    <!--SHOW USER INFO-->
    <div class="form">
 
		<?php
			session_start();

			require_once "ConnectDB.php";

			$Username = $_SESSION['Username'];

			$records = mysqli_query($db,"select * from Users where UserName='$Username' ");

			while($data = mysqli_fetch_array($records))
			{
				?>
				  <tr>
				    <td><?php echo $data['UserName']; ?></td>
				    <td><?php echo $data['FirstName']; ?></td>
				    <td><?php echo $data['Surname']; ?></td>
				    <td><?php echo $data['Email']; ?></td>
				    <td><?php echo $data['Password']; ?></td>
				  </tr>	
				<?php
			}

			mysqli_close($db);

		?>

	</table>
	</div>

	<div class="button2">
		<form action="Delete.php">
    		<input type="submit" value="DELETE USER!" />
		</form>

	</div>

	<br><br>
	<div class="button3">
		<form action="Update.php">
    		<input type="submit" value="Update user" />
		</form>

	</div>

</body>
</html>