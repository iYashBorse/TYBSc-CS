<?php
echo "<h3>Marksheet</h3> ";

echo "Name : ".$_COOKIE['name']."<br>";
echo "Address : ".$_COOKIE['addr']."<br>";
echo "Class : ".$_COOKIE['class']."<br>";

echo "Physics : ".$_POST['m1']."<br>";
echo "Bio: ".$_POST['m2']."<br>";
echo "Chem: ".$_POST['m3']."<br>";
echo "Maths: ".$_POST['m4']."<br>";
echo "Marathi: ".$_POST['m5']."<br>";
echo "English : ".$_POST['m6']."<br>";
echo "Total : ".($_POST['m1']+$_POST['m2']+$_POST['m3']+$_POST['m4']+$_POST['m5']+$_POST['m6'])."<br>";
echo "Percentage:".(($_POST['m1']+$_POST['m2']+$_POST['m3']+$_POST['m4']+$_POST['m5']+$_POST['m6'])/6)."";
?>
