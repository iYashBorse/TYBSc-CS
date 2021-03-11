
<html>
   <head> 
       <title>Home Page</title>
   </head>
       <% String color=request.getParameter("color");
          String name=request.getParameter("userName");  
        %>
   
    <body bgcolor= "<%= color %>">
        <center>
          <hr>
                 
              <h1> <% out.print("welcome ::  "+name);  %></h1>
              <% out.println("The Color is :: "+color); %><br><br>
              Current Time: <%= java.util.Calendar.getInstance().getTime() %> 
          <hr>
                <br><br>
                <a href="fourthProgram.jsp">Set different color</a>
        </center>
    </body>
</html>
