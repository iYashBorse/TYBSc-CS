<?php
$a=$_GET['a'];
$con = mysqli_connect('localhost','root','','ajaxdb');
if (!$con) {
  die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"ajaxdb");
$sql="select movie.mno,mname,r_yr from movie,actor where aname='$a' and movie.mno = actor.mno;";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Movie Number</th>
<th>Movie Name</th>
<th>Release year</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
  echo "<tr>";
  echo "<td>" . $row['mno'] . "</td>";
  echo "<td>" . $row['mname'] . "</td>";
  echo "<td>" . $row['r_yr'] . "</td>";
  echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
