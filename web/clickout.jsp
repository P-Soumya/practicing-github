
<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <title> INTRODUCTION </title>
		<meta http-equiv="content-type" content="text/html"; charset="utf-8">
		<link rel = "stylesheet" href = "mini.css" type="text/css" >
    </head>
    <script>
	function is_clicked()
	{      
            document.write("<h1> Successful </h1>");
        }
        function is_notclicked()
	{      
             document.write("<h1> Not clicked </h1>");
        }
    </script>
    <body>
	
        <% 
               String click = request.getParameter("clickme");
               String ClickMe = "ClickMe";
                
                
               if(click != null)
               {
                   
                
        %>  
        
            <form> 
                <input type="button" value="Click Me" onmouseover="document.getElementById('clickout').click()" />
            </form> 
            <form>
                <input type="hidden" id="clickout" value="Click out" onclick="is_clicked()"/>
            </form>
            
        <%
                       
                }
                else
                {
                   
        %>
            
            <form>
                <input type="button" id="clickout" value="Click out" onclick="is_clicked()"/>
             </form>
            
        <%
                       
                }
        %>   
	</body>
        
</html>