<html>
<body>
<form method="POST">
  <p> To replace hi with HI! </p>
  <br><br> Enter a string: <input type="text" name="txt">
  <br><br> <input type="submit">
</form>
<?php
  $s = $_POST["txt"];
  $pattern = "/hi/i";
  echo preg_replace($pattern,"HI",$s);
 ?>
</body>
</html>
