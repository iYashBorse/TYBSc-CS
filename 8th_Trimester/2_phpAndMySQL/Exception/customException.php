<?php  
class DivideByZeroException extends Exception { }  
class DivideByNegativeNoException extends Exception { }  
function checkdivisor($dividend, $divisor){  
    // Throw exception if divisor is zero  
  try {  
      if ($divisor == 0) {  
        throw new DivideByZeroException;  
      }   
      else if ($divisor < 0) {  
         throw new DivideByNegativeNoException;   
      }   
      else {  
        $result = $dividend / $divisor;  
        echo "Result of division = $result </br>";  
      }  
    }  
    catch (DivideByZeroException $dze) {  
        echo "Divide by Zero Exception! </br>";  
    }  
    catch (DivideByNegativeNoException $dnne) {  
        echo "Divide by Negative Number Exception </br>";  
    }  
    catch (Exception $ex) {  
        echo "Unknown Exception";  
    }  
}  
   
    checkdivisor(18, 3);  
    checkdivisor(34, -6);  
    checkdivisor(27, 0);  
?>  
