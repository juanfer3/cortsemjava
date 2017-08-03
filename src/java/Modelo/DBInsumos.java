/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USUARIO
 */
public class DBInsumos {

    public boolean RegistrarInsumos(String nombre, String t_unidad,
            float cantidad, float valor_unitario, float valor_total,
            int id_empleado) {
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();
        int r = 0;
        String habilitado = "si";
        String sql = "INSERT INTO insumos(nombre,tipo_de_unidad,cantidad,"
                + "valor_unitario,valor_total,id_empleado,habilitado) "
                + "VALUES(?,?,?,?,?,?,?);";

        try {
            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, t_unidad);
            pst.setFloat(3, cantidad);
            pst.setFloat(4, valor_unitario);
            pst.setFloat(5, valor_total);
            pst.setInt(6, id_empleado);
            pst.setString(7, habilitado);
            r = pst.executeUpdate();
            if (r != 0) {

                bd.cierraConexion();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);

        }

        return false;
    }

    public ArrayList Listarinsumos() {
        ArrayList<Insumos> Listar = new ArrayList();
        Listar.clear();
        ResultSet rs = null;

        String habilitado = "si";

        String sql = "SELECT insumos.id,insumos.nombre,insumos.tipo_de_unidad,insumos.cantidad,insumos.valor_unitario,insumos.valor_total, empleados.id,empleados.nombre, empleados.documento, empleados.cargo from insumos inner join empleados on insumos.id_empleado = empleados.id where insumos.habilitado='" + habilitado + "';";

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Empleados myemp = new Empleados();
                Insumos ins=new Insumos();
                myemp.setNombre(rs.getString("empleados.nombre"));
                myemp.setDocumento(rs.getString("empleados.documento"));
                myemp.setId(rs.getInt("empleados.id"));
                
                ins.setIdEmpleado(myemp);
                
                ins.setId(rs.getInt("insumos.id"));
                ins.setNombre(rs.getString("insumos.nombre"));
                ins.setTipoDeUnidad(rs.getString("insumos.tipo_de_unidad"));
                ins.setCantidad(rs.getFloat("insumos.cantidad"));
                ins.setValorUnitario(rs.getFloat("insumos.valor_unitario"));
                ins.setValorTotal(rs.getFloat("insumos.valor_total"));

                Listar.add(ins);

            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            
        }

        return Listar;
    } public ArrayList ListarinsumosPorId(int id) {
        ArrayList<Insumos> Listar = new ArrayList();
        Listar.clear();
        ResultSet rs = null;

        String habilitado = "si";

        String sql = "SELECT insumos.id,insumos.nombre,insumos.tipo_de_unidad,insumos.cantidad,insumos.valor_unitario,insumos.valor_total, empleados.id,empleados.nombre, empleados.documento, empleados.cargo from insumos inner join empleados on insumos.id_empleado = empleados.id where insumos.habilitado='" + habilitado + "' and insumos.id='"+id+"';";

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Empleados myemp = new Empleados();
                Insumos ins=new Insumos();
                myemp.setNombre(rs.getString("empleados.nombre"));
                myemp.setDocumento(rs.getString("empleados.documento"));
                myemp.setId(rs.getInt("empleados.id"));
                
                ins.setIdEmpleado(myemp);
                
                ins.setId(rs.getInt("insumos.id"));
                ins.setNombre(rs.getString("insumos.nombre"));
                ins.setTipoDeUnidad(rs.getString("insumos.tipo_de_unidad"));
                ins.setCantidad(rs.getFloat("insumos.cantidad"));
                ins.setValorUnitario(rs.getFloat("insumos.valor_unitario"));
                ins.setValorTotal(rs.getFloat("insumos.valor_total"));

                Listar.add(ins);

            }
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
            
        }

        return Listar;
    }
    
    public boolean EditarInsumos(String nombre, String t_unidad,
            float cantidad, float valor_unitario, float valor_total, int id) {
        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();
        int r = 0;
      
        String sql = "UPDATE insumos SET nombre=?,tipo_de_unidad=?,cantidad=?,valor_unitario=?,valor_total=? where id=?;";

        try {
            Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, t_unidad);
            pst.setFloat(3, cantidad);
            pst.setFloat(4, valor_unitario);
            pst.setFloat(5, valor_total);
            pst.setInt(6, id);
           
            r = pst.executeUpdate();
            if (r != 0) {

                bd.cierraConexion();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(ControlBD.class.getName()).log(Level.SEVERE, null, ex);

        }

        return false;
    }

}
