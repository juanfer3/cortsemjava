<%-- 
    Document   : ListarEmpleadosJSP
    Created on : 13/07/2017, 08:09:15 PM
    Author     : Juan
--%>



<%@page import="Modelo.Insumos"%>
<%@page import="Modelo.DBInsumos"%>
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
                            <th>Tipo de unidad</th>
                            <th>Cantidad</th>
                            <th>Valor unitario</th>
                            <th>Valor total</th>
                            <th>Ver</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <%
                        DBInsumos ins=new DBInsumos();
                        ArrayList<Insumos> Listar =new ArrayList();
                        Listar.clear();
                        
                        Listar=ins.Listarinsumos();
                        
                        int cont;
                        cont = 1;
                        for (Insumos myinsumos : Listar) {

                    %>
                    
                    <tbody>
                        <tr>
                            <td><p ><%=cont%></p></td>
                            <td><p class="id" style="visibility: hidden"><%=myinsumos.getId()%></p></td>
                            <td><p class="nombreEmplado"><%=myinsumos.getNombre()%></p></td>
                            <td><p class="documentoEmpleado"><%=myinsumos.getTipoDeUnidad() %></p></td>
                            <td><p class="cargoEmpleado"><%=myinsumos.getCantidad()%></p></td>
                            <td><p class="userEmpleado"><%=myinsumos.getValorUnitario() %></td>
                            <td><p class="userEmpleado"><%=myinsumos.getValorTotal() %></td>
                            <td><a id="" href="#" class="verEmpleado" id="verEmpleado"><span><img src="imagenes/ojo.png"></span></a></td>
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

        <div class="col-xs-12 col-md-12"><a href="CrearInsumos.jsp" class="btn btn-success btn-block btn-lg">Registrar Insumos</a></div>
    </div>
</div>

