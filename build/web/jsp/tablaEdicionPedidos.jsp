<%-- 
    Document   : tablaPedido
    Created on : 11/04/2017, 08:32:04 PM
    Author     : Juan
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container" id="contenido">
    
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"></h3>
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
                    <%ResultSet rs = (ResultSet) request.getAttribute("pedido_id");

                        int cont;
                        cont = 1;
                        while (rs.next()) {

                    %>
                    <tbody>
                        <tr>
                            <td><input type="text" style="border:none" value="<%=cont%>" class="entradasdeedicion"></td>
                            <td><input type="text" style="border:none" value="<%=rs.getInt(2)%>" class="entradasdeedicion"></td>   
                            <td><input type="text" style="border:none" value="<%=rs.getString(3)%>" class="entradasdeedicion"></td>
                            <td><input type="text" style="border:none" value="<%=rs.getInt(4)%>" class="entradasdeedicion"></td>
                            <td><input type="text" style="border:none" value="<%=rs.getInt(5)%>" class="entradasdeedicion"></td>
                            <td><input type="text" style="border:none" value="<%=rs.getInt(1)%>" class="entradasdeedicion"></td>
                            <td><input type="text" style="border:none" value="<%=rs.getInt(1)%>" class="entradasdeedicion"></td>

                            <td><a href="#" id="editar"><span>Aceptar</span></a></td>


                        </tr>

                    </tbody>
                    <%;%>
                    <%cont += 1;
                        }%>
                </table>
            </div>
        </div>

    </div>
</div>
