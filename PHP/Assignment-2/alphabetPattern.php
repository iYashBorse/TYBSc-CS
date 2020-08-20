<html>
<head>
	<title>Alphabet Pattern</title>
	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>

  			<h1 >Alphabet Pattern</h1><br>
  			<div>
				<form method ="POST" >

					Enter The Size of the Pattern (1-26) : <input type =number  name="txtNumber" class="numberTextField">	<br><br>
									
					<input type="submit" value="Show">
				</form>

			</div><br><br>

<?php

			error_reporting (E_ALL ^ E_NOTICE); // to understand this line of code , check firstNumberCheck.php or remove this line and check.

			echo "<div class=\"div php\">"; // just for  styling purpose (i gnore )

					$userRange = $_POST["txtNumber"];
			
						$alpha = range('A', 'Z');  

						// The range() function creates an array containing a range of elements.
						// The  function returns an array of elements from low to high.
						// Like in this  range('A','Z') returns an array ( value ) like 0 , 1 ,2 ,3 each  with a value . 0 = A , 1 = B and so on.

						// So to manually control our program pattern size  , user can  enter a range which we used in our outer-for-loop .
						// The same program for to display little little  alphabets , just replace 'A' to 'a' & 'Z' to 'z' in range() function.




						for($i=0; $i<$userRange; $i++){  

						  for($j=0; $j<=$i; $j++){  

						    echo $alpha[$j];  
						    }  
						    echo "<br>";  
						}
	    
			echo "</div>";

?>

</body>
</html>

