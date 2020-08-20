<?php


// Don't get intimidated  by looking up the code , it's easy just messy due to the design part. 


echo"	<link rel=\"stylesheet\" type=\"text/css\" href=\"external.css\"> "; // As table is styled using external CSS so importing it
																			 // And to separate extra  " " quotation  marks using the "backward slash"

// Retrieving all the values from html form & assigning  them to  php Variables
// You can directly use "$_POST["firstName"]"  any where instead of assigning  to a VAR but  it would  very difficult and messy to re-use.

 $first = $_POST["firstName"];
 $second =$_POST["secondName"];
 $third = $_POST["thirdName"];
 $roll1 = $_POST["rollNumber1"];
 $roll2 = $_POST["rollNumber2"];
 $roll3 = $_POST["rollNumber3"];

// As there are multiple values  so storing these values in the arrays for displaying & sorting  purpose , again you could use directly the $_POST  inside the array but this is more convenient so.



$studentName = array($first , $second ,  $third);
$rollNumber  = array($roll1 ,  $roll2 ,  $roll3);

$n=count($studentName); // calculating the number of  values in the array for further use in loops.


// To Use  HTML tags in PHP  you can use multiple ways one is inside echo 
// One is separating each php code & html code , eg :    <tr>   <?php  echo $value; ? >    </tr>

echo"<br><br><center>Before Sorting :</center><br>"; // center tag  to align the following line in center of the page.


// representing data in tabular form

echo"

<center>
 <table>  
 <tr>
 <th>Student Name :</th>
 <th>Student Roll :</th>
 </tr> " ;

//  'for' loop to go through the both the arrays and printing our first unsorted table.
 for($i = 0 ; $i < $n ; $i++){

   echo"
   			<tr>
   			<td> $studentName[$i] </td>
   			<td>$rollNumber[$i]</td>
   			</tr>";
 } 


 echo "</table></center><br><br>"; // closing the first unsorted table and center tag .


// Sorted table 

 echo "<center><br><br>After Sorting by Roll No :<br></center><br>";
 
 // You could have used sort() function with one line of code but sir' told without built InFunction so    ( sorry !)
 
 for($i=0; $i<$n-1; $i++){//first element ( i.e roll Number ) in the array & n-1 because count() func counts from 1 and  we are looking in array so.

	 for($j=$i+1; $j<$n; $j++){//second element ( i.e roll Number ) in the array 

			 if($rollNumber[$i] > $rollNumber[$j]){ // if first element  is greater than the second 
			 
					 $t=$rollNumber[$i];     // storing first roll Number in a different variable
					 $t1 = $studentName[$i]; // storing first Name  in a different variable
					 
					 $rollNumber[$i]=$rollNumber[$j]; // if first element is > than second then , feeding the first element with the value of the 
					 								  //   second element
					 $studentName[$i]=$studentName[$j]; // same with name , ( I don't know exchanging is a correct word to use )
					 
					 $rollNumber[$j]=$t; // And now , again giving back our first element's value  ( stored previously in "$t" ) to the second element.
					 $studentName[$j]=$t1; // same here .
	         }
     }// end of second "for" loop
 } // end of first "for" loop


 echo"<center>

 <table> 
 <tr>
 <th>Student Name</th>
 <th>Student Roll</th>
 </tr> ";

 for($i = 0 ; $i < $n ; $i++){
 echo" <tr>
 				<td> $studentName[$i] </td> 
 				<td> $rollNumber[$i] </td> 


 	   </tr>";
 
 } // end of for loop 


 echo "</table></center>";   // closing the  second table's tag. 


?> 