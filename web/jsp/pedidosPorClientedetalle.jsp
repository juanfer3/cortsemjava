<%-- 
    Document   : facturaPedidosDetalladoPorID
    Created on : 15/07/2017, 10:46:55 PM
    Author     : Juan
--%>
<%@page import="Modelo.Pedidos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.PedidosDetallados"%>
<%@page import="Modelo.DBPedidos"%>
<%@page import="Modelo.DBPedidoDetallado"%>
<%
    DBPedidos pedidos=new DBPedidos();
    DBPedidoDetallado detalle=new DBPedidoDetallado();
    
    ArrayList<Pedidos> ListarPedidos=new ArrayList();
    ArrayList<PedidosDetallados> ListarDetalle=new ArrayList();

    ListarDetalle.clear();
    ListarPedidos.clear();
    
    String id1;
    int pedido_id=0;
    float total=0;
    
    id1=(String) request.getParameter("id");
 
    
    pedido_id=Integer.parseInt(id1);
    
    ListarPedidos=pedidos.BuscarUltimoPedido(pedido_id);
    ListarDetalle=detalle.BuscarDetallesDePedidosPorIdPedido(pedido_id);
%>


<script src="script/pedidos.js"></script>
<div class="container" id="pedidoDetalleCliente">
    <div class="row">
        <%for(Pedidos mispedidos:ListarPedidos){%>
            <div class="col-md-3 ">
            <h5>Nombre: <%=mispedidos.getClienteId().getNombre()%> </h5>
            <h5>documento:<%=mispedidos.getClienteId().getDocumento() %></h5>
            <h5>Fecha de Pedido:<%=mispedidos.getFPedido() %></h5>
            <h5>Fecha de Entrega:<%=mispedidos.getFPedido() %></h5>
            <input style="visibility: hidden" value="<%=mispedidos.getId() %>">
            </div>
            
            <div class="col-md- col-md-offset-9">
                <h6>Factura N°<p id="pedido_id"><%=mispedidos.getId() %></p></h6>
            <h6>Cortsem </h6>
            <h6>Nit: 2345776-5</h6>
            <h6>Telefono: 3732682</h6>
            <h6>Dir: Cra 56 # 56 a 13</h6>
            </div>
            <%}%>
        <div class="span5">
            
            <table class="table table-striped table-condensed">
                <thead>
                    <tr>
                        <th>Prenda</th>
                        <th>Tela</th>
                        <th>Talla</th>
                        <th>Cantidad</th>
                        <th>Valor Total</th>
                        
                                                             
                    </tr>
                </thead>   
                <tbody>
                    <%
                        
                        for(PedidosDetallados misdetalle:ListarDetalle){
                        
                        total=total+misdetalle.getValorTotal();
                        
                    %>
                    <tr>
                        <td><%=misdetalle.getPrenda()%></td>
                        <td><%=misdetalle.getTelasId().getRefTela() %></td>
                        <td><%=misdetalle.getTalla()%></td>
                        <td><%=misdetalle.getCantidad() %></td>
                         <td><%=misdetalle.getValorTotal() %></td>
                       
                    </tr>
                    <%}%>                       
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="4" align="right" style=""><p>Total</p></td>
                        <td colspan="1" align="right" style=""><p id="total"><%=total%></p></td>
                    </tr>
                    <tr>
                        <td colspan="4" align="right"><p >Iva%</p></td>
                        <td colspan="1" align="right"><input name="iva" id="iva" class="form" value="19"></td>
                    </tr>
                    
                    <tr>
                        <td colspan="4" align="right"><p >Descuento%</p></td>
                        <td colspan="1" align="right"><input name="descuento" id="descuento" class="form" value="0"></td>
                    </tr>
                    <tr>
                        <td colspan="5" align="right"><p id="total_final"></p></td>
                    </tr>
                </tfoot>
                
            </table>
        </div>
    </div>
                    
                    <div class="col-xs-3 col-md-3 col-md-offset-9"><a href="#" class="btn btn-success btn-block btn-lg volverPedidos"  id="volverPedidos">Ver otros pedidos</a></div>                                    
            
</div>