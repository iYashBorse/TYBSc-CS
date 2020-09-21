<?php
$str = "This is a string with vowels and consonants.";
$vow = 0; $con = 0;

for($i=0;$i<strlen($str);$i++){
  if($str[$i]!=" "){
    if($str[$i]=='a' or $str[$i]=='e'or $str[$i]=='i'or $str[$i]=='o'or $str[$i]=='u'){
      $vow++;
    }
    else{
      $con++;
    }
  }
}
echo "<br> Vowels are: ".$vow."<br> Consonants are: ".$con;
 ?>
