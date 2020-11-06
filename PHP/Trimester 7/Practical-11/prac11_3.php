<html>
<body>
<form method="post">
  <br>Enter directory's name:<input type="text" name="dname">
  <br><br><input type="submit">
</form>
<?php
  $dname = $_POST['dname'];
  $dh = opendir($dname);# or die("File Doesn't exist!");
  while($file = readdir($dh)){
    if(stristr($file,".html"))
      echo "<br>".$file;
  }
  closedir($dh);
?>
</body>
</html>
