
<html>
<head>
		<title>characterChecker</title>
		<link rel="stylesheet"  type="text/css" href="external.css">

</head>
<body>

	<h1> 
		character Checker ~ 
	</h1>

<div>

<form method ="POST" >

	Enter a Character :<input type ="text" name="ch" class="textField"><br>

	<input type="submit">

</form> 


</div><br>
		<?php 
			  
			echo"<div class=\"div php \">"; // just for styling purpose ( ignore )
			error_reporting (E_ALL ^ E_NOTICE); // To understand this line of code , open first.php.




			$char = $_POST["ch"];

			$value = ord($char);

			if($value >= 97 && $value <= 122 ){
				echo"The Entered Character is verySmall";
			}
			else if($value >= 65 && $value <=90){

				echo"The Entered Character is veryVeryBig";

			}

			else if($value >=48 && $value <= 57){

				echo"Number hai!!";
			}

			else if(($value >= 33 && $value <= 47) || ($value >= 58 && $value <= 64 ) || ($value >= 91 && $value <= 96) || ($value >=123 && $value <= 126)){
				echo"It's a outOfWorldCharacter , I mean special.";

			}

			else  if($value == 32){
				echo"Hey , lazy person. Enter a visible Character."; // If user enters a space and clicks the button. ( he is lazy , i don't know)

				}

			else{

				echo"No Input ";
			}

		

			echo"</div>";

		?> 

</body>
</html>

	


		

		
