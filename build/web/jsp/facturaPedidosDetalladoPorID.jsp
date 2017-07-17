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
    
    ListarPedidos=pedidos.BuscarUltimoPedido(38);
    ListarDetalle=detalle.BuscarDetallesDePedidosPorIdPedido(38);
%>



<script src="script/Facturas.js"></script>
<div class="container">
    <div class="row">
        <%for(Pedidos mispedidos:ListarPedidos){%>
            <div class="col-md-3 ">
            <h5>Nombre: <%=mispedidos.getClienteId().getNombre()%> </h5>
            <h5>documento:<%=mispedidos.getClienteId().getDocumento() %></h5>
            <h5>Fecha de Pedido:<%=mispedidos.getFPedido() %></h5>
            <h5>Fecha de Entrega:<%=mispedidos.getFPedido() %></h5>
            </div>
            <%}%>
            <div class="col-md- col-md-offset-9">
            <h6>Nombre: </h6>
            <h6>documento:</h6>
            <h6>Fecha de Pedido:</h6>
            <h6>Fecha de Entrega:</h6>
            </div>
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
                        <td colspan="5" align="right" style=""><p id="total"><%=total%></p></td>
                    </tr>
                    <tr>
                        <td colspan="5" align="right"><p id="iva">Iva: 19%</p></td>
                    </tr>
                    <tr>
                        <td colspan="5" align="right"><p id="total_final"></p></td>
                    </tr>
                </tfoot>
                
            </table>
        </div>
    </div>
</div>