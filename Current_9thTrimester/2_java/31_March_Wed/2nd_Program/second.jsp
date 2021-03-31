<html>
<head><link rel="stylesheet" type="text/css" href="external.css">
	<title>
		
	</title>
</head>
<body><div>
<% int num = Integer.parseInt(request.getParameter("number")); %>
<%!


	String primeCheck(int number){
            int flag=0;  

            for(int i=2;i<=(number-1);i++){  
              
                if(number%i==0){  
                    flag=1;  
                    break;  
                }  
            }  
              
            if(flag==0){
            return "it's prime";  
            } 
            else{  
            return "Nopeeee" ;
            }  
             
    }
%>
<p>Prime check:<%=primeCheck(num)%></p>
</div>
</body>
</html>