
<html>
<head>
	<title>gradeCalculator ~</title>
		<link rel="stylesheet"  type="text/css" href="external.css">

</head>
<body>

	<h1>
			 gradeCalculator 
	</h1>
<div>
<form method ="POST" >

	percentage :<input type ="text" name="per" class="numberTextField"><br><br>



 <br><input type="submit">

</form>
</div><br><br>
			<?php 
			  
			 
		
			error_reporting (E_ALL ^ E_NOTICE); // To learn more about this line of code , open first.php

			echo"<div class=\"div php \">"; // just for styling  purpose ( ignore )






			$percent = $_POST["per"];
			$value = ord($percent);

			if($value >= 48  &&  $value <= 57){



			if($percent  >= 90 && $percent  <= 100){

				echo"A ,  you shouldn't be studying. And others envy you.";

				}

			else if($percent  >= 70 && $percent <= 90){
				echo"B ,  you did well";
			}

			else if($percent  >= 60 && $percent  <= 70){
				echo"C , GoodJob";

			}

			else if($percent >= 45 && $percent  <= 60){
				echo"D , youShouldHaveStudied";
			}

			else if($percent >= 34 && $percent  <= 45){
				echo"Pass ,   youShouldBeLucky";
			}
			else if ($percent < 34){
				echo"Fail , stop mourning. ";
			}
			else{

				echo"Invalid input (you don't know what percentage is , haa)"; //if user enters value excluding ( 1 to 100)
			}

			}

			else
			echo"No Input / Invalid Input";

			echo"</div>";
			?> 

</body>
</html>

	


		

		
