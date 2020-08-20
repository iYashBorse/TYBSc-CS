<?php
 

$name = $_POST["txtname"]; 
$add = $_POST["tex"];
$gender = $_POST["rad"];
$pr= $_POST["check"];
$coll = $_POST["college"];

	
		printf("<br>Student Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :~"); echo " " ,$name; 
		printf("<br>Student Address &nbsp;  :~"); echo " ", $add; 
		printf("<br>Student Gender &nbsp;&nbsp;&nbsp;  :~ "); echo $gender;
		printf("<br>College &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; :~ "); echo " ",$coll;
		printf("<br>Programming Langauges &nbsp;&nbsp; :~ &nbsp;"); 

foreach($pr as $v){ // As User can  select multiple values in checkBox so we are using foreach or you can use print_r or "for" also.

	echo $v, ", "; 
}



?>
</td></tr>
