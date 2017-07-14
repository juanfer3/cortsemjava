<%-- 
    Document   : ListarEmpleadosJSP
    Created on : 13/07/2017, 08:09:15 PM
    Author     : Juan
--%>



<%@page import="Modelo.DBEmpleado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <%
                        DBEmpleado emp=new DBEmpleado();
                        ArrayList<Empleados> Listar =new ArrayList<Empleados>();
                        Listar.clear();
                        
                        Listar=emp.Listarempleados();
                        
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
                            <td><a id="" href="#" class="verEmpleado" id="verEmpleado"><span><img src="imagenes/ojo.png"></span></a></td>
                            <td align="center"><a href="#" class="editarEmpleado" id="editarEmpleado"><span><img src="imagenes/editar.png"></span></a></td>
                            <td align="center"><a href="#" class="eliminarEmpleado" id="eliminarEmpleado"><span><img src="imagenes/borrar.png"></span></a></td>

                        </tr>

                    </tbody>

                  



                    <div id="ModalEliminar<%= myemp.getId()%>" class="modal fade" role="dialog">
                        <div class="modal-dialog modal-sm">


                            <div class="modal-content cuadromodal">
                                <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    <h4 class="modal-title text-center">Está Seguro?</h4>
                                </div>
                                <div class="modal-body">
                                    <div class="col-lg-offset-3">
                                        <a class="btn btn-primary" href="EliminarEmpleado?id=<%= myemp.getId()%>" >Si</a>
                                        <button type="button" class="btn btn-success" data-dismiss="modal">No</button>
                                    </div>

                                </div>

                            </div>


                        </div>
                    </div>
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
</div>

