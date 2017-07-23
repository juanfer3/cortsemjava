<%-- 
    Document   : CrearInsumos
    Created on : 22/07/2017, 03:37:25 PM
    Author     : USUARIO
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

        <script src="script/cambiotablas.js"></script>
        <script src="script/Insumos.js"></script>

        <script ></script>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>

        <div class="container" id="ocultarlistarclientes">

            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <form method="POST" action="Pedido">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">

                                <div class="pull-right">
                                    <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">

                                    </span>
                                </div>
                            </div>
                            <div class="panel-body">
                                <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
                            </div>
                            <table class="table table-hover" id="dev-table">
                                <thead>
                                    <tr>

                                        <th>Nombre</th>
                                        <th>Tipo de Unidad</th>
                                        <th>Cantidad</th>
                                        <th>Valor unitario</th>
                                        <th>Valot total</th>

                                        <th>Aceptar</th>


                                    </tr>
                                </thead>


                                <tbody>
                                    <tr class="padre">



                                        <td>
                                            <input type="text"  class="form-control nombre" value="" id="nombre" name="nombre">
                                        </td>
                                        <td>
                                            <input type="text"  class="form-control t_unidad" value="" id="t_unidad" name="t_unidad">
                                        </td>
                                        <td>
                                            <input type="number"  class="form-control cantidad" value="" id="cantidad" name="cantidad">
                                        </td>
                                        <td>
                                            <input type="number"  class="form-control valor_unitario" value="" id="valor_unitario" name="valor_unitario" placeholder="0">
                                        </td>
                                        <td>
                                             <p class="form-control valor_total" value="" id="valor_total" name="valor_total" placeholder="0" >  <p>
                                        </td>
                                        
                                        <td>
                                            <a href="#" class=""><span class="glyphicon glyphicon-ok aceptar" id="aceptar"></span></a>
                                        </td>



                                    </tr>

                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>

            </form>


            <form method="POST" action="Pedido">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">

                                <div class="pull-right">
                                    <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">

                                    </span>
                                </div>
                            </div>
                            <div class="panel-body">
                                <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
                            </div>
                            <table class="table table-hover" id="dev-table">
                                <thead>
                                    <tr>

                                        <th>Nombre</th>
                                        <th>Tipo de Unidad</th>
                                        <th>Cantidad</th>
                                        <th>Valor unitario</th>
                                        <th>Valot total</th>

                                        <th>Aceptar</th>


                                    </tr>
                                </thead>


                                <tbody class="lista" id="lista">
                                    

                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>

            </form>




        </div>

        <%@include file="jsp/footer.jsp" %>

    </body>
</html>
