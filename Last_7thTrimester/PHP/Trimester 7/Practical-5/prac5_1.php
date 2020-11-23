<?php
function sod($num){
  $sum = 0;
  while($num!=0){
    $n = $num%10;
    $sum += $n;
    $num = $num/10;
  }
  return $sum;
}

$digit_sum = "sod";
echo "<br><b>Sum of digits is: </b>",$digit_sum(5051);
?>
