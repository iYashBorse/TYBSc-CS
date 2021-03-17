<html>
<head><link rel="stylesheet" type="text/css" href="external.css">
	<title></title>
</head>
<body>


	<div>
		<%

			String  str = request.getParameter("userString");
			out.println("The vowels are :: ");
			 for(int i=0; i<str.length(); i++) {
		         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
		         out.println(str.charAt(i));
		         }


 
			 }

		%>
	</div>

</body>
</html>