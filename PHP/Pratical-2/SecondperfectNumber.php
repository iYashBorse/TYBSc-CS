<html>
<head>
	<title>Perfect Number Check </title>
	<link rel="stylesheet"  type="text/css" href="external.css">

</head>
<body>

	<h1> Perfect Number Check ~ </h1>
	<h6> And people say nothing is perfect </h6>
		<div>
				<form method ="POST" >

					Number : <input type =number name="txtNumber" class="numberTextField">


				 <br><br>
					<input type="submit" value="Check">
				</form>
		</div><br><br>


<?php
// To know what is perfect number & it's logic, check the Java Directory ( perfectNumber program )

	error_reporting (E_ALL ^ E_NOTICE); // To understand this line of code ,  open the firstNumberCheck.php


echo "<div class=\" div php \">";



if($_POST)

{
//get the post value from form

	$number = $_POST["txtNumber"]; // You can place  this line outisde of  "if" statement ( it will work ) 
	$i = 1;
	$sum=0;
	while ($i < $number) {

		if ($number % $i == 0) {
		$sum = $sum + $i;
		}

		$i++;

	}


	if($number == $sum){
	printf("The number %d  is a perfect Number.", $number);
	}

	else{
	printf("The number %d  is not a  perfect Number.", $number);
	}

}

echo "</div>";


?>



</body>
</html>



