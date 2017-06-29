<%-- 
    Document   : ListarPedidosDetallados
    Created on : 28/06/2017, 08:46:36 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="java/alertify.min.js"></script>
        <!-- include alertify.css -->
        <link rel="stylesheet" href="estilos/alertify.core.css">
        <link rel="stylesheet" href="estilos/alertify.default.css">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">     
       
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        
        <script src="script/cambiotablas.js"></script>
    
        <script ></script>
        <title>Pedidos Detallados tablas</title>
    </head>
    <body>
        
       <%@include file="jsp/header.jsp" %>
       <div class="container">
           
           <%@include file="jsp/tablaPedidosDetallados.jsp" %>
       </div>
        
        
        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
