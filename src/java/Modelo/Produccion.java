/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "produccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produccion.findAll", query = "SELECT p FROM Produccion p"),
    @NamedQuery(name = "Produccion.findById", query = "SELECT p FROM Produccion p WHERE p.id = :id"),
    @NamedQuery(name = "Produccion.findByFechaProducida", query = "SELECT p FROM Produccion p WHERE p.fechaProducida = :fechaProducida"),
    @NamedQuery(name = "Produccion.findByCantidad", query = "SELECT p FROM Produccion p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Produccion.findByCantidadTotal", query = "SELECT p FROM Produccion p WHERE p.cantidadTotal = :cantidadTotal"),
    @NamedQuery(name = "Produccion.findByHabilitado", query = "SELECT p FROM Produccion p WHERE p.habilitado = :habilitado")})
public class Produccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fecha_producida")
    @Temporal(TemporalType.DATE)
    private Date fechaProducida;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_total")
    private float cantidadTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "pedido_detallado_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private PedidosDetallados pedidoDetalladoId;

    public Produccion() {
    }

    public Produccion(Integer id) {
        this.id = id;
    }

    public Produccion(Integer id, float cantidadTotal, String habilitado) {
        this.id = id;
        this.cantidadTotal = cantidadTotal;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaProducida() {
        return fechaProducida;
    }

    public void setFechaProducida(Date fechaProducida) {
        this.fechaProducida = fechaProducida;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(float cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public PedidosDetallados getPedidoDetalladoId() {
        return pedidoDetalladoId;
    }

    public void setPedidoDetalladoId(PedidosDetallados pedidoDetalladoId) {
        this.pedidoDetalladoId = pedidoDetalladoId;
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
        if (!(object instanceof Produccion)) {
            return false;
        }
        Produccion other = (Produccion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Produccion[ id=" + id + " ]";
    }
    
}
