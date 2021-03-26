<%@ page isErrorPage="true" %>  
 
<html>
	<head>
	  <title>Error Page </title>
	  <link rel="stylesheet" type="text/css" href="external.css">
	</head>
	<body><div>
               	<h3>You caught an error : </h3>
		<br/>
			Exception is: <%= exception %>  
		</div>
 	</body>
</html>