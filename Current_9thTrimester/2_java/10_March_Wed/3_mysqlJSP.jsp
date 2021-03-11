<!-- 


For this program to run you have to  change the  localhost address  on the basis of your localhost machine
while creating connection object  and database name , table name et cetera .

 Alert : Make Sure to check the  value name  that you are retrieving from html file. 
         In this case , name and pass are used  in  html login page. ( on line 33 and 34 you can see the same is used  in jsp file also ) 

         CSS file won't affect your program ( add or don't )

         This program is ran on xampp  , if you are using the installed mysql version , then
         change  the "192.168.64.3"  to  "localhost:3306" and even using  xampp on windows 
         this address  ( i.e 192.168.64.3 )  might be different.

         Special thanks to : Deepak  Pawade ( BSc Div B ) for the program help and tips.

        
-->


<html>

<head>
    <link rel="stylesheet" type="text/css" href="external.css">
    <title>Document</title>
</head>

<body><div>

    <%@ page import="java.sql.*" %>
   
    <%
    
    String fetchedName = "";
    String fetchedPass = "";
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");
    int found = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/student","shaun","root");
            PreparedStatement stmt = con.prepareStatement("SELECT * from studentInfo");
            ResultSet rs = stmt.executeQuery("SELECT * from studentInfo");
            while (rs.next()) {
                 fetchedName = rs.getString(1);
                 fetchedPass = rs.getString(2);
                if (fetchedName.equals(name)) {
                    if (fetchedPass.equals(pass)) {
                        found = 2;
                    } else {
                        found = 1;
                    }
                    break;
                }
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        if (found == 2)
             out.println("Login Successfull");
        if (found == 1)
               out.println("Login Unsuccessfull (Password incorrect)");
        if (found == 0)
                out.println("Login Unsuccessfull (User not found)");

    %>
</div>
</body>

</html>