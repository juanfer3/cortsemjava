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
public class DBFacturas {
    
    public boolean CrearFactura(int id_pedido,int id_pedido_detallado,
            int id_empleado,float iva, float descuento, float total){
        String habilitado = "si";
        String sql = "INSERT INTO facturas(id_pedido, id_pedido_detallado,"
                + "id_empleado,iva,descuento,total,habilitado ) "
                + "VALUES(?,?,?,?,?,?,?);";
        int r = 0;

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, id_pedido);
            pst.setInt(2, id_pedido_detallado);
            pst.setInt(3, id_empleado);
            pst.setFloat(4, iva);
            pst.setFloat(5, descuento);
            pst.setFloat(6, total);
            pst.setString(7, habilitado);
            r = pst.executeUpdate();
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
