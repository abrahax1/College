<!--Program to test html forms sending values to database using php-->
<!DOCTYPE html>
<html>
    <body>
		<!-- FORM -->
		 <form action="FormToDatabase.php" method="post">
            UserName:  <input type="text" name="UserName"/>
            Password:  <input type="text" name="Password"/>
            FirstName: <input type="text" name="FirstName"/>
            LastName:  <input type="text" name="LastName"/>
            Age:       <input type="text" name="Age"/>

            <input type="submit" />
        </form>

    	<?php
    		// Q3 FUNCTION
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "Lab8";

            // CREATE CONNECTION 
            $conn = new mysqli($servername, $username, $password, $dbname);

            // CHECK CONNECTION
            if ($conn->connect_error)
            {
                die("Connection failed: " . $conn->connect_error);
            }
            else
            {
                echo "Connected Successfully";
            }

            require_once "FormToDatabase.php";
            if(isset($_POST['UserName']) && isset($_POST['Password']) && isset($_POST['FirstName']) & isset($_POST['LastName']) && isset($_POST['Age']))
            {
                $UserName  = $_POST["UserName"];
                $Password  = $_POST["Password"];
                $FirstName = $_POST["FirstName"];
                $LastName  = $_POST["LastName"];
                $Age       = $_POST["Age"];

                $sql = "INSERT INTO User (UserName, Password, FirstName, LastName, Age )  
                        VALUES ('$UserName', '$Password', '$FirstName', '$LastName', '$Age')";

                if ($conn->query($sql) === TRUE) 
                {
                    echo "<br>New user created";
                } 
                else 
                {
                  echo "<br>Error: " . $sql . "<br>" . mysqli_error($conn);
                }

                $conn->close();
            
            }

    	?>

    </body>
</html>
