<%-- 
    Document   : login
    Created on : 28/02/2017, 07:36:28 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <title>JSP Page</title>
    </head>
    <body>

        <%@include file="jsp/header.jsp" %>
        --%>
  <div class="wrapper">
      <form class="form-signin" action="Loguin" method="POST">       
      <h2 class="form-signin-heading textologuin">Please login</h2>
      <input type="text" class="form-control spaceinput" name="usuario" placeholder="Email Address" required="" autofocus="" />
      <input type="password" class="form-control spaceinput" name="contrasena" placeholder="Password" required=""/>      
      
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
      <label class="checkbox">
          <a href="#" value="remember-me" id="rememberMe" name="rememberMe"> No tienes cuenta?</a>
          <a href="#" value="remember-me" id="rememberMe" name="rememberMe"> Olvidaste tu contraseña?</a>
      </label>
    </form>
  </div>
    <%--
        
        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
--%>