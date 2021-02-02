<html>
<body>
  <form method="post">
    Enter file name: <input type="text" name="fname">
    <br><br>
    <select name="choice">
      <option value=1><br>1. Display number of characters. </option>
      <option value=2><br>2. Display number of digits.</option>
      <option value=3><br>3. Display number of vowels.</option>
      <option value=4><br>4. Display number of words.</option>
      <option value=5><br>5. Number of lines.</option>
    </select>
    <br><br> <input type="submit">
  </form>
  <?php
    $ch = $_POST["choice"];
    $fname = $_POST["fname"];
    $fp = fopen($fname,"r") or die("Unable to open file.");
    switch($ch){
      case 1:
              $n = 0;
              while(!feof($fp)){
                $c = fgetc($fp);
                if(ctype_alpha($c))
                  $n += 1;
              }
              echo("<script>alert('Number of characters are $n');</script>");
              break;
      case 2:
              $n = 0;
              while(!feof($fp)){
                $c = fgetc($fp);
                if(ctype_digit($c))
                  $n += 1;
              }
              echo("<script>alert('Number of digits are $n');</script>");
              break;
     case 3:
             $n = 0;
             while(!feof($fp)){
               $c = fgetc($fp);
               if($c=='a' or $c=='e' or $c=='i' or $c=='o' or $c=='u' or $c=='A' or $c=='E' or $c=='I' or $c=='O' or $c=='U')
                 $n += 1;
             }
             echo("<script>alert('Number of vowels are $n');</script>");
             break;
     case 4:
             $n = 0;
             $arr = file($fname);
             foreach($arr as $line){
               $l = preg_split("/ /",$line);
               foreach($l as $v){
                 $n++;
               }
             }
             echo("<script>alert('Number of words are $n');</script>");
             break;
    case 5:
            $n = 0;
            $arr = file($fname);
            foreach($arr as $line){
                $n++;
            }
            echo("<script>alert('Number of lines are $n');</script>");
            break;
    default:
            echo "Invalid Choice!!";
    }
   ?>
</body>
</html>
