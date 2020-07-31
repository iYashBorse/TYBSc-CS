<html>
<!-- Ask user for percentage and display grade for it. -->
<head><title>gradeCalculator</title></head>
<body bgcolor="beige">
	<h1 align="center"> gradeCalculator-4th-Program </h1>
<form method ="POST" >
	percentage :<input type ="text" name="per"><br><br>
 <br><br><input type="submit">
</form>
<?php

$percent = $_POST["per"];
$value = ord($percent);

if($value >= 48  &&  $value <= 57){			//checks whether user has given a number type value.

	if($percent  >= 90 && $percent  <= 100){

		echo"A ,  you shouldn't be studying. ";

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
			echo"Invalid input"; //if user enters value excluding ( 1 to 100)
		}
}
else
	echo"InvalidInput";
?>
</body>
</html>
