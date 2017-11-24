<%
    if(session.getAttribute("username") != null)
        response.sendRedirect("profile.jsp");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <center>
           <title>Bienvenido</title>
    </head>
    <body>
                <style>
		body {
		color: white;
		}
                h1 {
                    color: white; font-family: century gothic;
                }
                p {
                    color: black; font-family: century gothic;
                }
		</style>
                 <h1>Bienvenido</h1>
    <center><img src="Sol.png" width="80" height="80"></center>             
    <form action="LoginController" method="POST">
    <p> 
          Usuario:<input type="text" name="txtUsername">
    <p>   
    Contraseña:   <input type="password" name="txtPassword">
    <p> 
    <p> 
    <input type="submit" value="Iniciar sesión">
    
    <button type="button" onclick="location.href = 'index.html'" >Volver atrás</button> <p>
       
    </form>
    
    <body bgcolor="#1687A3">  
    </center>    
     <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br>
          <br> 
          <h1 style="border:2px solid lightblue;"><em>MeteoReg</em></h1>
    </body>
</html>
