



<html>
<head>
	<title>AreaOfCircle</title>
	<link rel="stylesheet"  type="text/css" href="external.css">


</head>
<body>

	<h1>Calculate AreaOfCirle ~<br><br></h1>
<div>
<form method ="POST" >

	Radius :<input type ="text" name="rad" class="numberTextField">
	
 <br><br><input type="submit">

</form>
</div><br>



		

			<?php 
			error_reporting (E_ALL ^ E_NOTICE);


			define("pi","3.14"); // constant defined

			$radius = $_POST["rad"]; // retrieving value from the  htmlForm
			echo"<div class=\"div php\">"; // for styling purpose
			echo"Output:<br> ";


			echo"<br> Radius  is : ",$radius;
			echo"<br> Pi is : ",pi;
			$area= pi * $radius * $radius;
			echo"<br> AreaOfCircle  is : ",$area;


			echo"</div>";
			?> 


</body>
</html>

	


		

