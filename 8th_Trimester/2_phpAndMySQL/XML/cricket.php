<?php
  $xml = simplexml_load_file('cricket.xml');
  $m = $xml->addChild('Country');
    $m->addAttribute('name','England');
    $m->addChild('Player','James Anderson');
    $m->addChild('Wickets','600');
    $m->addChild('Runs','2000');
    header("content-type:text/xml");
    echo $xml->asXML();
 ?>
