/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
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
public class DBUsuarios {

    public boolean RegistrarUsuario(String usuario, String contrasena) {
        String habilitado = "si";
        String sql = "INSERT INTO usuarios(usuario, contrasena, habilitado ) VALUES(?,?,?);";
        int r = 0;

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, usuario);
            pst.setString(2, contrasena);
            pst.setString(3, habilitado);

            r = pst.executeUpdate();
            if(r!=0){
            
                bd.cierraConexion();
                return true;
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int BuscarIDUsuario(String usuario, String contrasena) {
        int u = 0;
        String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "' AND contrasena='" + contrasena + "';";
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

    public ResultSet ListarUsuarios() {
        int u = 0;
        ResultSet rs = null;
        String habilitado;
        habilitado = "si";
        String sql = "SELECT * FROM usuarios WHERE habilitado='" + habilitado + "';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {

                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

    public ResultSet BuscarUsuarioPorID(int id) {

        ResultSet rs = null;
        String sql = "SELECT * FROM usuarios WHERE id='" + id + "';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {

                return rs;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;

    }

    public boolean ValidarUsuario(String usuario, String contrasena) {
        ResultSet rs = null;
        String sql = "SELECT * FROM usuarios WHERE usuario='" + usuario + "' AND contrasena='" + contrasena + "';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {

                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public ArrayList<Empleados> BuscarRolUser(String usuario, String contrasena) {
        ArrayList<Empleados> Listar = new ArrayList();
        Listar.clear();
        ResultSet rs = null;
        String sql = "SELECT empleados.nombre, empleados.documento, empleados.cargn u76h7u   o, empleados.telefono, empleados.celular, empleados.f_nacimiento, empleados.rh, empleados.contacto_familiar,empleados.telefono_contacto,empleados.celular_contacto,empleados.direccion,empleados.id,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id where usuarios.usuario='"+usuario+"' AND contrasena='"+contrasena+"';";
       
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Usuarios user= new Usuarios();
                Empleados myemp=new Empleados();
                Clientes myclient=new Clientes();
                
                myemp.setNombre(rs.getString("nombre"));
                    myemp.setDocumento(rs.getString("documento"));
                    myemp.setCargo(rs.getString("cargo"));
                    myemp.setTelefono(rs.getString("telefono"));
                    myemp.setCelular(rs.getString("celular"));
                    myemp.setFNacimiento(rs.getDate("f_nacimiento"));
                    myemp.setContactoFamiliar(rs.getString("contacto_familiar"));
                    myemp.setTelefonoContacto(rs.getString("telefono_contacto"));
                    myemp.setCelularContacto(rs.getString("celular_contacto"));
                    myemp.setDireccion(rs.getString("direccion"));
                    
                    user.setUsuario(rs.getString("usuario"));
                    myemp.setId(rs.getInt("id"));
                    myemp.setUsuarioId(user);
                
                    Listar.add(myemp);
                
                return Listar;
            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
    }

    
    
    
    public boolean ValidarCorreo_Personal(String correo_personal) {
        ResultSet rs = null;
        String sql = "SELECT * FROM empleados WHERE correo_personal='"+correo_personal+"';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    
    
    public boolean EditarContrasena(String usuario, String contrasena){
        
         int r=0;
            String sql, habilitado;
            
           
            sql="UPDATE usuarios set contrasena = ? where usuario = ? ;";
                    
            ConexionBD bd=new ConexionBD ();
            Connection con= bd.conectar();
            
         try {
             PreparedStatement pst= con.prepareStatement(sql);
             pst.setString(1, contrasena);
             pst.setString(2, usuario);
             r=pst.executeUpdate();
            
             pst.close();
             con.close();
             bd.cierraConexion();
             if(r!=0){
             
             return true;
             
             }
         } catch (SQLException ex) {
             Logger.getLogger(DBEmpleado.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        return false;
        }
    
    
    public boolean ValidarUsuario(String usuario) {
        ResultSet rs = null;
        String sql = "SELECT * FROM usuarios WHERE usuario='"+usuario+"';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
    
    public boolean ValidarContraena(String contrasena,String usuario) {
        ResultSet rs = null;
        String sql = "SELECT * FROM usuarios WHERE contrasena='"+contrasena+"' AND usuario='"+usuario+"';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

}


