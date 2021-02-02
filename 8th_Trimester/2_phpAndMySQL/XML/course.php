<?php
                $xml=simplexml_load_file("course.xml") or die("eror:cannot create object");
                echo "<table border=1 align=center>";
                echo "<tr><td>University Name</td><td>City</td><td>Division</td><td>Rank</td></tr>";
                foreach($xml->children() as $course)
                {
                                echo "<tr><td>".$course->Stud_name."</td>";
                                echo "<td>".$course->Class."</td>";
                                echo "<td>".$course->Division."</td>";
                                echo "<td>".$course->Percentage."</td></tr>";
                }
                echo "<table>";
?>
