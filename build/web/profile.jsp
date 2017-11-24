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
        <title>Bienvenido</title>
    </head>
    <style>
		body {
		color: white;
		}
                h1 {
                    color: lightblue; font-family: century gothic;
                }
                p {
                    color: black; font-family: century gothic;
                }
		</style>
</style>
    <body style="background-color: <%= color %>;">
    <center>
        <h1>Hola, <%= session.getAttribute("fullname") %></h1>
          <center><img src="log.png" width="" height=""></center>
             <!-- <a href="LogoutController" title="Cerrar sesión">Cerrar sesión</a> 
             Probando con botón Onclick-->

             <button type="button" onclick="location.href = 'LogoutController'" >Cerrar la sesión</button> <p>
             
             Escoge tu color favorito para tu perfil.
    <form action="ProfileController" method="POST">             
    <select name="color" id="colorfondo">
     <option value="#008000">Verde</option>
     <option value="#800000">Marrón</option>
     <option value="#800080">Purpura</option>
     <option value="#000080">Azul</option>
     </select>
        <input type="submit" value="Guardar">
     </form>    
     <br>
     Escoge una ciudad.
     <br>
  <select size="1" name="links" onchange="window.location.href=this.value;">
<option value="">Elige...</option>
<option value="Monterrey.jsp">Monterrey</option>
<option value="Guadalajara.jsp">Guadalajara</option>
<option value="CDMX.jsp">Cd de México</option>
</select>           
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
      <body bgcolor="#1687A3"> 
</html>
