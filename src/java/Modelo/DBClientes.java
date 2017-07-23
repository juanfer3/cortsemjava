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
public class DBClientes {

    public boolean RegistrarCliente(String nombre, String documento, String telefono, String celular,String direccion ,String correo, int usuario_id) {
        String habilitado = "si";
        String cargo="Cliente";
        String sql = "INSERT INTO clientes(nombre, documento,telefono, celular, direccion ,correo,cargo,usuario_id, habilitado) VALUES(?,?,?,?,?,?,?,?,?);";
        int r = 0;

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, nombre);
            pst.setString(2, documento);
            pst.setString(3, telefono);
            pst.setString(4, celular);
            pst.setString(5, direccion);
            pst.setString(6, correo);
            pst.setString(7, cargo);
            pst.setInt(8, usuario_id);
            pst.setString(9, habilitado);
            

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

    public int BuscarIDClientes(String nombre, String nit) {
        int u = 0;
        String sql = "SELECT * FROM clientes WHERE nombre='" + nombre + "' AND documento='" + nit + "';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {

                u = rs.getInt(1);
                bd.cierraConexion();
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return u;

    }


    
    public ArrayList ListarClientes(){
        ArrayList<Clientes> Listar=new ArrayList();
        Listar.clear();
    
        ResultSet rs;
        String habilitado = "si";
        String sql="SELECT  clientes.nombre, clientes.documento, clientes.telefono, clientes.celular, clientes.direccion, clientes.correo, clientes.cargo,clientes.id,usuarios.usuario,usuarios.id from usuarios inner join clientes on clientes.usuario_id=usuarios.id  where clientes.habilitado='si';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()) {
                
                 Clientes myclient=new Clientes();
                Usuarios myuser=new Usuarios();
                
                myclient.setNombre(rs.getString("nombre"));
                myclient.setDocumento(rs.getString("documento"));
                myclient.setCargo(rs.getString("cargo"));
                myclient.setTelefono(rs.getString("telefono"));
                myclient.setCelular(rs.getString("celular"));
                myclient.setDireccion(rs.getString("direccion"));
                myclient.setCorreo(rs.getString("correo"));
                myclient.setId(rs.getInt("id"));
                myuser.setUsuario(rs.getString("usuario"));
               
                
                myclient.setUsuarioId(myuser);
                
                Listar.add(myclient);
                
               
               
            }
            
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listar;
    
    }
    
    public ArrayList ListarClientesPorID(int id){
        ArrayList<Clientes> Listar=new ArrayList();
        Listar.clear();
    
        ResultSet rs;
        String habilitado = "si";
        String sql="SELECT  clientes.nombre, clientes.documento, clientes.telefono, clientes.celular, clientes.direccion, clientes.correo, clientes.cargo,clientes.id,usuarios.usuario,usuarios.id from usuarios inner join clientes on clientes.usuario_id=usuarios.id  where clientes.id='"+id+"';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()) {
                
                 Clientes myclient=new Clientes();
                Usuarios myuser=new Usuarios();
                
                myclient.setNombre(rs.getString("nombre"));
                myclient.setDocumento(rs.getString("documento"));
                myclient.setCargo(rs.getString("cargo"));
                myclient.setTelefono(rs.getString("telefono"));
                myclient.setCelular(rs.getString("celular"));
                myclient.setDireccion(rs.getString("direccion"));
                myclient.setCorreo(rs.getString("correo"));
                myclient.setId(rs.getInt("id"));
                myuser.setUsuario(rs.getString("usuario"));
                
                
                myclient.setUsuarioId(myuser);
                
                Listar.add(myclient);
                
               
               
            }
            
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listar;
    
    }
    
    
    
    public boolean EditarClientes(
            int id,
            String nombre, 
            String documento, 
            String telefono, 
            String celular, 
            String direccion,
            String correo){
    
        int r=0;
            String sql, habilitado;
            
           
            sql="UPDATE clientes "
                    + "SET nombre='"+nombre+"',"
                    + "documento='"+documento+"',telefono='"+telefono+"',"
                    + "celular='"+celular+"',direccion='"+direccion+"', "
                    + "correo='"+correo+"'"
                    + "WHERE id='"+id+"';";
                    
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
    
    public boolean EliminarClientes(int id){
            
            int r=0;
            String sql, habilitado;
            habilitado="no";
           
            sql="UPDATE clientes set habilitado='"+habilitado+"' WHERE id='"+id+"';";
                    
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
    public ArrayList BuscarIdporNit(String documento){
    ArrayList<Clientes> Listar=new ArrayList();
    Listar.clear();
    int r=0;
    ResultSet rs;
        String habilitado = "si";
        String sql="SELECT * FROM clientes WHERE documento='"+documento+"';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()) {
                
                Clientes myclient=new Clientes();
               
                
                myclient.setId(rs.getInt("id"));
               
                
                Listar.add(myclient);
                
               
               
            }
            
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listar;
    
    }
    
}
