<%-- 
    Document   : Monterrey
    Created on : 20/11/2017, 05:33:02 PM
    Author     : Erick Alejandro
--%>
<%
    if(session.getAttribute("fullname") == null)
        response.sendRedirect("login.jsp");
%>

<%
String color = "";
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies) { 
  if(c.getName().equals("color")) { 
    color = c.getValue();
  }
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monterrey</title>
    </head>
    <style>
body {
    color: white;
}
</style>
    <body style="background-color: <%= color %>;">    
        <center>
        <h1>Pronóstico en Monterrey</h1>
        Temperatura actual: 20°
        <center><img src="Sol.png" width="80" height="80"></center>
        Claro.<br>
        
        Pronóstico próximos días<br>
        
        <center><img src="MTY.png" width="" height=""></center><br>
            
		<br>
		<button type="button" onclick="location.href = 'profile.jsp'" >Volver a mi perfil</button> <p> 
                    
                     <form method="POST" action="ComentariosControlador">
            ¡Dejanos un comentario!
             <br>
             <br>
            Título <input type="text" value="" name="nombre" >
          
            <br>
            Tu opinión:
             <br>
            <textarea rows="5" cols="30 " name="comentario"></textarea>
            <br>
            <br>
            <input type="submit">
            <input type="hidden" name="action" value="comentar"> 
        </form>
          
                
                
        </center>
    </body>
</html>
