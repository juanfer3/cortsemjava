/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
    , @NamedQuery(name = "Facturas.findById", query = "SELECT f FROM Facturas f WHERE f.id = :id")
    , @NamedQuery(name = "Facturas.findByIva", query = "SELECT f FROM Facturas f WHERE f.iva = :iva")
    , @NamedQuery(name = "Facturas.findByDescuento", query = "SELECT f FROM Facturas f WHERE f.descuento = :descuento")
    , @NamedQuery(name = "Facturas.findByTotal", query = "SELECT f FROM Facturas f WHERE f.total = :total")
    , @NamedQuery(name = "Facturas.findByHabiiliado", query = "SELECT f FROM Facturas f WHERE f.habiiliado = :habiiliado")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "iva")
    private Float iva;
    @Column(name = "descuento")
    private Float descuento;
    @Column(name = "total")
    private Float total;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habiiliado")
    private String habiiliado;
    @JoinColumn(name = "id_pedido", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedidos idPedido;
    @JoinColumn(name = "id_pedido_detallado", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PedidosDetallados idPedidoDetallado;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleados idEmpleado;

    public Facturas() {
    }

    public Facturas(Integer id) {
        this.id = id;
    }

    public Facturas(Integer id, String habiiliado) {
        this.id = id;
        this.habiiliado = habiiliado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getHabiiliado() {
        return habiiliado;
    }

    public void setHabiiliado(String habiiliado) {
        this.habiiliado = habiiliado;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
    }

    public PedidosDetallados getIdPedidoDetallado() {
        return idPedidoDetallado;
    }

    public void setIdPedidoDetallado(PedidosDetallados idPedidoDetallado) {
        this.idPedidoDetallado = idPedidoDetallado;
    }

    public Empleados getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleados idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Facturas[ id=" + id + " ]";
    }
    
}
