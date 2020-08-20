<html>
<head>
	<title>Number Pattern 1</title>
	<link rel="stylesheet"  type="text/css" href="external.css">

</head>
<body>
		<div>
  			<h1>Number Pattern ~ </h1>
				<form method ="POST" >

					Number : &nbsp; <input type ="text" name="txtNumber" class="numberTextField"><br><br>
					
					<input type="submit" value="Show">
				</form>
		</div><br><br>



<?php


				error_reporting (E_ALL ^ E_NOTICE); // just to avoid a notice using this line of code.( Remove it and understand )

				echo "<div class=\"div php \">"; // ignore  , just for styling purpose

		
				$number = $_POST["txtNumber"];


						for($a=$number; $a>=1; $a--)
						{
						 // inner loop handles  columns

						for($b=1; $b<=$a; $b++)
						{
						echo $b;
						}
						echo "<br>";
						}


							for ($a = 2; $a <= $number; $a++) // a = 2  , as we  want 1 common. ( check the pattern )
							{

							for($b = 1; $b <= $a; $b++ )
							{

							echo $b;
							}

							echo "<br>";
							}


			    echo "</div>"; // ignore this line 
	    


?>

</body>
</html>

