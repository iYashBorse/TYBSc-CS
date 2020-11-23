<html>
<body>
  <form method="post">
    <br>Enter book's title: <input type="text" name="title">
    <br>Enter author's name: <input type="text" name="AuthorName">
    <br>Enter publisher's name: <input type="text" name="PublisherName">
    <br>Enter number of pages: <input type="text" name="pgno">
    <br>Enter book's price: <input type="text" name="price">
    <br> <input type="Submit">
  </form>
  <?php
  $btitle = $_POST['title'];
  $aname = $_POST['AuthorName'];
  $pname = $_POST['PublisherName'];
  $pgno = $_POST['pgno'];
  $bprice = $_POST['price'];

  $fp = fopen("book.txt","a") or die("File doesn't exist");
  $str = $btitle." ".$aname." ".$pname." ".$pgno." ".$bprice."\n";
  fwrite($fp,$str);
  fclose($fp);
   ?>
</body>
</html>
