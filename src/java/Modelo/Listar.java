/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
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
public class Listar {
    
    
    
    public  static void main (String [] Args){
   
//        ArrayList<Clientes> Listar=new ArrayList();
//        Listar.clear();
//    
//        ResultSet rs;
//        String habilitado = "si";
//        String sql = "SELECT  clientes.nombre, clientes.documento, clientes.telefono, clientes.celular, clientes.direccion, clientes.correo, clientes.cargo,usuarios.usuario from usuarios inner join clientes on clientes.usuario_id=usuarios.id;";
////   String sql="select * from clientes";
//ConexionBD bd = new ConexionBD();
//        Connection con = bd.conectar();
//
//        try {
//            Statement st = con.createStatement();
//            rs = st.executeQuery(sql);
//
//            while(rs.next()) {
//                Clientes myclient=new Clientes();
//                Usuarios myuser=new Usuarios();
//                
//                myclient.setNombre(rs.getString(1));
//                myclient.setDocumento(rs.getString(2));
//                myclient.setCargo(rs.getString(3));
//                myclient.setTelefono(rs.getString(4));
//                myclient.setCelular(rs.getString(5));
//                myclient.setDireccion(rs.getString(6));
//                myclient.setCorreo(rs.getString(7));
//                myuser.setUsuario(rs.getString(8));
//               
//                
//                myclient.setUsuarioId(myuser);
//                
//                Listar.add(myclient);
//                System.out.println("si hay algo "+Listar);
//               
//            }
//            for(Clientes cliente: Listar){
//            
//                System.out.println("======================="+ cliente.getNombre() );
//                System.out.println(cliente.getDocumento());
//                System.out.println(cliente.getCargo());
//                System.out.println(cliente.getCelular());
//                System.out.println(cliente.getTelefono());
//                System.out.println(cliente.getCorreo());
//                System.out.println(cliente.getDireccion());
//                System.out.println(cliente.getUsuarioId().getUsuario());
//            
//            }
//            
//            bd.cierraConexion();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
//        }
      
//    DBPedidos pedidos=new DBPedidos();
//            DBTelas mytelas=new DBTelas();
//            
//            ArrayList<Pedidos> ListarPedido= new ArrayList();
//            ArrayList<Telas> ListarTelas= new ArrayList();
//            
//            ListarPedido.clear();
//            ListarTelas.clear();
//            
//
//            ListarPedido = pedidos.BuscarUltimoPedido(30);
//            ListarTelas = mytelas.ListarTelas();
//            
//            
//            for(Pedidos mypedidos: ListarPedido){
//                
//                System.out.println(mypedidos.getClienteId().getNombre());
//                System.out.println(mypedidos.getId());
//            
//            }
//    

   DBPedidoDetallado detalle=new DBPedidoDetallado();
    ArrayList<PedidosDetallados>Listar=new ArrayList();
    Listar.clear();
    

    int id;
    

   
    Listar=detalle.BuscarDetallesDePedidosPorIdPedido(32);
}
    
}
