///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author ALEJANDRA MOLINA
// */
//public class codigo {
//    /*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package empleados;
//
//import java.util.*;
//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.table.DefaultTableModel;
//
///**
// *
// * @author adsi
// */
//public class Funcionalidades {
//
//    
//    public boolean validar(String usuario,String contrasena){
//        
//        String sql="SELECT * FROM login WHERE USUARIO='"+usuario+"'and CONTRASENA='"+contrasena+"' ";
//        try {
//            
//            ConectarDB conn =new ConectarDB();
//            Connection con= conn.conectar();
//            
//            Statement st= con.createStatement();
//            ResultSet rs= st.executeQuery(sql);
//            if(rs.next()){
//            
//                conn.cierraConexion();
//                return true;
//            }
//            return true;
//        } catch (SQLException ex) {
//            Logger.getLogger(ConectarDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return false;
//}
//    
//    
//   
//    public DefaultTableModel listacompleta() {
//
//        DefaultTableModel modelo = new DefaultTableModel();
//        try {
//            int id;
//            String nombre, telefono;
//            String sql = "SELECT * FROM Empleados";
//            ConectarDB conn = new ConectarDB();
//            Connection con = conn.conectar();
//            Statement st = con.createStatement();
//           
//            
//            
//            ResultSet rs = st.executeQuery(sql);
//
//       
//}
