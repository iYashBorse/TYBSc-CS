<?php  
//user-defined function with an exception  
function checkNumber($num) {  
   if($num>=1) {  
     //throw an exception  
     throw new Exception("Value must be less than 1");  
   }  
   return true;  
}  
  
//trigger an exception in a "try" block  
try {  
   checkNumber(5);  
   //If the exception throws, below text will not be display  
   echo 'If you see this text, the passed value is less than 1';  
}  
  
//catch exception  
catch (Exception $e) {  
   echo 'Exception Message: ' .$e->getMessage();  
}  
?> 