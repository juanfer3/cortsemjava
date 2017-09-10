<%-- 
    Document   : tablaEmpleados
    Created on : 27/03/2017, 10:23:00 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="script/tablaEmpleados.js"></script>
<script src="script/EmpleadosFunc.js"></script>
<div class="container" id="listarEmpleados">
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
                            <th>#</th>
                            <th></th>
                            <th>Nombre</th>
                            <th>Documento</th>
                            <th>Cargo</th>
                            <th>Usuario</th>
                            <th>Ver</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <%ArrayList<Empleados> Listar = (ArrayList<Empleados>) request.getAttribute("listar_empleados");

                        int cont;
                        cont = 1;
                        for (Empleados myemp : Listar) {

                    %>
                    <input type="text" class="id" value="<%=myemp.getId()%>" style="visibility:hidden">
                    <tbody>
                        <tr>
                            <td><p ><%=cont%></p></td>
                            <td><p class="id" style="visibility: hidden"><%=myemp.getId()%></p></td>
                            <td><p class="nombreEmplado"><%=myemp.getNombre()%></p></td>
                            <td><p class="documentoEmpleado"><%=myemp.getDocumento()%></p></td>
                            <td><p class="cargoEmpleado"><%=myemp.getCargo()%></p></td>
                            <td><p class="userEmpleado"><%=myemp.getUsuarioId().getUsuario()%></td>
                            <td><a id="" href="#" class="verEmpleado" id="verEmpleado" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                            <td><a id="" href="#" class="ver" id="ver" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                            <td align="center"><a href="#" class="editarEmpleado" id="editarEmpleado"><span><img src="imagenes/editar.png"></span></a></td>
                            <td align="center"><a href="#" class="eliminarEmpleado" id="eliminarEmpleado"><span><img src="imagenes/borrar.png"></span></a></td>

                        </tr>

                    </tbody>

                  



                    
                    <%;%>
                    <%cont += 1;
                        }%>
                </table>
            </div>
        </div>

    </div>
    <div class="row ">

        <div class="col-xs-12 col-md-12"><a href="RegistroEmpleado.jsp" class="btn btn-success btn-block btn-lg">Registrar Empleado</a></div>
    </div>
                <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>

    <div class="container">

        <!-- Modal -->
        <div class="modal fade in" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title" id="tituloModal">Insumos</h4>
                    </div>
                    <div class="modal-body" id="VerModal">

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                    </div>
                </div>

            </div>
        </div>

    </div>
</div>
