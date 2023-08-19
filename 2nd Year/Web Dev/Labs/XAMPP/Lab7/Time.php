<!--Program to test html forms sending values to php-->
<!DOCTYPE html>
<html>
    <body>
		<!-- Q3 FORM -->
		<form action="Time.php" method="get">
            Time: <input type="time" name="Time"/>
			<input type="submit" />
		</form>

    	<?php
    		// Q3 FUNCTION
    		$Time = $_GET["Time"];

    		function Greetings($Time)
    		{
    			if ($Time < 12)
                {
                    echo "Good Morning " . $Time;
                }
                else if ($Time > 12)
                {
                    echo "Good Evening " . $Time;
                }
    		}

    		Greetings($Time);
    	?>

    </body>
</html>
