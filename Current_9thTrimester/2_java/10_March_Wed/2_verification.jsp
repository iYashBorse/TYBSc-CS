<html>
    <head><link rel="stylesheet" type="text/css" href="external.css">
        <title>Home Page</title>
    </head>
    <body>
        <div>
         <center>

            <%
            
            String s1=request.getParameter("user");
            String s2=request.getParameter("password");

            if(s1.equals("admin") && s2.equals("admin")){
                 out.println("Holaa!");
            }
            else{
                out.println("Ohhhhhhhhhhhh , invalid credentials.");
            }
            %>

            <br><br>
            <a href="secondProgram.jsp">Re-Login for fun !</a>
         </center>
        <div>
    </body>
</html>
