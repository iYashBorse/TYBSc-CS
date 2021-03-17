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
            int fetchedSalary;
            int sum = 0;

          


                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://192.168.64.3/shaun","shaun","root");
                PreparedStatement stmt = con.prepareStatement("SELECT * from employee");
                ResultSet rs = stmt.executeQuery("SELECT salary  from employee");


                  while(rs.next()){
                      fetchedSalary = rs.getInt(1);
                      sum = sum + fetchedSalary;
                  }

                    out.println("Salary ::"+sum);

                    con.close();
                    stmt.close();
                    rs.close();
        %>
  </div>

</body>
</html>