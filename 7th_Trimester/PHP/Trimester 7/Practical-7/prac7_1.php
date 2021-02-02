<?php
	$student = array(array("Ravi","  18  ","  97.5%  " ,"  A+ "),array("Kishan","  19 ","  75%  ","  B+"),array("Veer","  19  ","  50%  ","  D"),array("Dharam","  21  ","  65.32%  " ,"  C+"));
	for($i=0;$i<4;$i++)
	{
		for($j=0;$j<4;$j++)
		{
			echo $student[$i][$j];
		}
		echo "<br><br><br>";
	}
  ?>
