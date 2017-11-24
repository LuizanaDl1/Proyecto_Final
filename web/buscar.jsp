
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
<%@page import="java.util.ArrayList"%>
<%@page import="models.ComentariosPOJO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Opiniones</title>
         <center>
        <h1>Opiniones   </h1>
        <style>
        body {
        color: white;
        }
        </style>
    </head>
    <body style="background-color: <%= color %>;"> 
        
        
          <form method="POST" action="ComentariosControlador">
            Nombre: <input type="text" value="" name="nombre" >
            <br>
            <br>
            Inserte su comentario: 
            <br>
            <textarea rows="5" cols="30" name="comentario"></textarea>
           
            <br>
            <input type="submit">
            <input type="hidden" name="action" value="buscar">

            
             <button type="button" onclick="location.href = 'profile.jsp'" >Ir a mi perfil</button> 
              
            
        </form>
        <%  if(session != null){
            ArrayList  comentarios = (ArrayList)session.getAttribute("comentarios");
            if(comentarios!=null){
        %>
                <table border="1">
                    <tr>
                        <th>Título: </th>
                        <th>Comentario: </th>
                    </tr>
                <% 
                    for(Object o : comentarios){
                        ComentariosPOJO comentario = (ComentariosPOJO) o;
                %>    
                    <tr>
                        <td><%=comentario.getNombre()%></td>
                        <td><%=comentario.getComentario()%></td>
                    </tr>
                <%  } %>    
                </table>
            <%  }
                }%>
                
                  <body bgcolor="#1687A3"> 
                                   </center>

    </body>
</html>
