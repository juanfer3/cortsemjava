/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBEmpleado {
    
    
     public boolean RegistrarEmpleado(String nombre, String documento, String cargo,String telefono, String celular, String f_nacimineto, String rh, String contacto_familiar, String telefono_contacto, String celular_contacto,String direccion, int usuario_id) {
            String habilitado = "si";
            String sql = "INSERT INTO empleados(nombre, documento, cargo, telefono, celular, f_nacimiento, rh, contacto_familiar, telefono_contacto, celular_contacto, direccion, usuario_id, habilitado) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            int r = 0;

            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, nombre);
                pst.setString(2, documento);
                pst.setString(3, cargo);
                pst.setString(4, telefono);
                pst.setString(5, celular);
                pst.setString(6, f_nacimineto);
                pst.setString(7, rh);
                pst.setString(8, contacto_familiar);
                pst.setString(9, telefono_contacto);
                pst.setString(10,celular_contacto);
                pst.setString(11,direccion);
                pst.setInt(12, usuario_id);
                pst.setString(13, habilitado);
                

                r = pst.executeUpdate();
                if(r!=0){
                
                    bd.cierraConexion();
                    return true;
                
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        }

        public int BuscarIDEmpleado(String nombre, String nit) {
            int u = 0;
            String sql = "SELECT * FROM empleados WHERE nombre='" + nombre + "';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {

                    u = rs.getInt(1);
                    return u;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            return u;

        }
       
        public ArrayList Listarempleados(){
        ArrayList<Empleados> Listar= new  ArrayList();
        Listar.clear();
        ResultSet rs=null;
        Date fecha_n;              
        String habilitado="si";
        
        String sql="SELECT empleados.nombre, empleados.documento, empleados.cargo, empleados.telefono, empleados.celular, empleados.f_nacimiento, empleados.rh, empleados.contacto_familiar,empleados.telefono_contacto,empleados.celular_contacto,empleados.direccion,empleados.id,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id where empleados.habilitado='si';";
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
                Empleados myemp = new Empleados();
                    Usuarios myuser=new Usuarios();
                    
                    myemp.setNombre(rs.getString("nombre"));
                    myemp.setDocumento(rs.getString("documento"));
                    myemp.setCargo(rs.getString("cargo"));
                    myemp.setTelefono(rs.getString("telefono"));
                    myemp.setCelular(rs.getString("celular"));
                    myemp.setFNacimiento(rs.getDate("f_nacimiento"));
                    myemp.setRh(rs.getString("rh"));
                    myemp.setContactoFamiliar(rs.getString("contacto_familiar"));
                    myemp.setTelefonoContacto(rs.getString("telefono_contacto"));
                    myemp.setCelularContacto(rs.getString("celular_contacto"));
                    myemp.setDireccion(rs.getString("direccion"));
                    
                    myuser.setUsuario(rs.getString("usuario"));
                    myemp.setId(rs.getInt("id"));
                    myemp.setUsuarioId(myuser);
                    
                    
                    Listar.add(myemp);
                
                
            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            printStackTrace();
        }
        
        
        return Listar;
    }
        
        
        public boolean EliminarEmpleados(int id){
            
            int r=0;
            String sql, habilitado;
            habilitado="no";
           
            sql="UPDATE empleados set habilitado='"+habilitado+"' WHERE id='"+id+"';";
                    
            ConexionBD bd=new ConexionBD ();
            Connection con= bd.conectar();
            
         try {
             Statement st= con.createStatement();
             r=st.executeUpdate(sql);
             
             if(r!=0){
             
             return true;
             
             }
         } catch (SQLException ex) {
             Logger.getLogger(DBEmpleado.class.getName()).log(Level.SEVERE, null, ex);
         }
        
            
            
            return false;
        
        }
        
        
        
        public boolean EditarEmpleado(String nombre, 
                String documento, 
                String cargo,String telefono, 
                String celular, String f_nacimineto, 
                String rh, String contacto_familiar, 
                String telefono_contacto, String celular_contacto,
                String direccion, int id){
        
         int r=0;
            String sql, habilitado;
            habilitado="no";
           
            sql="UPDATE empleados set nombre='"+nombre+"', documento='"+documento+"', cargo='"+cargo+"', celular='"+celular+"',telefono='"+telefono+"',contacto_familiar='"+contacto_familiar+"',telefono_contacto='"+telefono_contacto+"',celular_contacto='"+celular_contacto+"',direccion='"+direccion+"' WHERE id='"+id+"';";
                    
            ConexionBD bd=new ConexionBD ();
            Connection con= bd.conectar();
            
         try {
             Statement st= con.createStatement();
             r=st.executeUpdate(sql);
             
             if(r!=0){
             
             return true;
             
             }
         } catch (SQLException ex) {
             Logger.getLogger(DBEmpleado.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return false;
        }
        
        public ArrayList listarEmpleadoPorId(int id){
        
            ArrayList<Empleados> Listar= new  ArrayList();
        Listar.clear();
        ResultSet rs=null;
        Date fecha_n;              
        String habilitado="si";
        
        String sql="SELECT empleados.nombre, empleados.documento, empleados.cargo, empleados.telefono, empleados.celular, empleados.f_nacimiento, empleados.rh, empleados.contacto_familiar,empleados.telefono_contacto,empleados.celular_contacto,empleados.direccion,empleados.id,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id where empleados.habilitado='si' AND empleados.id='"+id+"';";
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.next()){
                Empleados myemp = new Empleados();
                    Usuarios myuser=new Usuarios();
                    
                    myemp.setNombre(rs.getString("nombre"));
                    myemp.setDocumento(rs.getString("documento"));
                    myemp.setCargo(rs.getString("cargo"));
                    myemp.setTelefono(rs.getString("telefono"));
                    myemp.setCelular(rs.getString("celular"));
                    myemp.setFNacimiento(rs.getDate("f_nacimiento"));
                    myemp.setRh(rs.getString("rh"));
                    myemp.setContactoFamiliar(rs.getString("contacto_familiar"));
                    myemp.setTelefonoContacto(rs.getString("telefono_contacto"));
                    myemp.setCelularContacto(rs.getString("celular_contacto"));
                    myemp.setDireccion(rs.getString("direccion"));
                    
                    myuser.setUsuario(rs.getString("usuario"));
                    myemp.setId(rs.getInt("id"));
                    myemp.setUsuarioId(myuser);
                    
                    
                    Listar.add(myemp);
                
                
            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            printStackTrace();
        }
        
        
        return Listar;
        
        
        }
        
        
    }
   
    

