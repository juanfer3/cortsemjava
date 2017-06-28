package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEJANDRA MOLINA
 */
import Modelo.ConexionBD;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

public class ControlBD {
    public boolean validarUsuario(String usuario, String contrasena){

        try {
            String sql;
            sql="SELECT * FROM login WHERE USUARIO='"+usuario+"' AND CONTRASENA='"+contrasena+"';";
            ConexionBD conbd=new ConexionBD();
            Connection con=conbd.conectar();
            
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            
            if(rs.next()){
                  
                conbd.cierraConexion();
               return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("clave o usuario invalido");
        return false;
           
    }
    
    public int registrarEmpleado(String usuario, String contrasena,String rol, int cedula,String nombre){
        int u=0;
        String habilitado="si";
        try {
            String sql;
            sql="INSERT INTO empleados( USUARIO, CONTRASENA, ROL, CEDULA, NOMBRE,HABILITADO) VALUES(?,?,?,?,?,?)";
            ConexionBD conect= new ConexionBD();
            Connection con= conect.conectar();
            
           PreparedStatement pst= con.prepareStatement(sql);
           pst.setString(1,usuario);
           pst.setString(2,contrasena);
           pst.setString(3,rol);
           pst.setInt(4,cedula);
           pst.setString(5,nombre);
           pst.setString(6, habilitado);
           pst.executeUpdate();
           conect.cierraConexion();
            if(u==0){
                System.out.println("hay problemas en la insersion");
                return u;
                
            }else{
                System.out.println("se logro la insersion con exito");
                return u;
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("hay problemas en la insersion");
        }
                
        return u;
        
        
    }
    
   public boolean RegistrarInsumos(int id, String nombre, int cantidad, int precio){
    ConexionBD bd= new ConexionBD();
    Connection con= bd.conectar();
    String sql="INSERT INTO insumos VALUES(?,?,?,?);";
    
        try {
            Statement st= con.createStatement();
            PreparedStatement pst= con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, nombre);
            pst.setInt(3, cantidad);
            pst.setInt(4, precio);
            pst.executeUpdate();
            bd.cierraConexion();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
            
   }
   
   public ResultSet listarInsumos(int id){
   
    ResultSet rs = null;
    ConexionBD bd= new ConexionBD();
    Connection con= bd.conectar();
    String sql="SELECT * FROM insumos WHERE ID='"+id+"'";
    Statement st;
        try {
            st = con.createStatement();
                    
            rs= st.executeQuery(sql);
            
            if(rs.next()){
            
               return rs;
                        
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);
            
        }return rs;

    
    
       
       
       
       
   }
   
   
    
}
