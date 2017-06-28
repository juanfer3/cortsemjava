<%-- 
    Document   : PaginaPedido
    Created on : 25/02/2017, 09:18:28 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="script/fun.js"></script>
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <script></script>
        <title>JSP Page</title>
    <body>

        <%@include file="jsp/header.jsp" %>

        <div class="container" id="contenido">
            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title">Empleados</h3>
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
                                    <th>Documento</th>
                                    <th>Fecha de Pedido</th>
                                    <th>Fecha de Entrega</th>
                                    
                                    
                                </tr>
                            </thead>

                            <tbody>
                                <tr>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion inputpedido " name="nombre" id="nombre"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion inputpedido " name="documento" id="documento"></td>
                                    <td><input type="date" style="border:none" value="" class="entradasdeedicion form-control input-md" name="f_pedido" id="f_pedido"></td>
                                    <td><input type="date" style="border:none" value="" class="entradasdeedicion form-control input-md " name="f_entrega" id="f_entrega"></td>
                                    
                                </tr>
                                <tr>
                                    <th>Pedido</th>
                                    <th></th>
                                    <th></th>
                                    
                                    
                                    <th>Adherir</th>

                                </tr>
                                <tr class="padre">

                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion prenda borrar" name="" placeholder="prenda" id="prenda"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion pieza borrar" name="" placeholder="pieza" id="pieza"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion talla borrar" name="" placeholder="talla" id="talla"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="cantidad" id="cantidad"></td>
                                    
                                    
                                    
                                </tr>
                                <tr>
                                    
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="ref_tela" id="ref_tela"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="descripcion_tela" id="descripcion_tela"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="diseno_tela" id="diseno_tela"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="valor_unitario" id="valor_unitario"></td>
                                    
                                </tr>
                                <tr>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="iva" id="iva"></td>
                                    <td><input type="text" style="border:none" value="" class="entradasdeedicion cantidad borrar" name="" placeholder="valor_total" id="valor_total"></td>
                                    <td></td>
                                    <td></td>
                                </tr>

                            </tbody>


                        </table>
                    </div>
                </div>


            </div>








            <div class="row ">

                <div class="col-xs-12 col-md-12"><a href="#" class="btn btn-success btn-block btn-lg hijo">Adherir</a></div>
            </div>


            <div id="tabla">

            </div>











            
        </div>

        <%@include file="jsp/footer.jsp" %>

    </body>
</html>
