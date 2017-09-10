<%-- 
    Document   : tablaClientes
    Created on : 19/04/2017, 11:14:34 AM
    Author     : Juan
--%>

<%@page import="Modelo.Clientes"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="script/ListarCliente.js"></script>

<%

    String rol;
    rol = ((String) session.getAttribute("rol"));%>



<div class="container" id="tablaClientes">
    <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>

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
                            <%if (rol.equals("Gerente") || rol.equals("Jefe de Ventas") || rol.equals("Vendedor")) {%>
                            
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Documento</th>

                            <th>Usuario</th>
                            <th></th>
                            <th>Ver Detalle</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                                <%} else {%>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Documento</th>

                            <th>Usuario</th>
                            <th></th>
                            <th>Ver Detalle</th>
                                <%}%>
                        </tr>
                    </thead>
                    <%ArrayList<Clientes> Listar = (ArrayList<Clientes>) request.getAttribute("Listar_Clientes");
                        int cont;
                        cont = 1;

                        for (Clientes cli : Listar) {

                    %>

                    <tbody>
                        <tr>
                            <td><%=cont%></td>
                            <td><%=cli.getNombre()%></td>
                            <td><%=cli.getDocumento()%> </td>

                            <td><%=cli.getUsuarioId().getUsuario()%></td>
                            <td><input type="text" class="cliente_id" value="<%=cli.getId()%>" style="visibility:hidden" id="id"></td>
                               
                            
                            <%if (rol.equals("Gerente") || rol.equals("Jefe de Ventas") || rol.equals("Vendedor")) {%>

                            <td><a id="ver" href="#" class="ver" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                            <td><a href="#" id="editar" class="editar"><span><img src="imagenes/editar.png"></span></a></td>

                            <td><a href="#" class="eliminar" id="eliminar"><span><img src="imagenes/borrar.png"></span></a></td>
                                      
                            
                            <%} else {%>
                            
                            <td><a id="ver" href="#" class="ver" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                                        
                            <%}%>

                        </tr>

                    </tbody>


                    <%;%>
                    <%cont += 1;
                            };%>
                </table>
            </div>
        </div>

    </div>
    <div class="row ">
        <%if (rol.equals("Gerente") || rol.equals("Jefe de Ventas") || rol.equals("Vendedor")) {%>
        <div class="col-xs-12 col-md-12"><a href="RegistroClientes.jsp" class="btn btn-success btn-block btn-lg">Registrar Cliente</a></div>
        <%}%>


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
                        <h4 class="modal-title" id="tituloModal">Clientes</h4>
                    </div>
                    <div class="modal-body" id="VerModal">

                    </div>
                    <div class="modal-footer">

                        <button type="button" class="btn btn-primary" data-dismiss="modal">Cerrar</button>
                    </div>
                </div>

            </div>
        </div>

    </div>
</div>
