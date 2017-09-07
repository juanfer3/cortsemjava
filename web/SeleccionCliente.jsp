<%-- 
    Document   : SeleccionCliente
    Created on : 21/06/2017, 08:23:38 PM
    Author     : Juan
--%>

<%@page import="Modelo.Clientes"%>
<%@page import="Modelo.Telas"%>
<%@page import="Modelo.DBClientes"%>
<%@page import="Modelo.DBTelas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">     
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <title>Seleccionar Cliente</title>
        <script src="script/Alertas/alertify.js"></script>
        <script type="text/javascript">
//override defaults
            alertify.defaults.transition = "slide";
            alertify.defaults.theme.ok = "btn btn-primary";
            alertify.defaults.theme.cancel = "btn btn-danger";
            alertify.defaults.theme.input = "form-control";
        </script>
        <script src="script/cambiotablas.js"></script>
        <script src="script/SelectCliente.js"></script>
        <script ></script>
    </head>
    <% DBTelas telas = new DBTelas();
        DBClientes client = new DBClientes();

        ArrayList<Telas> ListarTelas = new ArrayList();
        ArrayList<Clientes> ListarClientes = new ArrayList();

        ListarTelas.clear();
        ListarClientes.clear();

        %>
    <body>

        <%@include file="jsp/header.jsp" %>

        <div class="container" id="ocultarlistarclientes">
            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <form method="POST" action="Pedido">
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
                                        <th>Nombre</th>
                                        


                                    </tr>
                                </thead>

                                <input type="text" class="id" value="" style="visibility:hidden">
                                <tbody>
                                    <tr>

                                        <td>
                                            <select class="form-control" style="height: 32px;" name="cliente">
                                                <%ListarClientes = client.ListarClientes();
                                                    int cont;
                                                    cont = 1;

                                                    for (Clientes cli : ListarClientes) {

                                                %>

                                                <option value="<%=cli.getId()%>" style="height: 32px;" > <%=cli.getNombre()%></option>

                                                <%;%>
                                                <%cont += 1;
                                                %>                                                


                                                <%
                                                    }%>
                                            </select>


                                        </td>

                                        <!--td><input type="date"  class="form-control" value="" id="f_pedido" name="f_pedido"></td>
                                        <td><input type="date"  class="form-control" value="" id="f_entrega" name="f_entrega" ></td-->




                                    </tr>

                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>
                <div class="row ">

                    <div class="col-xs-12 col-md-12"><input class="btn btn-success btn-block btn-lg" id="aceptar" value="Aceptar" type="submit"></div>
                </div>
            </form>
        </div>
                                          
        <%@include file="jsp/footer.jsp" %>

    </body>

</html>
