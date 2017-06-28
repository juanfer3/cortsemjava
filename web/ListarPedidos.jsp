<%-- 
    Document   : ListarPedidos
    Created on : 11/04/2017, 07:49:46 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <title>Listar Pedidos</title>
        
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>
        <h1>Lista Pedidos</h1>
        
        <%@include file="jsp/tablaPedido.jsp" %>
        
        <%@include file="jsp/body.jsp" %>
        
        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
