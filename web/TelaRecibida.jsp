<%-- 
    Document   : TelaRecibida
    Created on : 13/09/2017, 09:28:00 PM
    Author     : Juan
--%>

<%@page import="Modelo.Clientes"%>
<%@page import="Controlador.ListarClientes"%>
<%@page import="Modelo.DBClientes"%>
<%@page import="Modelo.Telas"%>
<%@page import="Modelo.Pedidos"%>
<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.DBPedidos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="java/alertify.min.js"></script>
        <!-- include alertify.css -->
        <link rel="stylesheet" href="estilos/alertify.core.css">
        <link rel="stylesheet" href="estilos/alertify.default.css">
        
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">     
       
        <link rel="stylesheet" href="bootstrap/css/estilos.css">
        
        <title>Telas</title>
        
        <script src="script/cambiotablas.js"></script>
        <script src="script/TelaARecibir.js"></script>
    </head>
    <body>
           <%

    String rol;
    rol = ((String) session.getAttribute("rol"));
           DBPedidos pedidos = new DBPedidos();
            DBTelas mytelas = new DBTelas();
            DBClientes client = new DBClientes();

            ArrayList<Pedidos> ListarPedido = new ArrayList();
            ArrayList<Telas> ListarTelas = new ArrayList();
            ArrayList<Clientes> ListarClientes = new ArrayList();
            ListarPedido.clear();
            ListarTelas.clear();
            ListarClientes.clear();

            int pedido_id = pedidos.TomarUltimoId();
            ListarPedido = pedidos.BuscarUltimoPedido(pedido_id);
            ListarTelas = mytelas.ListarTelas();
           
           %>
        <%@include file="jsp/header.jsp" %>

        <div class="container" id="ocultarlistarclientes">
            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <form method="POST" action="Pedido">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Telas Recibidas</h3>
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
                                       
                                        <th>Referencia de tela</th>
                                        <th>Descripcion</th>
                                        <th>Tipo de Unidad</th>
                                        <th>Cantidad</th>
                                        <th>Cliente</th>
                                        <th>Registrar</th>
                                    </tr>
                                </thead>

                                
                                <tbody>
                                    <tr class="padre">
                                        <td><select class="form-control tela" id="tela">
                                                <%for (Telas misTelas : ListarTelas) {%>
                                                <option value="<%=misTelas.getId()%>" id="nombretela" class="nombretela"><%=misTelas.getRefTela()%></option>
                                                <%}%>
                                        </td>
                                            </select>
                                        
                                        <td><input type="text"  class="form-control descripcion" value="" id="descripcion" name="descripcion" disabled></td>
                                        
                                        <td><input type="text"  class="form-control tipo_de_unidad" value="" id="tipo_de_unidad" name="tipo_de_unidad"></td>
                                        
                                        <td><input type="text"  class="form-control cantidad" value="" id="cantidad" name="cantidad"></td>
                                        
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
                                        
                                        
                                        <td><a href="#" class=""><span class="glyphicon glyphicon-ok" id="aceptartelas"></span></a></td>
                                      



                                    </tr>
                                    
                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>
                
            </form>
            
            
            
            
            <form method="POST">
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
                                
                                <th>Referencia de tela</th>
                                <th>Descripcion</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
      
                        <tbody class="Listedetelas">
                            

                        </tbody>
                        
                        
                        
                    </table>
                </div>
            </div>

        </div>
        <div class="row ">

            <div class="col-xs-12 col-md-12"><a href="PedidosDetallados.jsp" class="btn btn-success btn-block btn-lg">Registrar Pedido</a></div>
        </div>
    </form>
            
            
        </div>

        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
