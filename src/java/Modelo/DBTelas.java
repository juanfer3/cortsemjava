/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan
 */
public class DBTelas {
    public boolean RegistrarTela(String ref_tela, String descripcion) {
            String habilitado = "si";
            String sql = "INSERT INTO telas(ref_tela, descripcion, habilitado) VALUES(?,?,?);";
            int r = 0;
           
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, ref_tela);
                pst.setString(2, descripcion);                
                pst.setString(3, habilitado);
            
                

                r = pst.executeUpdate();
                
                if (r!=0) {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }

        public boolean BuscarTelaPorReferencia(String ref_tela) {
            int u = 0;
            String habilitado;
            habilitado="si";
            String sql = "SELECT * FROM telas WHERE ref_tela='" + ref_tela+ "' AND habilitado='"+habilitado+"';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);

                if (rs.next()) {

                    u = rs.getInt(1);
                    bd.cierraConexion();
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
            }

            return false;

        }
        
        public ArrayList buscarIdPorRef(String ref_tela){
            ArrayList<Telas> Listar=new ArrayList();
            Listar.clear();
            int u = 0;
            String habilitado;
            habilitado="si";
            String sql = "SELECT * FROM telas WHERE ref_tela='" + ref_tela+ "' AND habilitado='"+habilitado+"';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();
            
        try {
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            if(rs.next()){
                Telas mytela=new Telas();
                
                mytela.setId(rs.getInt("id"));
                
                Listar.add(mytela);
            
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DBTelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Listar;
        }
        
        
        public ArrayList ListarTelas(){
            ArrayList<Telas> Listar=new ArrayList();
            Listar.clear();
            int u = 0;
            String habilitado;
            habilitado="si";
            String sql = "SELECT * FROM telas WHERE habilitado='"+habilitado+"';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();
            
        try {
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                Telas mytela=new Telas();
                
                mytela.setId(rs.getInt("id"));
                mytela.setDescripcion(rs.getString("descripcion"));
                mytela.setRefTela(rs.getString("ref_tela"));
                
                
                Listar.add(mytela);
            
            
                
            }
            rs.close();
            con.close();
            st.close();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBTelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Listar;
        }
        
        public boolean EliminarTela(String ref_tela) {
            String habilitado = "no";
            String sql = "UPDATE  telas set habilitado=? WHERE ref_tela=? ;";
            int r = 0;
           
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, habilitado);
                pst.setString(2, ref_tela);                

                r = pst.executeUpdate();
                pst.close();
                con.close();
                bd.cierraConexion();
                if (r!=0) {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        
        
        public boolean EliminarTelaPorId(int id) {
            String habilitado = "no";
            String sql = "UPDATE  telas set habilitado=? WHERE id=? ;";
            int r = 0;
           
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, habilitado);
                pst.setInt(2, id);                

                r = pst.executeUpdate();
                pst.close();
                con.close();
                bd.cierraConexion();
                if (r!=0) {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
        
        public ArrayList ListarTelasPorId(int id){
            ArrayList<Telas> Listar=new ArrayList();
            Listar.clear();
            int u = 0;
            String habilitado;
            habilitado="si";
            String sql = "SELECT * FROM telas WHERE habilitado='"+habilitado+"' AND id='"+id+"' ;";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();
            
        try {
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                Telas mytela=new Telas();
                
                mytela.setId(rs.getInt("id"));
                mytela.setDescripcion(rs.getString("descripcion"));
                mytela.setRefTela(rs.getString("ref_tela"));
                
                
                Listar.add(mytela);
            
            
                
            }
            rs.close();
            con.close();
            st.close();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBTelas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Listar;
        }
        
        
        public boolean EditarTelaPorId(int id, String ref_tela, String descripcion) {
            
            String sql = "UPDATE  telas SET ref_tela= ?, descripcion= ? WHERE id=? ;";
            int r = 0;
           
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, ref_tela);
                pst.setString(2, descripcion);
                pst.setInt(3, id);

                r = pst.executeUpdate();
                pst.close();
                con.close();
                bd.cierraConexion();
                if (r!=0) {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            return false;
        }
        
        public boolean EditarTelaRecibidaPorId(int id, String tipo_de_unidad, int cantidad, int cliente) {
            
            String sql = "UPDATE  telas SET tipo_de_unidad= ?, cantidad= ?, id_cliente=? WHERE id=? ;";
            int r = 0;
           
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                PreparedStatement pst = con.prepareStatement(sql);

                pst.setString(1, tipo_de_unidad);
                pst.setInt(2, cantidad);
                pst.setInt(3, cliente);
                pst.setInt(4, id);
                
                r = pst.executeUpdate();
                pst.close();
                con.close();
                bd.cierraConexion();
                if (r!=0) {
                    
                    return true;
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            return false;
        }
        
        
}
