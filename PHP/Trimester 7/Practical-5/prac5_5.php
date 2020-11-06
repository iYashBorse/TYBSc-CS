<html>
<body>
<form method="POST">
  <p> To check Palindrome! </p>
  <br><br> Enter a number: <input type="text" name="numtxt">
  <br><br> <input type="submit">
</form>
<?php
$n = $_POST['numtxt'];
function rev($n){
$rev = 0;
while(floor($n)){
  $rem = $n%10;
  $rev = $rev*10 + $rem;
  $n = (int)$n/10;
}
return $rev;
}
$r = rev($n);
if ((int)$n == $r){
  echo "<br><b>It is a Palindrome!</b>";
}
else{
  echo "<br><b> It is not a Palindrome. </b>";
}
?>
</body>
</html>
