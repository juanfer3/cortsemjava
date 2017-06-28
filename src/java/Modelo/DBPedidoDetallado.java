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
    
    public ArrayList BuscarDetallesDePedidosPorIdPedido(int id){
        ArrayList<PedidosDetallados> Listar=new ArrayList();
        Listar.clear();
        ResultSet rs=null;
        
        String habilitado = "si";
        String sql = "SELECT * FROM pedidos_detallados WHERE pedido_id='"+id+"' AND habilitado='"+habilitado+"';";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
           
            rs=st.executeQuery(sql);

            while (rs.next()) {
                PedidosDetallados pedido=new PedidosDetallados();
                
                pedido.setId(rs.getInt("id"));
                pedido.setCantidad(rs.getInt("cantidad"));
                pedido.setPrenda(rs.getString("prenda"));
                pedido.setTalla(rs.getString("talla"));
                pedido.setValorTotal(rs.getFloat("valor_total"));
                pedido.setValorUnitario(rs.getFloat("valor_unitario"));
                
                Listar.add(pedido);
                
                
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
        
        
        
    }
    
    
    
    
}
