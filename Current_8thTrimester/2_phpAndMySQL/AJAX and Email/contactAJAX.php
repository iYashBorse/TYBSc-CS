<?php
                $fp = fopen('C:/xampp/htdocs/PHP/contact.dat','r');
                echo "<table border=1>";
                echo "<tr><th>Sr. No.</th><th>Name</th><th>Residence No.</th><th>Mob. no.</th><th>Relation</th></tr>";

while($row =  fscanf($fp,"%s %s %s %s %s"))
                {
                                echo "<tr>";
                                foreach($row as $r)
                                {
                                                echo "<td>$r</td>";
                                }
                                echo "</tr>";
                }
                                echo "</table>";
                fclose($fp);
?>
