<?php
$con = mysqli_connect('localhost','root','','ajaxdb');
if (!$con) {
  die('Could not connect: ' . mysqli_error($con));
}

mysqli_select_db($con,"ajaxdb");
$sql="SELECT * FROM teacher;";
$result = mysqli_query($con,$sql);

echo "<table>
<tr>
<th>Name</th>
<th>Subject</th>
<th>Research</th>
</tr>";
while($row = mysqli_fetch_array($result)) {
  echo "<tr>";
  echo "<td>" . $row['name'] . "</td>";
  echo "<td>" . $row['subject'] . "</td>";
  echo "<td>" . $row['research_area'] . "</td>";
  echo "</tr>";
}
echo "</table>";
mysqli_close($con);
?>
