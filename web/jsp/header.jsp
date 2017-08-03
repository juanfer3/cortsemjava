<%
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "no-cache");
    response.setDateHeader("Expires", 0);
%> 

 <%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%-- 
    Document   : header
    Created on : 25/02/2017, 08:23:24 PM
    Author     : JUAN FERNANDO VILLADIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
<script src="script/cambiotablas.js"></script>
<!--script>
$(function () {
$("#datepicker").datepicker();
});
</script-->

<div id="datepicker"></div>

        <%HttpSession sesion= request.getSession();
        
        
        
        
        if(sesion.getAttribute("rol")== null){
           
        
        %>
        
        
        
        
        <header>
            <div>
            <hr class="rayainicial">
        </div>
        
                                                                
        <nav class="navbar navbar-inverse barra">
            <div class="container-fluid">
                <div class="navbar-header">
                    
                    
                    
                    <a class="navbar-brand" href="#" id="cortsemindex">CORTSEM</a>
                </div>
                <ul class="nav navbar-nav">
                   

                </ul>
                <ul class="nav navbar-nav navbar-right">
                    
                   
                    <li><a href="#" id="login"><span class="glyphicon glyphicon-log-in loguito">
                                          
                            </span>Login</a></li>
                           
                </ul>
            </div>
        </nav>
        </header>
        <%}else if (sesion.getAttribute("rol").equals("Gerente")){%>
        



        <header>
           <div> 
            <hr class="rayainicial">
        </div>
        
                                                                
        <nav class="navbar navbar-inverse barra">
            <div class="container-fluid">
                <div class="navbar-header">
                    
                    
                    
                    <a class="navbar-brand" href="index.jsp" id="boton">CORTSEM</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="botoncompra"><a href="ListarEmpleados">EMPLEADOS</a></li>
                    <li class="botoncompra"><a href="ListarClientes">CLIENTES</a></li>
                    <li class="botoncompra"><a href="#">PRODUCCION</a></li>
                    <li class="botoncompra"><a href="SeleccionCliente.jsp">VENTAS</a></li>
                    <li class="botoncompra"><a href="ListarPedidos.jsp">PEDIDOS</a></li>
                    <li class="botoncompra"><a href="ListarTelas.jsp">TELAS</a></li>
                    <li class="botoncompra"><a href="ListarInsumos.jsp">INSUMOS</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    
                    <li><a href="CerrarSession"><span class="glyphicon glyphicon-log-in loguito">
                                         
                            </span>Cerrar Sesion</a></li>
                           
                </ul>
            </div>
        </nav>
        </header>
       
        <header class="menu" id="menu">
            <h5>Bienvenido</h5>
            <hr>
            <li class="menu-item">
                <a href="#">Pedidos</a>
            </li>
            <li class="menu-item">
                <a href="#">Empleados</a>
            </li>
            <li class="menu-item">
                <a href="#">Clientes</a>
            </li>
        </header>
        
        
         <%}else if (sesion.getAttribute("rol").equals("Vendedor")){%>
        



        <header>
            
            <hr class="rayainicial">
        </div>
        
                                                                
        <nav class="navbar navbar-inverse barra">
            <div class="container-fluid">
                <div class="navbar-header">
                    
                    
                    
                    <a class="navbar-brand" href="#" id="boton">CORTSEM</a>
                </div>
                <ul class="nav navbar-nav">
                    
                    <li class="botoncompra"><a href="ListarClientes">CLIENTES</a></li>
                    <li class="botoncompra"><a href="SeleccionCliente.jsp">VENTAS</a></li>
                    <li class="botoncompra"><a href="ListarPedidos.jsp">PEDIDOS</a></li>
                </ul>
                
                <ul class="nav navbar-nav navbar-right">
                    
                    <li><a href="CerrarSession"><span class="glyphicon glyphicon-log-in loguito">
                                         
                            </span>Cerrar Sesion</a></li>
                           
                </ul>
            </div>
        </nav>
        </header>
       
        <header class="menu" id="menu">
            <h5>Bienvenido</h5>
            <hr>
            <li class="menu-item">
                <a href="#">Pedidos</a>
            </li>
            <li class="menu-item">
                <a href="#">Empleados</a>
            </li>
            <li class="menu-item">
                <a href="#">Clientes</a>
            </li>
        </header>
        
        <%}else if (sesion.getAttribute("rolcliente").equals("Cliente")){%>
        
          <header>
            <div>
            <hr class="rayainicial">
        </div>
        
                                                                
        <nav class="navbar navbar-inverse barra">
            <div class="container-fluid">
                <div class="navbar-header">
                    
                    
                    
                    <a class="navbar-brand" href="#" id="boton">CORTSEM</a>
                </div>
                <ul class="nav navbar-nav">
                    
                    
                    <li class="botoncompra"><a href="ListarPedidos.jsp">PEDIDOS</a></li>
                </ul>
                
                <ul class="nav navbar-nav navbar-right">
                    
                    <li><a href="CerrarSession"><span class="glyphicon glyphicon-log-in loguito">
                                         
                            </span>Cerrar Sesion</a></li>
                           
                </ul>
            </div>
        </nav>
        </header>
       
        <header class="menu" id="menu">
            <h5>Bienvenido</h5>
            <hr>
            <li class="menu-item">
                <a href="#">Pedidos</a>
            </li>
            
        </header>
        <%}%>