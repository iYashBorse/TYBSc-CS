<html>
<head>
	<title>Factorial of a Number </title>
	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>

	<h1>Factorial of a Number  ~</h1><br>
		<div>
				<form method ="POST" >

					Number : <input type =number name="txtNumber" class="numberTextField">

					<input type="submit" value="Calculate">
				</form>
		</div><br><br>


<?php


	error_reporting (E_ALL ^ E_NOTICE); // to understand this line of code , check firstNumberCheck.php or remove this line and check.



        echo"<div class=\" div php\">";  // just for styling purpose ( ignore )

$number = $_POST["txtNumber"];  

if($number != NULL) // just to avoid some default value printing while loading the page.
{



		$factorial = 1; // 1   not  0  or you know.


		for ($i=$number; $i>=1; $i--)
		{
		    $factorial = $factorial * $i;
		}

		echo"The factorial of $number is : ",$factorial;
}

echo "</div>";


?>



</body>
</html>



