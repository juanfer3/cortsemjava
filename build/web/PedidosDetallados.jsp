<%-- 
    Document   : PedidosDetallados
    Created on : 24/06/2017, 05:47:00 PM
    Author     : Juan
--%>

<%@page import="Controlador.Pedido"%>
<%@page import="Modelo.Telas"%>
<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.Pedidos"%>
<%@page import="javafx.scene.input.KeyCode"%>
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
        
        <script src="script/cambiotablas.js"></script>
        <script src="script/PedidosDetallados.js"></script>
        <script ></script>
        <title>Pedidos Detallados</title>
    </head>
    <body>
        
        <%
            DBPedidos pedidos=new DBPedidos();
            DBTelas mytelas=new DBTelas();
            
            ArrayList<Pedidos> ListarPedido= new ArrayList();
            ArrayList<Telas> ListarTelas= new ArrayList();
            
            ListarPedido.clear();
            ListarTelas.clear();
            
            int pedido_id=pedidos.TomarUltimoId();
            ListarPedido = pedidos.BuscarUltimoPedido(pedido_id);
            ListarTelas = mytelas.ListarTelas();
         
        
        %>
        
        <%@include file="jsp/header.jsp" %>

        <div class="container" id="ocultarlistarclientes">
            <div>  
         <%for(Pedidos mypedidos: ListarPedido){%>   
         <h6>N°Pedido:&nbsp;<p id="pedido_id"><%=mypedidos.getId()%></p> </h6>
         <h6>Cliente: <%=mypedidos.getClienteId().getNombre()%></h6>
         <h6>Fecha de Pedido: <%=mypedidos.getFPedido()%></h6>
         <h6>Fecha de Entrega: <%=mypedidos.getFEntrega()%></h6>
         <%}%>   
            </div>
            <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
            <form method="POST" action="Pedido">
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <%for(Pedidos mypedidos: ListarPedido){%>
                                <h3 class="panel-title"><%=mypedidos.getClienteId().getNombre()%></h3>
                                <%}%>
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
                                       
                                        <th>Prenda</th>
                                        <th>Tela</th>
                                        <th>Talla</th>
                                        <th>cantidad</th>
                                        <th>valor Unitario</th>
                                        <th>Valor Total</th>
                                        <th>Aceptar</th>
                                        

                                    </tr>
                                </thead>

                                
                                <tbody>
                                    <tr class="padre">

                                        
                                        
                                        <td><input type="text"  class="form-control prenda" value="" id="prenda" name="prenda"></td>
                                        
                                        <td>
                                            <select class="form-control" id="tela">
                                                <%for(Telas misTelas: ListarTelas){%>
                                                <option value="<%=misTelas.getId()%>" id="nombretela" class="nombretela"><%=misTelas.getRefTela()%></option>
                                                <%}%>
                                                
                                            </select>
                                            
                                            
                                        </td>
                                        
                                        <td><input type="text"  class="form-control talla" value="" id="talla" name="talla"></td>
                                        <td><input type="number"  class="form-control cantidad" value="" id="cantidad" name="cantidad" placeholder="0"></td>
                                        <td><input type="number"  class="form-control valor_unitario" value="" id="valor_unitario" name="valor_unitario" placeholder="0"></td>
                                        <td><p  class="form-control valor_total" value="0" id="valor_total" name="valor_total">0</p></td>
                                        <td><a href="#" class=""><span class="glyphicon glyphicon-ok" id="RegistroDetallado"></span></a></td>
                                                


                                    </tr>
                                    
                                </tbody>








                            </table>
                        </div>
                    </div>

                </div>
                
            </form>
            
            
                                                <div id="tablaPedidosDetallados">
                                                    
                                                    
                                                </div>
            
            <!--form method="POST">
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
                                
                                <th>Prenda</th>
                                <th>Tela</th>
                                <th>Talla</th>
                                <th>Cantidad</th>
                                
                                <th>Valor Total</th>
                                <th>Valor Total</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
      
                        <tbody class="ListedePedidos">
                            
                        </tbody>
                        
                        
                        
                    </table>
                </div>
            </div>
            
        </div>
        <div class="row ">

            <div class="col-xs-12 col-md-12"><a href="#" class="btn btn-success btn-block btn-lg">Registrar Cliente</a></div>
        </div>
    </form-->
            
            
        </div>

        <%@include file="jsp/footer.jsp" %>
    </body>
</html>
