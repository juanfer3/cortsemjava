<%-- 
    Document   : ListarPerdidas
    Created on : 12/09/2017, 08:22:10 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myApp">
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <title>Perdidas</title>
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="java/alertify.min.js"></script>
        <!-- include alertify.css -->
        <link rel="stylesheet" href="estilos/alertify.core.css">
        <link rel="stylesheet" href="estilos/alertify.default.css">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">     
       
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        
        
       
    </head>

    <body>
        <%

    String rol;
    rol = ((String) session.getAttribute("rol"));%>
        <%@include file="jsp/header.jsp" %>

        
        
        
        
        <div class="container" ng-view></div>
        
        
        <%@include file="jsp/footer.jsp" %>
        
        <script src='https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular.min.js'></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.6.5/angular-route.min.js'></script>
                       
        
        <script src='script/perdidas.js'></script>
    </body>
    

</html>