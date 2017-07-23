/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "pedidos_detallados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidosDetallados.findAll", query = "SELECT p FROM PedidosDetallados p")
    , @NamedQuery(name = "PedidosDetallados.findById", query = "SELECT p FROM PedidosDetallados p WHERE p.id = :id")
    , @NamedQuery(name = "PedidosDetallados.findByPrenda", query = "SELECT p FROM PedidosDetallados p WHERE p.prenda = :prenda")
    , @NamedQuery(name = "PedidosDetallados.findByTalla", query = "SELECT p FROM PedidosDetallados p WHERE p.talla = :talla")
    , @NamedQuery(name = "PedidosDetallados.findByCantidad", query = "SELECT p FROM PedidosDetallados p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "PedidosDetallados.findByValorUnitario", query = "SELECT p FROM PedidosDetallados p WHERE p.valorUnitario = :valorUnitario")
    , @NamedQuery(name = "PedidosDetallados.findByValorTotal", query = "SELECT p FROM PedidosDetallados p WHERE p.valorTotal = :valorTotal")
    , @NamedQuery(name = "PedidosDetallados.findByHabilitado", query = "SELECT p FROM PedidosDetallados p WHERE p.habilitado = :habilitado")})
public class PedidosDetallados implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPedidoDetallado")
    private Collection<Facturas> facturasCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "prenda")
    private String prenda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "talla")
    private String talla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_unitario")
    private float valorUnitario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor_total")
    private float valorTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedidos pedidoId;
    @JoinColumn(name = "telas_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Telas telasId;

    public PedidosDetallados() {
    }

    public PedidosDetallados(Integer id) {
        this.id = id;
    }

    public PedidosDetallados(Integer id, String prenda, String talla, int cantidad, float valorUnitario, float valorTotal, String habilitado) {
        this.id = id;
        this.prenda = prenda;
        this.talla = talla;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public Pedidos getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(Pedidos pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Telas getTelasId() {
        return telasId;
    }

    public void setTelasId(Telas telasId) {
        this.telasId = telasId;
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
        if (!(object instanceof PedidosDetallados)) {
            return false;
        }
        PedidosDetallados other = (PedidosDetallados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.PedidosDetallados[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Facturas> getFacturasCollection() {
        return facturasCollection;
    }

    public void setFacturasCollection(Collection<Facturas> facturasCollection) {
        this.facturasCollection = facturasCollection;
    }
    
}
