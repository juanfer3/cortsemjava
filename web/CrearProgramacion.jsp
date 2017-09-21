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

        <!--link href="https://code.ionicframework.com/nightly/css/ionic.css" rel="stylesheet"-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <link rel="stylesheet" href="bootstrap/css/programacion.css">

        <title>Telas</title>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>


        <div class="container" ng-controller="CrearProgramacion" >
            
            
            
            <div class="col-lg-5" >
                
                <h1>Pedidos nuevos</h1>

                <div class="" ng-repeat="lista in Lista track by $index" ng-if="lista.estado == 'pedido'" >
                    <div ng-show="Lista.estado == 'En produccion'"><h4>No hay Pedidos en este momento</h4></div>
                    <table  id="keywords" cellspacing="0" cellpadding="0" class="" border="5"  >
                        <thead>
                            <tr >
                                <th  >
                                    
                                    <span ng-show="lista.clienteId.nombre">
                                        <b>{{lista.clienteId.nombre}}
                                        </b>
                                    </span>
                                </th>


                                <th>
                                    <a 
                                       ng-click="Modal(lista)" 
                                       data-toggle="modal" data-target="#myModal" href="#">
                                        <span 
                                            class="glyphicon glyphicon-search" 
                                            style="font-size:24px;color:#00796b;text-shadow:1px 1px 2px #000000;">
                                        </span>
                                    </a>
                                </th>
                                <th>
                                    <span   
                                        ng-click="programar(lista)"
                                        class="glyphicon glyphicon-scissors" 
                                        style="font-size:24px;color:#00796b;text-shadow:1px 1px 2px #000000;">
                                    </span>
                                    </span></th>

                            </tr>
                        </thead>
                        <tbody >
                            <tr>
                                <td class="lalign">Num: </td>
                                <td>6,000</td>
                                <td></td>

                            </tr>

                        </tbody>

                    </table>
                </div>

            </div >

            <div class=" col-lg-5 col-lg-offset-1 " ng-repeat-end>
                <h1>Pedidos en proceso</h1>
                <div class="" ng-repeat="lista in Lista track by $index" ng-if="lista.estado == 'En producion'">

                    <table id="keywords" cellspacing="0" cellpadding="0" class=" " >
                        <thead>
                            <tr>
                                <th><span>{{lista.clienteId.nombre}}</span></th>
                                <th>
                                    <a ng-click="Modal(lista)" 
                                       data-toggle="modal" data-target="#myModal" href="#">
                                        <span 
                                            class="glyphicon glyphicon-search" 
                                            style="font-size:24px;color:#00796b;text-shadow:1px 1px 2px #000000;">
                                        </span>
                                    </a>
                                </th>
                                <th>
                                    <span
                                        ng-click="DeshacerProgramacion(lista)"
                                        class="glyphicon glyphicon-remove" 
                                        style="font-size:24px;color:#00796b;text-shadow:1px 1px 2px #000000;">
                                            
                                    </span>
                                </th>

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
            <div class="container" >

            <!-- Modal data-toggle="modal" data-target="#myModal"-->
            <div class="modal fade in" id="myModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title" id="tituloModal">Empleados</h4>
                        </div>
                        <div class="modal-body" id="VerModal">
                            <div class="span5">
                                <table class="table table-striped table-condensed">
                                    <thead>
                                        <tr>
                                            <th>Prenda</th>
                                            <th>Tela</th>
                                            <th>Talla</th>
                                            <th>Cantidad</th>
                                            


                                        </tr>
                                    </thead>   
                                    <tbody>

                                        <tr ng-repeat="modal in myModal track by $index">
                                            <td>{{modal.prenda}}</td>
                                            <td>{{modal.telasId.refTela}}</td>
                                            <td>{{modal.talla}}</td>
                                            <td>{{modal.cantidad}}</td>
                                            

                                        </tr>

                                    </tbody>
                                    <tfoot>
                                        
                                    </tfoot>

                                </table>
                                
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

        </div>
        </div>
        

        <%@include file="jsp/footer.jsp" %>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.8/angular.min.js'></script>
        <script src="https://code.ionicframework.com/nightly/js/ionic.bundle.js"></script>
        <script src="script/CrearProgramacion.js"></script>
    </body>
</html>
