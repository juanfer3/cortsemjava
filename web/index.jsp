<%-- 
    Document   : index
    Created on : 25/02/2017, 08:22:48 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      
        <script src="java/alertify.min.js"></script>
        <!-- include alertify.css -->
        <link rel="stylesheet" href="estilos/alertify.core.css">
        <link rel="stylesheet" href="estilos/alertify.default.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
     
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">


        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

        <link rel="stylesheet" href="bootstrap/css/estilos.css">

        <title>Index Cortsem</title>
        
        <script src="script/cambiotablas.js"></script>
        <script ></script>
    </head>
    <body>

        <%@include file="jsp/header.jsp" %>
          
        <%@include file="ContenidoIndex.jsp"%>

        <div id="tabla" ></div>
        
        <%@include file="jsp/footer.jsp" %>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        
    </body>
</html>
