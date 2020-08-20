
<html>
<head>
	<title>DivisibilityOf5</title>
	<link rel="stylesheet"  type="text/css" href="external.css">



</head>
<body>

	<h1> 
		To Check aNumber is Divisble by 50  or not

	</h1><br><br>


<div>

<form method="POST">

	Number :<input type =number name="num" class="numberTextField"><br>

 <br><br><input type="submit">

</form>

</div><br><br>


			<?php 


			error_reporting (E_ALL ^ E_NOTICE);
			// To understand this line of code open first.php



			echo"<div class=\"div php\">"; 
			$number = $_POST["num"];

			if($number % 5 == 0)
			{

				echo"The number is divisible by 5  , ";

				if($number % 10 == 0 )
				{
					echo"and also divisible by 10";
				}
				else
				{
					echo"not by 10.";
				}
			}
			else 
			{
				echo"Not divisible by 5 . ";
			}

			echo"</div>";

			?> 


</body>
</html>

	


		

		



