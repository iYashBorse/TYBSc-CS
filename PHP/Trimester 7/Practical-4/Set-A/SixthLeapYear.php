<html>
<head>
	<title> To Check a year is leap year or not  </title>

	<link rel="stylesheet" type="text/css" href="external.css">
</head>
<body>
	<h1> To Check a year is leap year or not ~ </h1><br><br>
<div>	
	<form method="POST" >
	 	Enter a Year : <input type=number  name="num" class="numberTextField" placeholder="Enter a Year..."><br><br>

	 	<input type="submit" value="Check">
	</form>

</div><br><br>


<?php 

// A leap year is the one which has 366 days in a year. A leap year comes after every four years. Hence a leap year is always a multiple  of four.

// For example, 2016, 2020, 2024, etc are leap years


/*  Every year that is exactly divisible by four is a leap year, except for years that are exactly divisible by 100, but these centurial years are leap years if they are exactly divisible by 400. ... The years 1600, 2000 and 2400 are leap years, while 1700, 1800, 1900, 2100, 2200 and 2300 are not leap years.
*/


error_reporting (E_ALL ^ E_NOTICE); // just to avoid a notice



$year = $_POST["num"];


if($year != NULL) { // Just to avoid printing of default value when loading the page for firstTime.
        echo "<div id=\"div1\" >"; 



                       if( (  $year % 4 == 0 ) and ($year % 100 != 0) or ($year % 400 == 0) )  
                            {  
                            echo"$year is a Leap Year";   
                            } 
                       else  
                            {  
                            echo "$year is not a Leap Year";    
                            }  
            echo"</div>";  
}
?>
</body>
</html>