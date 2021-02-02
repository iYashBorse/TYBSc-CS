<html>
<body>
  <form method="post">
    Enter file name: <input type="text" name="dname">
    <br><br>
    <select name="choice">
      <option value=1><br>1. Check directory exist or not. </option>
      <option value=2><br>2. Create directory. </option>
      <option value=3><br>3. Change directory path. .</option>
      <option value=4><br>4. Delete the directory.</option>
    </select>
    <br><br> <input type="submit">
  </form>
  <?php
    $ch = $_POST["choice"];
    $dname = $_POST["dname"];
    #$fp = fopen($fname,"r") or die("Unable to open file.");
    switch($ch){
      case 1:
              if(is_dir($dname)==true)
                echo("<script>alert('Directory Exists');</script>");
              else
                echo("<script>alert('Directory doesn't exist.');</script>");
              break;
      case 2:
              if(is_dir($dname)!=true)
                mkdir($dname);
                echo("<script>alert('Directory created');</script>");
              break;
     case 3:
            $prev = getcwd();
            chdir("testDir");
            $curr = getcwd();
            echo("Previous directory $prev <br> Current directoy $curr");
            break;
     case 4:
             rmdir($dname);
             echo("<script>alert('$dname deleted.');</script>");
             break;
    default:
            echo "Invalid Choice!!";
    }
   ?>
</body>
</html>
