<%-- 
    Document   : tablaEdicionEmpleados
    Created on : 17/04/2017, 11:05:34 AM
    Author     : Juan
--%>

<%@page import="Modelo.DBEmpleado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%          DBEmpleado emp= new DBEmpleado();
          
            ArrayList<Empleados> Listar=new ArrayList();
            Listar.clear();            
            String id1;
            int id;
            id1=request.getParameter("id");
            id=Integer.parseInt(id1);
            Listar=emp.listarEmpleadoPorId(id);

    
    for (Empleados myemp : Listar) {
%>
<div class="container" id="contenido">

    <div class="row">
        <div class="col-md-12">
            <form action="AceptarEdicionEmpleado">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><%=myemp.getNombre()%></h3>
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
                            <td><input type="text" style="border:none" value="<%=myemp.getNombre()%>" class="entradasdeedicion" name="nombre"> </td>
                        </tr>
                        
                        <tr>
                            <th>Documento</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getDocumento()%>" class="entradasdeedicion" name="documento"> </td>
                        </tr>
                        <tr>
                            <th>Cargo</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getCargo()%>" class="entradasdeedicion" name="cargo"></td>
                        </tr>
                        <tr>
                            <th>Telefono</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getTelefono()%>" class="entradasdeedicion" name="telefono"></td>
                        </tr>
                        <tr>
                            <th>Celular</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getCelular()%>" class="entradasdeedicion" name="celular"></td>
                        </tr>
                        <tr>
                            <th>Direccion</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getDireccion()%>" class="entradasdeedicion" name="direccion"></td>
                        </tr>
                        <tr>
                            <th>Rh</th>
                            <td><select class="form-control seleccion" id="sel1" style="height:45px;" name="rh">
                                        <option value="O-">O-</option>
                                        <option value="O+">O+</option>
                                        <option value="A-">A-</option>
                                        <option value="A+">A+</option>
                                        <option value="B-">B-</option>
                                        <option value="B+">B+</option>
                                        <option value="AB-">AB-</option>
                                        <option value="AB+">AB+</option>
                                    </select></td>
                        </tr>
                        <tr>
                            <th>Fecha de nacimiento</th>
                            <td><input type="date" style="border:none" value="<%=myemp.getFNacimiento()%>" class="entradasdeedicion form-control input-lg" name="f_nacimiento"></td>
                        </tr>
                        <tr>
                            <th>Contacto Familiar</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getContactoFamiliar()%>" class="entradasdeedicion" name="contacto_familiar"></td>
                        </tr>
                        <tr>
                            <th> Telefono Contacto Familiar</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getTelefonoContacto()%>" class="entradasdeedicion" name="telefono_contacto"></td>
                        </tr>
                        <tr>
                            <th>Celular Contacto Familiar</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getCelularContacto()%>" class="entradasdeedicion" name="celular_contacto"></td>
                        </tr>
                        <tr>
                            <th>Usuario</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getUsuarioId().getUsuario()%>" class="entradasdeedicion" name="usuario"></td>
                        </tr>
                                
                    <input value="<%=myemp.getId()%>" style="visibility:hidden" name="id">
                        
                    </tbody>


                </table>
                       
                    
            </div>
                    <div class="row">
                                    <div class="col-xs-6 col-md-6"><input type="submit" value="aceptar" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                                    <div class="col-xs-6 col-md-6"><a href="ListarEmpleados" class="btn btn-danger btn-block btn-lg">cancelar</a></div>
                                </div>
                    </form>
        </div>

    </div>
                      
</div>
<%

    }%>