q1- Write a menu driven program to perform the following operations on an indexed array:
    i. Replace one array with another array
    ii. Find reverse of an array
    iii. Display array elements from 2nd index
     iv. Display two array elements from 3rd index.
     v.  Removes the duplicate values from array





<html>
<body>
	<form name="frmname" method="post" action="11A1.php">
		Enter your choice: <select name="ch">
							<option value="1" name="ch">Replace one array with another array</option>
							<option value="2" name="ch">Reverse of array</option>
							<option value="3" name="ch">Display array elements from 2nd index</option>
							<option value="4" name="ch">Display two array elements from 3rd index</option>
							<option value="5" name="ch">Remove Duplicate values from array</option>
						</select> <br>
		<input type="submit" name="sub">
	</form>
</body>
</html>


<?php
$ch = $_POST['ch'];
$arr1 = array(1,2,2,3,3,4);
$arr2 = array(7,8,9,10,11,12);

switch ($ch) 
{
		case 1: print_r(array_replace($arr1,$arr2));
				break;

		case 2:	print_r(array_reverse($arr1));
				break;

		case 3: print_r(array_slice($arr1,2));
				break;

		case 4: print_r(array_slice($arr1,3,2,true));
				break;

		case 5: print_r(array_unique($arr1));
				break;
}
?>
</body>
</html>
