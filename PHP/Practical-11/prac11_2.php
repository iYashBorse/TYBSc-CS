<html>
<body>
<form method="post">
  <br>Enter file's name:<input type="text" name="fname">
  <br><br><input type="submit">
</form>
<?php
  $fname = $_POST['fname'];
  readFile($fname) or die("File Doesn't exist!");
?>
</body>
</html>
