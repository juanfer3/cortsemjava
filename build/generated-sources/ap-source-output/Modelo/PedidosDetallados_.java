package Modelo;

import Modelo.Facturas;
import Modelo.Pedidos;
import Modelo.Telas;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-17T20:54:07")
@StaticMetamodel(PedidosDetallados.class)
public class PedidosDetallados_ { 

    public static volatile CollectionAttribute<PedidosDetallados, Facturas> facturasCollection;
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