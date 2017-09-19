<%-- 
    Document   : CrearProgramacion
    Created on : 18/09/2017, 07:33:04 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="myPrograment">
    <head >
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
        <link rel="stylesheet" href="bootstrap/css/programacion.css">

        <title>Telas</title>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>


        <div class="container" ng-controller="CrearProgramacion" ng-init="getPedidos()">
            <input class="tomo" value="Hola" type="text">
            <div class="col-lg-5" >
                <h1>Pedidos nuevos</h1>
                
                <div class="" ng-repeat="lista in Lista">
                <table id="keywords" cellspacing="0" cellpadding="0" class="" border="5">
                    <thead>
                        <tr>
                            <th><span>{{ lista.clienteId.nombre }}</span></th>
                            <th><span></span></th>
                            <th>
                                    <span class="glyphicon glyphicon-scissors" style="font-size:24px;color:#00796b;text-shadow:1px 1px 2px #000000;"></span>
                                </span></th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="lalign">Num: {{lista.id}}</td>
                            <td>6,000</td>
                            <td>{{lista.fentrega}}</td>

                        </tr>

                    </tbody>
                </table>
                </div>
                
            </div>

            <div class=" col-lg-5 col-lg-offset-1 ">
                <h1>Pedidos en proceso</h1>
                <div class="" ng-repeat="lista in Lista">
                <table id="keywords" cellspacing="0" cellpadding="0" class=" ">
                    <thead>
                        <tr>
                            <th><span>Keywords</span></th>
                            <th><span>Impressions</span></th>
                            <th><span>Clicks</span></th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="lalign">silly tshirts</td>
                            <td>6,000</td>
                            <td>110</td>

                        </tr>

                    </tbody>
                </table>
            </div> 
            </div>

        </div>


        <%@include file="jsp/footer.jsp" %>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.8/angular.min.js'></script>
        <script src="script/CrearProgramacion.js"></script>
    </body>
</html>
