/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBProduccion {
    
    public boolean RegistrarPiezas( int pedido_id, int cantidad, String fecha) {
        String habilitado = "si";
        String estado="pedido";
        String sql = "INSERT INTO produccion(pedido_detallado_id, fecha_producida,cantidad,habilitado) VALUES(?,?,?,?);";
        int r = 0;

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            PreparedStatement pst = con.prepareStatement(sql);

            
            
            pst.setInt(1, pedido_id);
            pst.setString(2, fecha);
            pst.setInt(3, cantidad);
            pst.setString(4, habilitado);
            r = pst.executeUpdate();
            if (r != 0) {
                
                
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
}
