
<html>
<head>
	<title>SimpleInterest ~</title>
	<link rel="stylesheet"  type="text/css" href="external.css">
</head>

<body>

	<h1>  Calculate Simple Interest ~ <br><br><br></h1>
<div>
<form method ="POST" >
	

	Principle :<input type=number name="principle" class="numberTextField"><br><br>
	Rate      :<input type=number name="rate" class="numberTextField"><br><br>
	Time      :<input type=number name="time" class="numberTextField">



 <br><br><input type="submit" value="Calculate">

</form>
</div><br><br>
			<?php 




			// Just to avoid a notice message ,so using the below line of code . ( if you know then ignore )

			error_reporting (E_ALL ^ E_NOTICE);
			//  “Notice: Undefined index”  
			//  https://www.stechies.com/undefined-index-error-php/
			// This error means that within your code, there is a variable or constant that has no value assigned to it. 
			// But you may be trying to use the values obtained through the user form in your PHP code

			// You can also use  like ~   isset($_POST["prin"]);  to each  value obtained from HTML form.
			// to better  understand ,  read from the link provided




			$pr = $_POST["principle"];
			$r = $_POST["rate"];
			$t  = $_POST["time"];

			echo"<div class=\"div php\">";
			echo"Output:<br> ";
			echo"<br> Principle is : ",$pr;
			echo"<br> Rate is : ",$r;

			echo"<br> Time is : ",$t;


			$si = ($pr * $t * $r)/100;

			echo"<br> SimpleInterest  is : ",$si;
			echo"</div>";


			?> 
</body>
</html>

	


		

		


