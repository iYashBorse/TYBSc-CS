<html>
<head><link rel="stylesheet" type="text/css" href="external.css">
	<title>
	
	</title>
</head>
<body><div>
	
		
		<%@ page import = "java.util.*" %>
		<%


			Date  dateObject = new Date();
			String name = request.getParameter("nameUser");



			int hour = dateObject.getHours();

			if(hour >= 6 && hour <= 12 ){
			out.println("Beunos Dias ::  "+name);
			}

			else if(hour >= 17 && hour <= 20){
			out.println("buenas Tardes :: "+name);
			}
			else if(hour >= 20 && hour <= 6){
			out.println("Buenas Noches :: "+name);
		    }


		%>





</div>

</body>
</html>