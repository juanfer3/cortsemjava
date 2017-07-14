<%-- 
    Document   : SeleccionCliente
    Created on : 21/06/2017, 08:23:38 PM
    Author     : Juan
--%>

<%@page import="Modelo.Clientes"%>
<%@page import="Modelo.Telas"%>
<%@page import="Modelo.DBClientes"%>
<%@page import="Modelo.DBTelas"%>
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
        <script src="script/Telas.js"></script>
        
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
                                <h3 class="panel-title">Clientes</h3>
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
                                       
                                        <th>Referencia de tela</th>
                                        <th>Descripcion</th>
                                        <th>añadir</th>


                                    </tr>
                                </thead>

                                
                                <tbody>
                                    <tr class="padre">

                                        
                                        
                                        <td><input type="text"  class="form-control ref_tela" value="" id="ref_tela" name="ref_tela"></td>
                                        <td><input type="text"  class="form-control descripcion_tela" value="" id="descripcion_tela" name="descripcion_tela" ></td>
                                        <td><a href="#" class=""><span class="glyphicon glyphicon-ok" id="aceptartelas"></span></a></td>
                                        



                                    </tr>
                                    
                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>
                
            </form>
            
            
            
            
            <form method="POST">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Clientes</h3>
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
                                
                                <th>Referencia de tela</th>
                                <th>Descripcion</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
      
                        <tbody class="Listedetelas">
                            

                        </tbody>
                        
                        
                        
                    </table>
                </div>
            </div>

        </div>
        <div class="row ">

            <div class="col-xs-12 col-md-12"><a href="PedidosDetallados.jsp" class="btn btn-success btn-block btn-lg">Registrar Cliente</a></div>
        </div>
    </form>
            
            
        </div>

        <%@include file="jsp/footer.jsp" %>

    </body>

</html>
