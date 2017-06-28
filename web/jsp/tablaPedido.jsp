<%-- 
    Document   : tablaPedido
    Created on : 11/04/2017, 08:32:04 PM
    Author     : Juan
--%>

<%@page import="Modelo.Pedidos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>	
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

    <script>
        $(document).ready(function (e) {

            $('#detalles').on('click', function () {

                $('#contenido').attr('src', 'prueba.html');


            });

        });


    </script>
</head>
<div class="container" id="contenido">
    <h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Developers</h3>
                    <div class="pull-right">
                        <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">
                            <i class="glyphicon glyphicon-filter"></i>
                        </span>
                    </div>
                </div>
                <div class="panel-body">
                    <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
                </div>
                <table class="table table-hover" id="dev-table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Nit</th>
                            <th>Numero de Pedido</th>
                            <th>Ver Detalle</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <%ArrayList<Pedidos> rs = (ArrayList<Pedidos>) request.getAttribute("ListarPedidos");
                        ResultSet rsc = (ResultSet) request.getAttribute("ListarClientes");
                        int cont;
                        cont = 1;
                        try {
                       for(Pedidos var : rs) {
                            
                        

                    %>
                    <tbody>
                        <tr>
                            <td><%=cont%></td>
                            <td><%=var.getId()%></td>
                            <td><%=var.getDescripcion()%></td>
                            <td>hola</td>
                            <td><a  href="EditarPedidos?id=1" ><span><img src="imagenes/ojo.png"></span></a></td>
                            <td><a href="#" id="editar"><span><img src="imagenes/editar.png"></span></a></td>
                            <td><a href="#" id="eliminar"><span><img src="imagenes/borrar.png"></span></a></td>

                        </tr>

                    </tbody>
                    
                    
                    <%cont +=1;
                        }%>
                     <%   } catch (Exception e) {
                            e.printStackTrace();
                        }%>
                </table>
            </div>
        </div>

    </div>
</div>
