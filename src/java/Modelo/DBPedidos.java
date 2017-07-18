/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class DBPedidos {
    
    public boolean RegistrarPedido(String fecha_pedido, String fecha_entrega,int cliente_id){
    String habilitado="no";
    String sql="INSERT INTO pedidos(f_pedido, f_entrega,  cliente_id, habilitado) VALUES(?,?,?,?);";
    int r=0;
    
    
    ConexionBD bd=new ConexionBD ();
    Connection con= bd.conectar();
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            
            pst.setString(1, fecha_pedido);
            pst.setString(2, fecha_entrega);           
            pst.setInt(3, cliente_id);
            pst.setString(4, habilitado);
            r=pst.executeUpdate();
            if(r!=0){
            
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    
    
//    public ResultSet ListarPedido(){
//        ResultSet rs=null;
//        String habilitado="si";
//        String sql="SELECT * FROM pedidos WHERE habilitado='"+habilitado+"';";
//        
//    
//        
//        ConexionBD bd=new ConexionBD ();
//        Connection con= bd.conectar();
//        
//        try {
//            Statement st= con.createStatement();
//            rs= st.executeQuery(sql);
//            
//            if(rs.next()){
//            
//                return rs;
//            
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        
//        return rs;
//    }
    
    public ArrayList BuscarUltimoPedido(int pedido_id){
        
        ArrayList<Pedidos> Listar= new ArrayList();
        Listar.clear();
        ResultSet rs=null;
        int u=0;
        
        int id;
        
        
       
       
        String sql="SELECT clientes.nombre,clientes.id,pedidos.id,clientes.documento,pedidos.f_pedido,pedidos.f_entrega from clientes inner join pedidos on clientes.id = pedidos.cliente_id where pedidos.id='"+pedido_id+"';";
        
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.last()){
              Pedidos pedido=new Pedidos();
              Clientes user= new Clientes();
              
              pedido.setId(rs.getInt("pedidos.id"));
              pedido.setFEntrega(rs.getDate("f_entrega"));
              pedido.setFPedido(rs.getDate("f_pedido"));
              user.setId(rs.getInt("clientes.id"));
              user.setNombre(rs.getString("nombre"));
              user.setDocumento(rs.getString("documento"));
             
              pedido.setClienteId(user);
              
              
              
              Listar.add(pedido);
             
                
            
            }
            rs.close();
            con.close();
            st.close();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return Listar;
    }
    
        public int TomarUltimoId(){
        ResultSet rs=null;
       
        String sql="SELECT * FROM pedidos;";
        int id=0;
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            if(rs.last()){
            
                id=rs.getInt("id");
            
            }
            
            rs.close();
            st.close();
            con.close();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return id;
    }
        
        public ArrayList ListarPedidosConClientes(){
        
        ArrayList<Pedidos> Listar= new ArrayList();
        Listar.clear();
        ResultSet rs=null;
        int u=0;
        
        int id;
        String habilitado="si";
         
       
        String sql="SELECT clientes.nombre,clientes.id,clientes.documento, pedidos.id,pedidos.f_pedido,pedidos.f_entrega from clientes inner join pedidos on clientes.id = pedidos.cliente_id where pedidos.habilitado='"+habilitado+"'ORDER BY clientes.nombre ASC;";
        
    
        
        ConexionBD bd=new ConexionBD ();
        Connection con= bd.conectar();
        
        try {
            Statement st= con.createStatement();
            rs= st.executeQuery(sql);
            
            while(rs.next()){
              Pedidos pedido=new Pedidos();
              Clientes user= new Clientes();
              
              pedido.setId(rs.getInt("pedidos.id"));
              pedido.setFEntrega(rs.getDate("f_entrega"));
              pedido.setFPedido(rs.getDate("f_pedido"));
              user.setId(rs.getInt("clientes.id"));
              user.setNombre(rs.getString("nombre"));
              user.setDocumento(rs.getString("documento"));
              pedido.setClienteId(user);
              
              
              
              Listar.add(pedido);
             
                
            
            }
            rs.close();
            con.close();
            st.close();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return Listar;
    }
        
        
        public boolean ConfirmarPedido(int id){
        
            String sql;
            String habilitado;
            
            int r=0;
            
            habilitado="si";
            sql="UPDATE pedidos SET habilitado=? WHERE id=?;";
            
            ConexionBD bd=new ConexionBD ();
            Connection con= bd.conectar();
            
        try {
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, habilitado);
            pst.setInt(2, id);
            
            r=pst.executeUpdate();
            
            if(r!=0){
            
                pst.close();
                con.close();
                bd.cierraConexion();
                return true;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        return false;
        }
        
        
}
