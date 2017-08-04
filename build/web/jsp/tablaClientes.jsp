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
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Documento</th>
                               
                                <th>Usuario</th>
                                 <th></th>
                                <th>Ver Detalle</th>
                                <th>Editar</th>
                                <th>Eliminar</th>
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
                                <td><a id="" href="#" class="ver" id="ver" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                                <td><a href="#" id="editar" class="editar"><span><img src="imagenes/editar.png"></span></a></td>

                                <td><a href="#" class="eliminar" id="eliminar"><span><img src="imagenes/borrar.png"></span></a></td>



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

            <div class="col-xs-12 col-md-12"><a href="RegistroClientes.jsp" class="btn btn-success btn-block btn-lg">Registrar Cliente</a></div>
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
