package Modelo;

import Modelo.Pedidos;
import Modelo.Telas;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-13T21:49:10")
@StaticMetamodel(PedidosDetallados.class)
public class PedidosDetallados_ { 

    public static volatile SingularAttribute<PedidosDetallados, String> talla;
    public static volatile SingularAttribute<PedidosDetallados, Pedidos> pedidoId;
    public static volatile SingularAttribute<PedidosDetallados, Telas> telasId;
    public static volatile SingularAttribute<PedidosDetallados, Float> valorTotal;
    public static volatile SingularAttribute<PedidosDetallados, Integer> id;
    public static volatile SingularAttribute<PedidosDetallados, Integer> cantidad;
    public static volatile SingularAttribute<PedidosDetallados, String> habilitado;
    public static volatile SingularAttribute<PedidosDetallados, String> prenda;
    public static volatile SingularAttribute<PedidosDetallados, Float> valorUnitario;

}