<html>
<body>
  <form method="post">
    Enter file name: <input type="text" name="fname">
    <br><br>
    <select name="choice">
      <option value=1><br>1. Check file exist or not. </option>
      <option value=2><br>2. Display file size. </option>
      <option value=3><br>3. Rename file name with another name.</option>
      <option value=4><br>4. Delete the file.</option>
    </select>
    <br><br> <input type="submit">
  </form>
  <?php
    $ch = $_POST["choice"];
    $fname = $_POST["fname"];
    #$fp = fopen($fname,"r") or die("Unable to open file.");
    switch($ch){
      case 1:
              if(file_exists($fname)==true)
                echo("<script>alert('File Exists');</script>");
              else
                echo("<script>alert('File doesn't exist.');</script>");
              break;
      case 2:
              $n = filesize($fname);
              echo("<script>alert('File Size is $n bytes');</script>");
              break;
     case 3:
             $n = "rename.txt";
             if(rename($fname,$n)==true)
              echo("<script>alert('New file name is $n');</script>");
             else
              echo("<script>alert('File doesn't exist');</script>");
             break;
     case 4:
             unlink($fname);
             echo("<script>alert('$fname deleted.');</script>");
             break;
    default:
            echo "Invalid Choice!!";
    }
   ?>
</body>
</html>
