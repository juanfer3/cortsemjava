<%-- 
    Document   : PaginaPedido
    Created on : 25/02/2017, 09:18:28 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <script></script>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>
        <div class="container">
            <div class="titulopedido">
                <h3>Insumos</h3>
            </div>
            <%@include file="jsp/tablaInsumos.jsp" %>
            <script
                <script type="text/javascript" src="script/funtion.js"></script>
        </div>
        <%@include file="jsp/body.jsp" %>
        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
