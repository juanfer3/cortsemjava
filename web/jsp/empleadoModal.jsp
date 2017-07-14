<%-- 
    Document   : empleadoModal
    Created on : 9/07/2017, 04:20:06 PM
    Author     : Juan
--%>

<%@page import="Modelo.Empleados"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.DBEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    DBEmpleado emp=new DBEmpleado();
    ArrayList<Empleados> Listar=new ArrayList();
    
    String id1;
    int id;
    id1=request.getParameter("id");
    id=Integer.parseInt(id1);
    Listar=emp.listarEmpleadoPorId(id);
    
    for(Empleados myemp:Listar){
            
%>
        myemp.getNombre();
        myemp.getDocumento();
        myemp.getFNacimiento();
        myemp.getTelefono();
        myemp.getContactoFamiliar();
    
    
<%}%>
