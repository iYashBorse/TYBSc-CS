<?php
$fh1 = fopen("readFile.txt","r") or die("File doesn't exist!");
$fh2 = fopen("book.txt","r") or die("File doesn't exist!");
$fh3 = fopen("writeFile2.txt","a");
while(!feof($fh1)){
  $s = fgets($fh1);
  fwrite($fh3, $s);
}
while(!feof($fh2)){
  $s = fgets($fh2);
  fwrite($fh3,$s);
}
echo "Succesfully merged the contents!";
 ?>
