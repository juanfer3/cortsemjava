package Modelo;

import Modelo.PedidosDetallados;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-15T23:45:45")
@StaticMetamodel(Telas.class)
public class Telas_ { 

    public static volatile SingularAttribute<Telas, String> descripcion;
    public static volatile CollectionAttribute<Telas, PedidosDetallados> pedidosDetalladosCollection;
    public static volatile SingularAttribute<Telas, Integer> id;
    public static volatile SingularAttribute<Telas, String> habilitado;
    public static volatile SingularAttribute<Telas, String> refTela;

}