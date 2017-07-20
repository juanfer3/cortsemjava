package Modelo;

import Modelo.Facturas;
import Modelo.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-20T18:16:51")
@StaticMetamodel(Empleados.class)
public class Empleados_ { 

    public static volatile SingularAttribute<Empleados, String> contactoFamiliar;
    public static volatile CollectionAttribute<Empleados, Facturas> facturasCollection;
    public static volatile SingularAttribute<Empleados, String> celularContacto;
    public static volatile SingularAttribute<Empleados, String> direccion;
    public static volatile SingularAttribute<Empleados, String> documento;
    public static volatile SingularAttribute<Empleados, String> nombre;
    public static volatile SingularAttribute<Empleados, Usuarios> usuarioId;
    public static volatile SingularAttribute<Empleados, String> rh;
    public static volatile SingularAttribute<Empleados, Date> fNacimiento;
    public static volatile SingularAttribute<Empleados, String> celular;
    public static volatile SingularAttribute<Empleados, Integer> id;
    public static volatile SingularAttribute<Empleados, String> habilitado;
    public static volatile SingularAttribute<Empleados, String> cargo;
    public static volatile SingularAttribute<Empleados, String> telefono;
    public static volatile SingularAttribute<Empleados, String> telefonoContacto;

}