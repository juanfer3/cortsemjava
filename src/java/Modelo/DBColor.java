/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBColor {
    
    public boolean insertarColor( String descripcion){
    
        String habilitado = "si";
            String sql = "INSERT INTO colores(descripcion, habilitado) VALUES(?,?);";
            int r = 0;

            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();
            
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1, descripcion);
            pst.setString(2, habilitado);
            r=pst.executeUpdate();
            
            if(r!=0){
            
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBColor.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
        return false;
    }
    
//    public ArrayList ListarColores(){
//        
//    ArrayList<Colores> Listar= new ArrayList<Colores>;
//    Listar.add(rs)
//    
//    return Listar;
//    }
    
}
