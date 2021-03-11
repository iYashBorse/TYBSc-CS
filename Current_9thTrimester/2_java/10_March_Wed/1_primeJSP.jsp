<html>
	<head>
		<link rel="stylesheet" type="text/css" href="external.css">
	</head>
	<body><div><center>
		<h1> The required Result is :: </h1>
 		<h2> 

 			<% 
 				int n , i , flag =0; 
 				String ns = request.getParameter("n");
 				n = Integer.parseInt(ns);
 				if(n>1){
					for(i=2; i<=n/2; i++){

 						if(n%i==0){
 							flag =1;
 							break;		

 						}
 					}
 				}

 				if(flag ==0){
 					out.println(n+" is a prime number");
 				}
 				else{
 				out.println(n+ " is not a prime number");
 				}

 			%>
 		</h2></center></div>
 	</body>
 </html>