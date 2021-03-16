<!-- 
  The question is  to  display the last name or surname of user  in bullet or list form 

  I have listed the  name and age in  bullet format.

  You surly might have two columns ( first name and last name )  in order to print surname

  You just have to  select the last name column and  print those values.

  for bullet you  know the trick (   ol ul li tags )

-->


<html>
<head>
	<title>
		Home Page
	</title>
	<link rel="stylesheet" type="text/css" href="external.css">
</head>

<body>
	<div>

			<%@ page import="java.sql.*" %>
   
          <%
          		String fetchedName ;
          		String fetchedAge;
          	


                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/shaun","shaun","root");
                  PreparedStatement stmt = con.prepareStatement("SELECT * from employee");
                  ResultSet rs = stmt.executeQuery("SELECT name , age  from employee");
                  //  " SELECT  surname from employee " 
                  // You have to match all the db name and table name to your  created database 
                  // in order to be able to run this program.

                  while(rs.next()){
                
                        fetchedName = rs.getString(1);

                        out.println("  <ul><li>Name : "+fetchedName+"</li>");

                        fetchedAge = rs.getString(2);

                        int age = Integer.parseInt(fetchedAge);
                        out.println("<li>Age : "+age+"<br></li></ul>");
                  }

                      con.close();
                      stmt.close();
                      rs.close();
          %>
	</div>

</body>
</html>