<?php
	$s = "NITIN";
  $stack = array();
	for($i=0;$i<strlen($s);$i++)
	{
		array_push($stack,$s[$i]);
	}
	for($i=0;$i<strlen($s);$i++)
	{
		if(array_pop($stack)!=$s[$i])
		{
			break;
		}
	}
	if($i==strlen($s))
	{
		echo "Palindrome";
	}
	else
	{
		echo "Not Palindrome";
	}
?>
