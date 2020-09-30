<?php
$fh1 = fopen("readFile.txt","r") or die("File doesn't exist!");
$fh2 = fopen("writeFile.txt","a");
while(!feof($fh1)){
  $ch = fgetc($fh1);
  if(ctype_lower($ch)){
    $temp = strtoupper($ch);
    fwrite($fh2,$temp);
  }
  else{
    $temp = strtolower($ch);
    fwrite($fh2,$temp);
  }
}
echo "Succesfully written to file!";
 ?>
