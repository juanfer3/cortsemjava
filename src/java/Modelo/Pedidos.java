/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id"),
    @NamedQuery(name = "Pedidos.findByFPedido", query = "SELECT p FROM Pedidos p WHERE p.fPedido = :fPedido"),
    @NamedQuery(name = "Pedidos.findByFEntrega", query = "SELECT p FROM Pedidos p WHERE p.fEntrega = :fEntrega"),
    @NamedQuery(name = "Pedidos.findByHabilitado", query = "SELECT p FROM Pedidos p WHERE p.habilitado = :habilitado")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_pedido")
    @Temporal(TemporalType.DATE)
    private Date fPedido;
    @Column(name = "f_entrega")
    @Temporal(TemporalType.DATE)
    private Date fEntrega;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Clientes clienteId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoId")
    private Collection<PedidosDetallados> pedidosDetalladosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPedido")
    private Collection<Facturas> facturasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPedido")
    private Collection<Programaciones> programacionesCollection;

    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Pedidos(Integer id, Date fPedido, String habilitado) {
        this.id = id;
        this.fPedido = fPedido;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFPedido() {
        return fPedido;
    }

    public void setFPedido(Date fPedido) {
        this.fPedido = fPedido;
    }

    public Date getFEntrega() {
        return fEntrega;
    }

    public void setFEntrega(Date fEntrega) {
        this.fEntrega = fEntrega;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    public Clientes getClienteId() {
        return clienteId;
    }

    public void setClienteId(Clientes clienteId) {
        this.clienteId = clienteId;
    }

    @XmlTransient
    public Collection<PedidosDetallados> getPedidosDetalladosCollection() {
        return pedidosDetalladosCollection;
    }

    public void setPedidosDetalladosCollection(Collection<PedidosDetallados> pedidosDetalladosCollection) {
        this.pedidosDetalladosCollection = pedidosDetalladosCollection;
    }

    @XmlTransient
    public Collection<Facturas> getFacturasCollection() {
        return facturasCollection;
    }

    public void setFacturasCollection(Collection<Facturas> facturasCollection) {
        this.facturasCollection = facturasCollection;
    }

    @XmlTransient
    public Collection<Programaciones> getProgramacionesCollection() {
        return programacionesCollection;
    }

    public void setProgramacionesCollection(Collection<Programaciones> programacionesCollection) {
        this.programacionesCollection = programacionesCollection;
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
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Pedidos[ id=" + id + " ]";
    }
    
}
