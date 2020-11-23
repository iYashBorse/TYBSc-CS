<?php
function disp($n){
  if($n>=1){
    echo " ".$n;
    disp($n-1);
  }
}

disp(10);
 ?>
