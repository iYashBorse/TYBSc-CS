
<html>
   <head> 
    <link rel="stylesheet" type="text/css" href="external.css">
       <title>Home Page</title>

   </head>
       <% String color=request.getParameter("color");
          String name=request.getParameter("userName");  
        %>
   
    <body style="background-color:<%= color %>;"><div>
        <center>
          <hr>
                 
              <h1> <% out.print("welcome ::  "+name);  %></h1>
              <% out.println("The Color is :: "+color); %><br><br>
              Current Time: <%= java.util.Calendar.getInstance().getTime() %> 
          <hr>
                <br><br>
                <a href="fourthProgram.jsp">Set different color</a>
        </center></div>
    </body>
</html>
