package Modelo;

import Modelo.ControlBD;
import Modelo.ConexionBD;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ALEJANDRA MOLINA
 */
public class prueba {

    public static void main(String[] args) {
         
        
        ControlBD cont = new ControlBD();
        ConexionBD bd = new ConexionBD();
        DBPedidos ped = new DBPedidos();
        DBClientes cli = new DBClientes();
        DBEmpleado emp= new DBEmpleado();
        DBUsuarios user= new DBUsuarios();
        DBPedidoDetallado pedd = new DBPedidoDetallado();
        DBTelas telas= new DBTelas();
        
        String nombre, documento, telefono, celular, direccion, correo, usuario, contrasena, id1;
        
       String prenda,tela,talla,cantidad1,valor_unitario1,valor_total1,num_pedido;
            
            int cantidad,tela_id,pedido_id;
            pedido_id=32;
            prenda="hola";
            tela_id=7;
            talla="S";
            cantidad=2;
            float v_u=1;
            float v_t=23;
       
            pedd.RegistrarPedidoDetallado(pedido_id, prenda, talla, tela_id, cantidad, v_u, v_t);
       
    }
}
