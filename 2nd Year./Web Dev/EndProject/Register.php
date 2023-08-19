<!--Program to create a Student Accommodation web with different pages (this is Register page)
	Author: Abraham Izarra/ C19340801
	Date: 04/04/2021-->
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8">
	<title>Sign up</title>
	<link rel="stylesheet" href="mystyle.css?v=<?php echo time(); ?>">

</head>

<body>

	<!--TITLE-->
	<h1><center id="title">Student Accommodation</center></h1>
	
	<!--LEFT MENU-->
	<div>
		<h2>-Menu-</h2>
		<div class="vertical-menu">
			<a href="StudentAccommodation.html">Home</a>
			<a href="StudentAccommodation_OnCampusAcc.html">On Campus Accommodation</a>
			<a href="StudentAccommodation_PrivateAcc.html">Private Accommodation</a>
			<a href="FAQ.html">FAQ</a>
            <a href="#" class="active" >Register/Login</a>

		</div>
	</div>

	<!--CONTENT-->
	<div class="signUp">
        <h2>Sign Up</h2>
        <p>Please fill this form to create an account.</p>
        
        <form action="Register.php" method="post">
            <span> * required field</span><br><br>

            <div>
                <label>Username</label><br>
                <input type="text" name="UserName" placeholder="Enter username here" required/><span>*</span>
                <br><br>
            </div>    

            <div>
                <label>First Name</label><br>
                <input type="text" name="FirstName" placeholder="Enter first name here" required/><span>*</span>
                <br><br>
            </div>

            <div>
                <label>Surname</label><br>
                <input type="text" name="Surname" placeholder="Enter surname here" required/><span>*</span>
                <br><br>
            </div>

            <div>
                <label>Email</label><br>
                <input type="email" name="Email" placeholder="Enter email here" required/><span>*</span>
                <br><br>
            </div>

            <div>
                <label>Password</label><br>
                <input type="password" name="Password" placeholder="Enter password here" required/><span>*</span>
                <br><br>
            </div>

            <div>
                <input class="button" type="submit"/>
               
            </div>

            <p>Already have an account? <a href="Login.php">Login here</a>.</p>

        </form>
    </div>    

    <div class="form">

        <?php 
            require_once "ConnectDB.php";

            if(isset($_POST['UserName']) && isset($_POST['FirstName']) && isset($_POST['Surname']) & isset($_POST['Email']) && isset($_POST['Password']))
            {
                $UserName  = $_POST["UserName"];
                $FirstName = $_POST["FirstName"];
                $Surname   = $_POST["Surname"];
                $Email     = $_POST["Email"];
                $Password  = $_POST["Password"];
                
                $sql = "INSERT INTO Users (UserName, FirstName, Surname, Email, Password)  
                        VALUES ('$UserName', '$FirstName', '$Surname', '$Email', '$Password')";

                if ($db->query($sql) === TRUE) 
                {
                    echo "<br><br>New user created";
                } 
                else 
                {
                  echo "<br><br>Error: " . $sql . "<br><br>" . mysqli_error($db);
                }

                $db->close();
            
            }

        ?>
    </div>

</body>
</html>