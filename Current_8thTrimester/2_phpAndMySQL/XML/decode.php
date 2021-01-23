<?php  
$json = '{"a":1,"b":2,"c":3,"d":4,"e":5}';  
var_dump(json_decode($json, true));//true means returned object will be converted into associative array  
?>  