/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
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
public class DBPedidoDetallado {
    
    public boolean RegistrarPedidoDetallado(int pedido_id, String prenda, String talla,int telas_id, int cantidad, float valor_unitario,  float valor_total){
    String habilitado="si";
    String sql="INSERT INTO pedidos_detallados(pedido_id, prenda,telas_id,talla,cantidad, valor_unitario,valor_total,habilitado) VALUES(?,?,?,?,?,?,?,?);";
    int r=0;
    
    
    
    ConexionBD bd=new ConexionBD ();
    Connection con= bd.conectar();
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            
            pst.setInt(1, pedido_id);
            pst.setString(2, prenda);
            pst.setInt(3, telas_id);
            pst.setString(4, talla);
            pst.setInt(5, cantidad);
            pst.setFloat(6, valor_unitario);
           
            pst.setFloat(7,valor_total);
            pst.setString(8, habilitado);
            r=pst.executeUpdate();
            
            pst.close();
            con.close();
            bd.cierraConexion();
            
            if(r!=0){
            
                return true;
            
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false ;
    }
    
//    public ArrayList BuscarDetallesDePedidosPorIdPedido(int id){
//        ArrayList<PedidosDetallados> Listar=new ArrayList();
//        Listar.clear();
//        ResultSet rs=null;
//        
//        String habilitado = "si";
//        String sql = "SELECT * FROM pedidos_detallados WHERE pedido_id='"+id+"' AND habilitado='"+habilitado+"'ORDER BY id DESC;";
//        ConexionBD bd = new ConexionBD();
//        Connection con = bd.conectar();
//
//        try {
//            Statement st = con.createStatement();
//           
//            rs=st.executeQuery(sql);
//
//            while (rs.next()) {
//                PedidosDetallados pedido=new PedidosDetallados();
//                
//                pedido.setId(rs.getInt("id"));
//                pedido.setCantidad(rs.getInt("cantidad"));
//                pedido.setPrenda(rs.getString("prenda"));
//                pedido.setTalla(rs.getString("talla"));
//                pedido.setValorTotal(rs.getFloat("valor_total"));
//                pedido.setValorUnitario(rs.getFloat("valor_unitario"));
//                
//                Listar.add(pedido);
//                
//                
//               
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return Listar;
//        
//        
//        
//    }
    
    
    public boolean EliminarPedidoDetallado(int pedido_id){
    String habilitado="si";
    String sql="DELETE FROM pedidos_detallados where id<=?;";
    int r=0;
    
    
    
    ConexionBD bd=new ConexionBD ();
    Connection con= bd.conectar();
    
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            
            pst.setInt(1, pedido_id);
            
            r=pst.executeUpdate();
            
            pst.close();
            con.close();
            bd.cierraConexion();
            
            if(r!=0){
            
                return true;
            
            
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false ;
    }
    
    
    public ArrayList ListarPedidoDetallado(){
        ArrayList<PedidosDetallados> Listar=new ArrayList();
        Listar.clear();
        ResultSet rs=null;
        
        String habilitado = "si";
        String sql = "SELECT pedidos_detallados.id, pedidos_detallados.pedido_id, pedidos_detallados.prenda, pedidos_detallados.telas_id, pedidos_detallados.talla, pedidos_detallados.cantidad, pedidos_detallados.valor_unitario, pedidos_detallados.valor_total,pedidos.id, pedidos.f_pedido, pedidos.f_entrega, pedidos.cliente_id, telas.id, telas.ref_tela, telas.descripcion,clientes.id, clientes.nombre, clientes.documento FROM pedidos INNER JOIN pedidos ON pedidos_detallados.pedido_id= pedidos.id INNER JOIN telas ON pedidos_detallados.telas_id INNER JOIN clientes ON pedidos.cliente_id=clientes.id WHERE  pedidos.habilitado='"+habilitado+"'ORDER BY clientes.nombre DESC;";
        
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
           
            rs=st.executeQuery(sql);

            while (rs.next()) {
                PedidosDetallados pedido=new PedidosDetallados();
                Pedidos ped= new Pedidos();
                Telas cloth= new Telas();
                Clientes client= new Clientes();
                
                
                pedido.setId(rs.getInt("id"));
                pedido.setCantidad(rs.getInt("cantidad"));
                pedido.setPrenda(rs.getString("prenda"));
                pedido.setTalla(rs.getString("talla"));
                pedido.setValorTotal(rs.getFloat("valor_total"));
                pedido.setValorUnitario(rs.getFloat("valor_unitario"));
 
                client.setId(rs.getInt("clientes.id"));
                client.setNombre(rs.getString("clientes.nombre"));
                client.setDocumento(rs.getString("clientes.documento"));
                
                ped.setId(rs.getInt("pedidos.id"));
                ped.setFEntrega(rs.getDate("f_entrega"));
                ped.setFPedido(rs.getDate("f_pedido"));
                ped.setFProgramacion(rs.getDate("f_programacion"));
                ped.setId(rs.getInt("pedidos.id"));
                ped.setClienteId(client);
                
                cloth.setId(rs.getInt("telas.id"));
                cloth.setRefTela(rs.getString("ref_tela"));
                cloth.setDescripcion(rs.getString("descripcion"));          
                
                pedido.setTelasId(cloth);
                pedido.setPedidoId(ped);
                
                
                Listar.add(pedido);
                
                
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
        
        
        
    }
    
    public ArrayList BuscarDetallesDePedidosPorIdPedido(int id){
        ArrayList<PedidosDetallados> Listar=new ArrayList();
        Listar.clear();
        ResultSet rs=null;
        
        String habilitado = "si";
        String sql = "SELECT pedidos_detallados.id, pedidos.f_programacion,pedidos_detallados.pedido_id, pedidos_detallados.prenda, pedidos_detallados.telas_id, pedidos_detallados.talla, pedidos_detallados.cantidad, pedidos_detallados.valor_unitario, pedidos_detallados.valor_total,pedidos.id, pedidos.f_pedido, pedidos.f_entrega, pedidos.cliente_id, telas.id, telas.ref_tela, telas.descripcion,clientes.id, clientes.nombre, clientes.documento FROM pedidos_detallados INNER JOIN pedidos ON pedidos_detallados.pedido_id = pedidos.id INNER JOIN telas ON pedidos_detallados.telas_id=telas.id INNER JOIN clientes ON pedidos.cliente_id=clientes.id  WHERE  pedidos.id='"+id+"' ;";
        
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
           Statement pst = con.prepareStatement(sql);
            
           
            rs=pst.executeQuery(sql);

            while (rs.next()) {
                PedidosDetallados pedido=new PedidosDetallados();
                Pedidos ped= new Pedidos();
                Telas cloth= new Telas();
                Clientes client= new Clientes();
                
                
                pedido.setId(rs.getInt("id"));
                pedido.setCantidad(rs.getInt("cantidad"));
                pedido.setPrenda(rs.getString("prenda"));
                pedido.setTalla(rs.getString("talla"));
                pedido.setValorTotal(rs.getFloat("valor_total"));
                pedido.setValorUnitario(rs.getFloat("valor_unitario"));
 
                client.setId(rs.getInt("clientes.id"));
                client.setNombre(rs.getString("clientes.nombre"));
                client.setDocumento(rs.getString("clientes.documento"));
                
                ped.setId(rs.getInt("pedidos.id"));
                ped.setFEntrega(rs.getDate("f_entrega"));
                ped.setFPedido(rs.getDate("f_pedido"));
                ped.setFProgramacion(rs.getDate("f_programacion"));
                ped.setId(rs.getInt("pedidos.id"));
                ped.setClienteId(client);
                
                cloth.setId(rs.getInt("telas.id"));
                cloth.setRefTela(rs.getString("ref_tela"));
                cloth.setDescripcion(rs.getString("descripcion"));          
                
                pedido.setTelasId(cloth);
                pedido.setPedidoId(ped);
                
                
                Listar.add(pedido);
                
                
               
            }
            rs.close();
            pst.close();
            con.close();
            bd.cierraConexion();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
        
        
        
    }
    
}
