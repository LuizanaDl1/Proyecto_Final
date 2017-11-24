<%-- 
    Document   : registro
    Created on : 8/11/2017, 11:48:58 AM
    Author     : Erick Alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registro</title>
        <link rel="icon" href="Sol.ico"
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<style>
		body {
		color: white;
		}
		</style>
		
		<center>
                    <h1>Registrate en MeteoREG</h1>
		<br>
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
		<center><img src="arcoiris.png" width="80" height="80"></center>
		<br>
           <form action="Registro" method="POST">
                        <p> Nombre: <input type="text" name="nombre" ><br /></p>
                        <p>E-mail: <input type="text" name="apellidos" /><br /></p>
                        <p>  Usuario: <input type="text" name="direccion" /><br /></p>
                        <p>Password: <input type="password" name="psw"></p> 
  
                                        <label for="fecha_dia">Mes de nacimiento</label> 
                                        <select id="fecha_mes" name="fecha_mes">
                                        <option value="1">Enero</option>
                                        <option value="2">Febrero</option>
                                        <option value="3">Marzo</option>
                                        <option value="4">Abril</option>
                                        <option value="5">Mayo</option>
                                        <option value="6">Junio</option>
                                        <option selected value="7">Julio</option>
                                        <option value="8">Agosto</option>
                                        <option value="9">Septiembre</option>
                                        <option value="10">Octubre</option>
                                        <option value="11">Noviembre</option>
                                        <option value="12">Diciembre</option>
                                      </select>
                                                    <p>Sexo:
                                                   <input type="radio" name="hm" value="h" required="required"> Hombre
                                                   <input type="radio" name="hm" value="m" required="required"> Mujer
                                                   </p>
    
                            <input type="submit" value="Enviar" />
                               <input type="reset" value="Borrar" onClick="this.form.reset()" />
                               <button type="button" onclick="location.href = 'index.html'" >Volver al inicio</button> <p>
                                       </center>
		
         

		
                    <body bgcolor="#1687A3"> 
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