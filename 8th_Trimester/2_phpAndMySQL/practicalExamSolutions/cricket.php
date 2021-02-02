<?php
  $xml = simplexml_load_file('cricket.xml');
  $m = $xml->addChild('Country');
    $m->addAttribute('name','New Zealand');
    $m->addChild('Player','Ross Taylor');
    $m->addChild('Wickets','10');
    $m->addChild('Runs','8000');
    header("content-type:text/xml");
  $n = $xml->addChild('Country');
    $n->addAttribute('name','Australia');
    $n->addChild('Player','Shane Watson');
    $n->addChild('Wickets','88');
    $n->addChild('Runs','6000');
    header("content-type:text/xml");
    echo $xml->asXML();
 ?>
