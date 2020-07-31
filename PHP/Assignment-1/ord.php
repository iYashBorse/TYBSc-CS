<html>
<!-- Ask user for input and display whether it is uppercase, lowercase, digit or
    a symbol(special character) using ord function. -->
<body>
  <form method="GET">
    Enter a Character: <input type="text" name="char"><br><br>
    <input type="submit" name="Submit">
  </form>
<?php
  $temp = $_GET["char"];
  $char = ord($temp);
  if($char>=65 && $char<=90){
    echo "<br><br>$temp is Uppercase character.";
  }
  else if($char>=97 && $char<=122){
    echo "<br><br>$temp is Lowercase character.";
  }
  else if($char>=48 && $char<=57){
    echo "<br><br>$temp is a digit.";
  }
  else if($char>=33 && $char<=47){
    echo "<br><br>$temp is a Symbol.";
  }
 ?>
 <!-- ord function returns the ASCII value of the argument.
      If you're wondering where that numbers came from in the
      'if' condition refer to www.asciichars.com -->
</body>
</html>
