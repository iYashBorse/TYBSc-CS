<?php
$fp = fopen("readFile.txt","r") or die("Unable to open File.");
while(!feof($fp)){
  echo fgets($fp);
  echo "<br>";
}
fclose($fp);
 ?>
