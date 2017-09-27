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
public class DBFacturas {

    public boolean CrearFactura(int id, 
             float iva, float descuento, float total) {
     
 
        String sql = "UPDATE pedidos SET iva=?, descuento=?, Total=? WHERE pedidos.id=?;";
        int r = 0;

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setFloat(1, iva);
            pst.setFloat(2, descuento);
            pst.setFloat(3, total);
            pst.setInt(4, id);
            
            r = pst.executeUpdate();
            if (r != 0) {

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

    public ArrayList ListarFacturaPorId(int id) {

        ArrayList<Facturas> Listar = new ArrayList();
        Listar.clear();

        String habilitado = "si";
        String sql = "select clientes.id,clientes.nombre,clientes.documento,clientes.telefono,clientes.celular,clientes.direccion,pedidos.id, pedidos.f_pedido, pedidos.f_entrega, pedidos.cliente_id, telas.id, telas.ref_tela, telas.descripcion, pedidos_detallados.id, pedidos_detallados.pedido_id, pedidos_detallados.prenda, pedidos_detallados.telas_id, pedidos_detallados.talla, pedidos_detallados.cantidad, pedidos_detallados.valor_unitario, pedidos_detallados.valor_total,facturas.id_pedido,facturas.id_empleado,facturas.iva,facturas.descuento,facturas.total,empleados.nombre, empleados.documento, empleados.cargo, empleados.telefono, empleados.celular, empleados.f_nacimiento, empleados.rh, empleados.contacto_familiar,empleados.telefono_contacto,empleados.celular_contacto,empleados.direccion,empleados.id from pedidos inner join pedidos_detallados on pedidos_detallados.pedido_id = pedidos.id inner join clientes on clientes.id=pedidos.cliente_id inner join facturas on facturas.id_pedido = pedidos.id inner join telas on telas.id = pedidos_detallados.telas_id inner join empleados on empleados.id= facturas.id_empleado WHERE pedidos.id='" + id + "' AND pedidos.habilitado='" + habilitado + "';";
        int r = 0;

        ConexionBD bd = new ConexionBD();
        Connection con = bd.conectar();

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                Facturas fac=new Facturas();
                Empleados emp=new Empleados();
                Pedidos pe=new Pedidos();
                Clientes client=new Clientes();
                
                client.setNombre(rs.getString("clientes.nombre"));
                client.setDocumento(rs.getString("clientes.documento"));
                client.setTelefono(rs.getString("clientes.telefono"));
                client.setCelular(rs.getString("celular"));
                client.setDireccion(rs.getString("direccion"));
                client.setCorreo(rs.getString("correo"));
                
                pe.setClienteId(client);
                pe.setFEntrega(rs.getDate("f_entrega"));
                pe.setFPedido(rs.getDate("f_pedido"));
                
                emp.setNombre(rs.getString("empleados.nombre"));
                emp.setCelular(rs.getString("empleados.celular"));
                
                fac.setIdEmpleado(emp);
                fac.setIdPedido(pe);
                fac.setIva(rs.getFloat("iva"));
                fac.setDescuento(rs.getFloat("descuento"));
                fac.setTotal(rs.getFloat("total"));
                
                Listar.add(fac);
                
                
            }
            st.close();
            con.close();
            bd.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(DBPedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

        return Listar;
    }

}
