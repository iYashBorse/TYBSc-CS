
<html>
   <head> 
       <title>Home Page</title>
       <link rel="stylesheet" type="text/css" href="external.css">
   </head>
      
   
    <body><div>
        <center>
          <hr>
       <% 

            String name=request.getParameter("userName");
            String userAge=request.getParameter("userAge");
            int age = Integer.parseInt(userAge);


             out.println("Welcome :: "+name+" <br>Age :: "+age+"<br>"); 

              	if(age >= 62 ){
              	out.println("Your Movie Ticket price is :: 250");
				        }

              	else if(age <= 10){
              	out.println("Your Movie Ticket price is :: 100");
                }
                else{
                out.println("Your Movie Ticket Price is :: 200");
                }
        %>
          <hr>
                <p>enjoy !</p>
           
        </center></div>
    </body>
</html>
