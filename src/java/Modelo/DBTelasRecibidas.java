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
public class DBTelasRecibidas {
    
    
     public boolean RegistrarTelaRecibida(int id_tela, String tipo_de_unidad,int cantidad,int id_cliente) {
            String estado="En bodega";
            String habilitado = "si";
            String sql = "INSERT INTO telas_recibidas(id_tela,tipo_de_unidad, cantidad,id_cliente,estado,habilitado) VALUES(?,?,?,?,?,?);";
            int r = 0;
           
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setInt(1, id_tela);
                pst.setString(2, tipo_de_unidad);                
                pst.setInt(3, cantidad);
                pst.setInt(4, id_cliente);
                pst.setString(5, estado);
                pst.setString(6, habilitado);
            
                

                r = pst.executeUpdate();
                
                if (r!=0) {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            

            return false;
        }
     
     public ArrayList ListarTelasEnBodega(){
        ArrayList<TelasRecibidas> Listar=new ArrayList();
        Listar.clear();
    
        ResultSet rs;
        String habilitado = "si";
        String sql="select clientes.nombre,clientes.id ,telas_recibidas.id,telas_recibidas.id_tela,telas_recibidas.tipo_de_unidad,telas_recibidas.cantidad,telas_recibidas.id_cliente,telas_recibidas.estado,telas_recibidas.habilitado,telas.id,telas.ref_tela,telas.descripcion from telas_recibidas inner join telas on telas.id=telas_recibidas.id_tela inner join clientes on clientes.id=telas_recibidas.id_cliente ;";
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while(rs.next()) {
                
                 Clientes myclient=new Clientes();
                Telas telas=new Telas();
                TelasRecibidas recibir=new TelasRecibidas();
                
                telas.setId(rs.getInt("telas.id"));
                telas.setRefTela(rs.getString("telas.ref_tela"));
                telas.setDescripcion(rs.getString("telas.descripcion"));
                
          
                
                myclient.setId(rs.getInt("clientes.id"));
                myclient.setNombre(rs.getString("nombre"));
                
                recibir.setId(rs.getInt("telas_recibidas.id"));
                recibir.setTipoDeUnidad(rs.getString("telas_recibidas.tipo_de_unidad"));
                recibir.setCantidad(rs.getInt("telas_recibidas.cantidad"));
                recibir.setIdCliente(myclient);
                recibir.setIdTela(telas);
                
                
                
                Listar.add(recibir);
                
               
               
            }
            
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Listar;
    
    }
     
    
}
