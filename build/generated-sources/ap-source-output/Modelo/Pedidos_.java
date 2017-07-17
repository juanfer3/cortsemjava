package Modelo;

import Modelo.Clientes;
import Modelo.PedidosDetallados;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-16T22:48:26")
@StaticMetamodel(Pedidos.class)
public class Pedidos_ { 

    public static volatile SingularAttribute<Pedidos, Date> fEntrega;
    public static volatile CollectionAttribute<Pedidos, PedidosDetallados> pedidosDetalladosCollection;
    public static volatile SingularAttribute<Pedidos, Clientes> clienteId;
    public static volatile SingularAttribute<Pedidos, Date> fPedido;
    public static volatile SingularAttribute<Pedidos, Integer> id;
    public static volatile SingularAttribute<Pedidos, String> habilitado;

}