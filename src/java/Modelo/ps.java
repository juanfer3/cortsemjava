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
public class ps {

    public boolean insertaruser(String nombre, String descripcion) {
        
    String sql="INSERT INTO ps(nombre, descripcion)VALUES(?,?); ";
    
    int r=0;
    
    
    ConexionBD bd=new ConexionBD ();
    Connection con= bd.conectar();
        
        try {
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setString(1,nombre);
            pst.setString(2, descripcion);
            r=pst.executeUpdate();
            if(r!=0){
            return true;
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ps.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    return false;
    }

}
