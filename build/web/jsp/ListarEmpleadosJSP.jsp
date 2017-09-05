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
<script src="script/Empleados.js"></script>
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
                    
                    
                    <tbody>
                        <tr>
                            <td><p ><%=cont%></p></td>
                            <td><p class="empleado_id" style="visibility: hidden"><%=myemp.getId()%></p></td>
                            <td><p class="nombreEmplado"><%=myemp.getNombre()%></p></td>
                            <td><p class="documentoEmpleado"><%=myemp.getDocumento()%></p></td>
                            <td><p class="cargoEmpleado"><%=myemp.getCargo()%></p></td>
                            <td><p class="userEmpleado"><%=myemp.getUsuarioId().getUsuario()%></td>
                            
                            
                            <td><a id="ver" href="#" class="ver" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                            <td align="center"><a href="#" class="editarEmpleado" id="editarEmpleado"><span><img src="imagenes/editar.png"></span></a></td>
                            <td align="center"><a href="#" class="eliminarEmpleado" id="eliminarEmpleado"><span><img src="imagenes/borrar.png"></span></a></td>

                        </tr>

                    </tbody>

                  
                     <%--este es el modal de Ver--%>
                        <div class="modal fade" id="miModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                            <div class="modal-dialog" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                        <h4 class="modal-title myModalLabel" id="myModalLabel">Nombre Cliente: <%=myemp.getNombre()%></h4>
                                    
                                    </div>
                                    <div class="modal-body">
                                        
                                        <h5>Documento: <%=myemp.getDocumento() %></h5>
                                        <h5>Correo :<%=myemp.getCorreoPersonal()%></h5>
                                        <h5>Telefono :<%=myemp.getTelefono()%></h5>
                                        <h5>Celular :<%=myemp.getCelular()%></h5>
                                        <h5>Direccion :<%=myemp.getDireccion()%></h5>
                                        
                                        
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

             <div class="container">

        <!-- Modal -->
        <div class="modal fade in" id="myModal" role="dialog">
            <div class="modal-dialog">

                <!-- Modal content-->
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                        <h4 class="modal-title" id="tituloModal">Empleados</h4>
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