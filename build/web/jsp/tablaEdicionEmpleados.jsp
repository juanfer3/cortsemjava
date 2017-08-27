<%-- 
    Document   : tablaEdicionEmpleados
    Created on : 17/04/2017, 11:05:34 AM
    Author     : Juan
--%>

<%@page import="Modelo.DBEmpleado"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="script/tablaEdicionEmpleadosFunc.js"></script>
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
<div class="container" id="tablaEdicionEmpleados">

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
                            <td><input type="text" style="" value="<%=myemp.getNombre()%>" class="form-control nombbre" name="nombre" id="nombre"> </td>
                        </tr>
                        
                        <tr>
                            <th>Documento</th>
                            <td><p style=""  class="form-control" name="documento" id="documento"> <%=myemp.getDocumento()%></p></td>
                        </tr>
                        <tr>
                            <th>Cargo</th>
                            <td><input type="text" style="" value="<%=myemp.getCargo()%>" class="form-control" name="cargo" id="cargo"></td>
                        </tr>
                        <tr>
                            <th>Correo Personal</th>
                            <td><input type="text" style="" value="<%=myemp.getCorreoPersonal()%>" class="form-control" name="correo_personal" id="correo_personal"></td>
                        </tr>
                        <tr>
                            <th>Telefono</th>
                            <td><input type="text" style="" value="<%=myemp.getTelefono()%>" class="form-control" name="telefono" id="telefono"></td>
                        </tr>
                        <tr>
                            <th>Celular</th>
                            <td><input type="text" style="" value="<%=myemp.getCelular()%>" class="form-control" name="celular" id="celular"></td>
                        </tr>
                        <tr>
                            <th>Direccion</th>
                            <td><input type="text" style="" value="<%=myemp.getDireccion()%>" class="form-control" name="direccion" id="direccion"></td>
                        </tr>
                        <tr>
                            <th>Rh</th>
                            <td><select class="form-control seleccion" id="rh" style="height:45px;" name="rh">
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
                            <td><input type="date" style="" value="<%=myemp.getFNacimiento()%>" class="form-control input-lg" name="f_nacimiento" id="f_nacimiento"></td>
                        </tr>
                        <tr>
                            <th>Contacto Familiar</th>
                            <td><input type="text" style="" value="<%=myemp.getContactoFamiliar()%>" class="form-control" name="contacto_familiar" id="contacto_familiar"></td>
                        </tr>
                        <tr>
                            <th> Telefono Contacto Familiar</th>
                            <td><input type="text" style="" value="<%=myemp.getTelefonoContacto()%>" class="form-control" name="telefono_contacto" id="telefono_contacto"></td>
                        </tr>
                        <tr>
                            <th>Celular Contacto Familiar</th>
                            <td><input type="text" style="" value="<%=myemp.getCelularContacto()%>" class="form-control" name="celular_contacto" id="celular_contacto"></td>
                        </tr>
                        <tr>
                            <th>Usuario</th>
                            <td><input type="text" style="border:none" value="<%=myemp.getUsuarioId().getUsuario()%>" class="form-control" name="usuario" id="usuario"></td>
                        </tr>
                                
                    <input value="<%=myemp.getId()%>" style="visibility:hidden" name="id" id="id">
                        
                    </tbody>


                </table>
                       
                    
            </div>
                    <div class="row">
                        <div class="col-xs-6 col-md-6"><input type="button" value="aceptar" class="btn btn-primary btn-block btn-lg aceptar" tabindex="7" id="aceptarEdicion"></div>
                                    <div class="col-xs-6 col-md-6"><a href="ListarEmpleados" class="btn btn-danger btn-block btn-lg cancelar" id="cancelar">cancelar</a></div>
                                </div>
                    </form>
        </div>

    </div>
                      
</div>
<%

    }%>