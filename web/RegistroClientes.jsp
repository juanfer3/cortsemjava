<%-- 
    Document   : RegistroClientes
    Created on : 18/04/2017, 06:09:32 PM
    Author     : Juan
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
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <script src="script/validarCliente.js"></script>
        <title>JSP Page</title>
    </head>
    <body>

        <%@include file="jsp/header.jsp" %>

        <div class="container" id="contenido">
            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Registro Cliente</h3>
                            <div class="pull-right">
                                <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">

                                </span>
                            </div>
                        </div>
                        <div class="panel-body">
                            <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
                        </div>
                        <form action="RegistrarClientes">
                            <table class="table table-hover" id="dev-table">

                                <div class="col-md-12 col-sm-12">
                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="name">nombre*	</label>
                                        <input type="text" class="form-control input-sm" id="name" placeholder="" name="nombre">
                                    </div>
                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="email">documento*</label>
                                        <input type="text" class="form-control input-sm" id="email" placeholder="" name="documento">
                                    </div>

                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="mobile">Telefono</label>
                                        <input type="text" class="form-control input-sm" id="telefono" placeholder="" name="telefono">
                                    </div>

                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="address">celular</label>
                                        <input type="text" class="form-control input-sm" id="celular" placeholder="" name="celular">
                                    </div>

                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="city">Correo*</label>
                                        <input type="email" class="form-control input-sm" id="correo" placeholder="" name="correo">
                                    </div>
                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="city">Direccion*</label>
                                        <input type="text" class="form-control input-sm" id="direccion" placeholder="" name="direccion">
                                    </div>
                                    
                                    
                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="city">Usuario*</label>
                                        <input type="email" class="form-control input-sm" id="usuario" placeholder="" name="usuario">
                                    </div>
                                    <div class="form-group col-md-6 col-sm-6">
                                        <label for="city">Contraseña*</label>
                                        <input type="password" class="form-control input-sm" id="contrasena" placeholder="" name="contrasena">
                                    </div>
                                    <div class="row">

                                        <div class="col-xs-6 col-md-6 botonclientes"><a href="ListarClientes" class="btn btn-danger btn-block btn-lg">Listar Clientes</a></div>
                                        <div class="col-xs-6 col-md-6 botonclientes"><input type="submit" value="aceptar" class="btn btn-primary btn-block btn-lg" tabindex="7" id="grabar"></div>
                                    </div>

                                </div>

                            </table>
                        </form>
                    </div>
                </div>

            </div>
        </div>
        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
