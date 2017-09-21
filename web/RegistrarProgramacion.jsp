<%--
    Document   : RegistrarProgramacion
    Created on : 28/08/2017, 08:58:38 PM
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

        <title>Telas</title>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>

        <div id="app" class="container" ng-app="myApp" ng-controller="AppController as app">
            <form ng-submit="app.submit()">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Programar Pedido</h3>

                                <div class="pull-right">
                                    <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">

                                    </span>
                                </div>
                            </div>
                            <br>
                            <div class="row">
                                <div class="col-sm-1"></div>
                                <div class="col-sm-2 ">
                                    <div class="form-group">
                                        <input ng-class="myprenda"
                                               ng-blur="validarPrenda()"
                                               type="text"
                                               class="form-control"
                                               ng-model="prenda"
                                               id="prenda"
                                               placeholder="Prenda">
                                    </div>
                                </div>
                                <div class="col-sm-2">
                                    <div class="form-group">
                                        <input ng-class="mytela"
                                               ng-blur="validarTela()"
                                               type="text"
                                               class="form-control"
                                               ng-model="tela"
                                               id="tela"
                                               placeholder="Tela">
                                    </div>
                                </div>
                                <div class="col-sm-2">
                                    <div class="form-group">
                                        <input type="text"
                                               ng-class="mytalla"
                                               ng-blur="validarTalla()"
                                               class="form-control"
                                               ng-model="talla"
                                               id="talla"
                                               placeholder="Talla">
                                    </div>
                                </div>
                                <div class="col-sm-2">
                                    <div class="form-group">
                                        <input
                                            ng-class="mycantidad"
                                            ng-blur="validarCantidad()"
                                            type="text"
                                            class="form-control"
                                            ng-model="cantidad"
                                            id="cantidad"
                                            placeholder="Unidades a Cortar">
                                    </div>
                                </div>
                                <div class="text-center">
                                    <button
                                        ng-disabled="habilitado"
                                        ng-click="InsertProgramacion()"
                                        id="submit-button"
                                        type="submit"
                                        class="btn btn-info">Adicionar</button>
                                </div>
                                <div class="col-sm-2"></div>
                            </div>
                            </form>
                        </div>
                        
                        
                        
                        
                        
                        <div class="table-container">
                            <div ng-repeat="x in ver">
                                <p>{{x.nombre}}</p>
                                <p>{{x.correoPersonal}}</p>
                                <hr>
                            </div>



                            <div class="table-responsive">
                                <table class="table">
                                    <tr>
                                        <th>Prenda</th>
                                        <th>Tela</th>
                                        <th>Talla</th>
                                        <th>Unidades a Cortar</th>

                                        <th>Borrar</th>
                                    </tr>
                                    <tr ng-repeat="user in app.users">
                                        <td>{{user.prenda}}</td>
                                        <td>{{user.tela}}</td>
                                        <td>{{user.talla}}</td>
                                        <td>{{user.cantidad}}</td>

                                        <td><a href="javascript:void(0);" ng-click="app.delete($index)" class="btn btn-primary">Delete</a></td>
                                    </tr>
                                </table>
                                <div class="text-center">
                                    <button ng-click="registrarPedido()" 
                                            id="Registrar"
                                            type="button"
                                            class="btn btn-info">Registrar produccion</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
        
        <%@include file="jsp/footer.jsp" %>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.8/angular.min.js'></script>
        <script src="script/Programacionfunc.js"></script>
    </body>
</html>
