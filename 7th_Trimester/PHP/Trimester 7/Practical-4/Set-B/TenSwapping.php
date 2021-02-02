<html>
<head>
	<title> Swapping two numbers </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1>Swapping Two numbers ~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Number 1 : <input type=number  name="num1" class="numberTextField" placeholder="Enter a number..."><br><br>
	 	Number 2 : <input type=number  name="num2" class="numberTextField" placeholder="Enter a number..."><br><br>
	
	 	<input type="submit" value="Find">
	</form>

</div><br><br>


<?php 



error_reporting (E_ALL ^ E_NOTICE);



$number1 = $_POST["num1"];
$number2 = $_POST["num2"];

if($number1 && $number2 != NULL){
	echo"<div class=\"div php\">";

echo"Before Swapping:<br> ";
echo "<br>Number one : $number1"," &nbsp;&nbsp;", " Number two : $number2"; 

echo"</div> <br><br>";

$temp = $number1;
$number1 = $number2;
$number2 = $temp;

echo"<div class=\"div php\"> "; // ignore this just for styling purpose . 
echo"After Swapping:<br> ";

echo "<br>Number one : $number1"," &nbsp;&nbsp;", " Number two : $number2";
}
echo"</div>";


?>
</body>
</html>