<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <title> INTRODUCTION </title>
		<meta http-equiv="content-type" content="text/html"; charset="utf-8">
		<link rel = "stylesheet" href = "mini.css" type="text/css" >
    </head>
	<script type="text/javascript">
			function checked()
			{
                            document.write("successful");
			}
	</script>
    <body>
            				
		<% 
                String click = request.getParameter("click");
                String clickout = request.getParameter("clickout");
                out.println(click);
                out.println(clickout);
                System.out.println(click);
               
                %> 
           
             
                <form action="1.html" onsubmit="return checked();">
		<input type="submit" id="clickout" name="clickout" value="Click out" />
            </form>
	</body>
</html>