package Modelo;

import Modelo.Empleados;
import Modelo.Pedidos;
import Modelo.PedidosDetallados;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-20T18:16:51")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Float> total;
    public static volatile SingularAttribute<Facturas, String> habiiliado;
    public static volatile SingularAttribute<Facturas, Float> iva;
    public static volatile SingularAttribute<Facturas, Empleados> idEmpleado;
    public static volatile SingularAttribute<Facturas, Float> descuento;
    public static volatile SingularAttribute<Facturas, Integer> id;
    public static volatile SingularAttribute<Facturas, Pedidos> idPedido;
    public static volatile SingularAttribute<Facturas, PedidosDetallados> idPedidoDetallado;

}