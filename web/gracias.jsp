<%-- 
    Document   : gracias
    Created on : 23/11/2017, 11:56:24 AM
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
        <h1>Gracias por tu comentario.</h1>
        
         <%-- 
<a href="javascript:history.back(1)">Volver Atrás</a>
         --%>
         <button type="button" onclick="location.href = 'buscar.jsp'" >Ver opiniones</button> <p> 
         <button type="button" onclick="location.href = 'javascript:history.back(1)'" >Volver atrás</button> <p> 
             
           </center>  
    </body>
</html>
