<html>
	<body>
	<form name="frmname" method="post">
	Select your choice: ;
	<select name = "op">
			<option value ="1"> Sum of array elements </option>
			<option value ="2"> Product of array elements </option>
			<option value ="3"> Sort the array elements in ascending order </option>
			<option value ="4"> Sort the array elements in descending order </option>
			<option value ="5"> Removes the duplicate values from array </option>
	</select>
	<br><input type="submit" value="submit">
	</form>
	</body>
	</html>


	<?php
	$ch = $_POST['op'];
	$arr = array(10,9,13,12,10);
	switch ($ch)
{
	case '1': $sum = 0;
			  $num = array(10,20,30,40);
			  for($i=0;$i<count($num);$i++)
			  {
			  	$sum = $sum+$num[$i];
			  }
			  printf("%d",$sum);
			  break;

	case '2': $prr = 1;
			  $num = array(1,2,3,4);
			  for($i=0;$i<count($num);$i++)
			  {
			  	$prr = $prr*$num[$i];
			  }
			  printf("%d",$prr);
			  break;

	case '3': sort($arr);
			  print_r($arr);
			  break;
	case '4': rsort($arr);
			  print_r($arr);
			  break;

	case '5': $s = array(10,9,13,12,10);
			  $t = array_unique($s);
			  print_r($t);
			  break;
	default :  echo "Invalid Choice";
			  break;
	}
	?>
