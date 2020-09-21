<html>
<body>
	<form name="fromnme" method= "get">
	Enter a string : <input type ="text" name ="txtn">
	<br>operations: ;
	<select name = "op">
		<option value ="1"> Count the number of Vowels </option>
		<option value ="2"> Count the number of Consonents </option>
		<option value ="3"> Count the number of Digits </option>
		<option value ="4"> Return the number of Words </option>
		<option value ="5"> Return the number of Characters </option>
		<option value ="6"> Reverse of the string </option>
	</select>
	<br><input type ="submit">
</form>
</body>
</html>

<?php
	$n =$_GET["op"];
	$a =$_GET["txtn"];
	switch($n)
	{
		case 1: $pat ="/[aeiou]/i";
			$b = preg_match_all($pat,$a);
			echo "The number of vowels is ",$b;
		break;
			case 2: $pat2 = "/[^aeiou ]/i";
			$c = preg_match_all($pat2,$a);
			echo "The number of consonents is ",$c;
		break;
		case 3: $pat ="/[0-9]/i";
			$b = preg_match_all($pat,$a);
			echo "The number of digits is ",$b;
		break;
		case 4: $b = str_word_count($a);
			echo "The number of words is ",$b;
		break;
		case 5: $b = str_word_count($a);
			$l = strlen($a);
			echo "The number of characters is ",$l-$b+1;
		break;
		case 6: echo "the reverse of the string is ",strrev($a);
		break;
	}
?>
