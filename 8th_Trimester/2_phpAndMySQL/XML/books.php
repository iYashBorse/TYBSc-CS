<?php 
$xml=simplexml_load_file('books.xml');
echo"Book store elements and attributes<br>";
foreach ($xml as $b)
{
	
	echo $b->Title ."<br>";
	echo $b->Publication ."<br>";
}
?>
