<?php
  $nm = $_POST["txtName"];
  $add = $_POST["address"];
  $gen = $_POST["rdoGen"];
  $pr = $_POST["chkProg"];
  $lan = $_POST["drpLan"];
?>
<table border="1">
  <tr><td>Student Name</td><td><?php echo $nm; ?></td></tr>
  <tr><td>Student Address</td><td><?php echo $add; ?></td></tr>
  <tr><td>Student Gender</td><td><?php echo $gen; ?></td></tr>
  <tr><td>Programming Languages:</td>
    <td><?php
    foreach($pr as $v){
      echo $v," ";
    }
     ?>
   </td></tr>
   <tr><td>Languages:</td>
     <td><?php
     foreach($lan as $v){
       echo $v, " ";
       }
     ?>
   </td></tr>
