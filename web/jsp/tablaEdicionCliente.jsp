<%-- 
    Document   : tablaEdicionCliente
    Created on : 20/04/2017, 10:14:07 AM
    Author     : Juan
--%>

<%@page import="Modelo.DBClientes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Clientes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    DBClientes cli = new DBClientes();
    ArrayList<Clientes> Listar = new ArrayList();
    Listar.clear();
    String id1;
    int id;
    id1 = request.getParameter("id");
    id = Integer.parseInt(id1);
    Listar = cli.ListarClientesPorID(id);


%>



<%    for (Clientes myclient : Listar) {
%>
<div class="container" id="tablaEdicionClientes">

    <div class="row">
        <div class="col-md-12">
            <form action="AceptarEdicionCliente">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title"><%=myclient.getNombre()%></h3>
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
                                <th><h4>Informacion</h4></th>
                                <th><h4>Datos</h4></th>

                            </tr>
                        </thead>    <tr> </tr>

                        <tbody>
                            <tr>
                                <th>Nombre</th>
                                <td><input type="text" style="border:none" value="<%=myclient.getNombre()%>" class="entradasdeedicion" name="nombre"> </td>
                            </tr>

                            <tr>
                                <th>Documento</th>
                                <td><input type="text" style="border:none" value="<%=myclient.getDocumento()%>" class="entradasdeedicion" name="documento"> </td>
                            </tr>

                            <tr>
                                <th>Telefono</th>
                                <td><input type="text" style="border:none" value="<%=myclient.getTelefono()%>" class="entradasdeedicion" name="telefono"></td>
                            </tr>
                            <tr>
                                <th>Celular</th>
                                <td><input type="text" style="border:none" value="<%=myclient.getCelular()%>" class="entradasdeedicion" name="celular"></td>
                            </tr>
                            <tr>
                                <th>Direccion</th>
                                <td><input type="text" style="border:none" value="<%=myclient.getDireccion()%>" class="entradasdeedicion" name="direccion"></td>
                            </tr>

                            <tr>
                                <th>Correo</th>
                                <td><input type="text" style="border:none" value="<%=myclient.getCorreo()%>" class="entradasdeedicion" name="correo"></td>
                            </tr>

                        <input value="<%=myclient.getId()%>" style="visibility:hidden" name="id">

                        </tbody>


                    </table>


                </div>
                <div class="row">
                    <div class="col-xs-6 col-md-6"><input type="submit" value="aceptar" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                    <div class="col-xs-6 col-md-6"><a href="ListarClientes" id="" class="btn btn-danger btn-block btn-lg cancelarEdicionCliente">cancelar</a></div>
                </div>
            </form>
        </div>

    </div>

</div>
<%}%>
