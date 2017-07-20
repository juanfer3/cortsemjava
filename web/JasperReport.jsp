<%-- 
    Document   : JasperReport
    Created on : 16/07/2017, 01:31:14 PM
    Author     : Juan
--%>

<%@page import="java.sql.Connection"%>
<%@page import="Modelo.ConexionBD"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="net.sf.jasperreports.engine.*" %>
<%@page import="net.sf.jasperreports.view.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Facturas</h1>
        <%
        ConexionBD con= new ConexionBD();
        
        Connection conectar=con.conectar();
        
        File reportfile= new File(application.getRealPath("ArchivosPDF/te.jasper"));
        
        Map<String, Object> parameter= new HashMap<String, Object>();
        
       // String hb = request.getParameter("hb");
        
        //parameter.put("hb", new String(hb)); 
        
        byte[] bytes= JasperRunManager.runReportToPdf(reportfile.getPath(),parameter,conectar);
        
        response.setContentType("application/pdf");
        response.setContentLength(bytes.length);
        ServletOutputStream outputStream=response.getOutputStream();
        outputStream.write(bytes,0,bytes.length);
        

        //limpiar flujo de salida
        
        outputStream.flush();
        outputStream.close();

        %>
    </body>
</html>
