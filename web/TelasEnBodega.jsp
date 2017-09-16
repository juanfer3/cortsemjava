<%-- 
    Document   : TelaRecibida
    Created on : 13/09/2017, 09:28:00 PM
    Author     : Juan
--%>

<%@page import="Modelo.TelasRecibidas"%>
<%@page import="Modelo.DBTelasRecibidas"%>
<%@page import="Modelo.Clientes"%>
<%@page import="Controlador.ListarClientes"%>
<%@page import="Modelo.DBClientes"%>
<%@page import="Modelo.Telas"%>
<%@page import="Modelo.Pedidos"%>
<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.DBPedidos"%>
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
        <script src="script/RecibirTelas.js"></script>
    </head>
    <body>
        <%

            String rol;
            rol = ((String) session.getAttribute("rol"));
            
            DBTelasRecibidas telas = new DBTelasRecibidas();
           


            ArrayList<TelasRecibidas> ListarTelas = new ArrayList();
            
            ListarTelas.clear();
           
            ListarTelas=telas.ListarTelasEnBodega();
            

        %>
        <%@include file="jsp/header.jsp" %>

        <div class="container" id="ocultarlistarclientes">
            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <form method="POST" action="Pedido">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Telas Recibidas</h3>
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
                                        <th>Tipo de Unidad</th>
                                        <th>Cantidad</th>
                                        <th>Cliente</th>
                                        <th>Registrar</th>
                                    </tr>
                                </thead>


                                <tbody>
                                     <%for (TelasRecibidas Telas : ListarTelas) {%>
                                    <tr class="padre">
                                        <td><%=Telas.getIdTela().getRefTela()%></td>

                                        <td><%=Telas.getIdTela().getDescripcion() %></td>

                                        <td><%=Telas.getTipoDeUnidad()%></td>

                                        <td><%=Telas.getCantidad()%></td>
                                        
                                        <td><%=Telas.getIdCliente().getNombre()%></td>
                                      

                                        <td><a href="#" class=""><span class="glyphicon glyphicon-ok" id="aceptar"></span></a></td>


                                        <%}%>

                                    </tr>

                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>

            </form>
                                        <div class="row ">
        
        <div class="col-xs-12 col-md-12"><a href="TelaRecibida.jsp" class="btn btn-success btn-block btn-lg">Ingresar Telas</a></div>
        
    </div>



            


        </div>

        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
