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
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id"),
    @NamedQuery(name = "Pedidos.findByFPedido", query = "SELECT p FROM Pedidos p WHERE p.fPedido = :fPedido"),
    @NamedQuery(name = "Pedidos.findByFEntrega", query = "SELECT p FROM Pedidos p WHERE p.fEntrega = :fEntrega"),
    @NamedQuery(name = "Pedidos.findByFProgramacion", query = "SELECT p FROM Pedidos p WHERE p.fProgramacion = :fProgramacion"),
    @NamedQuery(name = "Pedidos.findByFProduccion", query = "SELECT p FROM Pedidos p WHERE p.fProduccion = :fProduccion"),
    @NamedQuery(name = "Pedidos.findByFTerminado", query = "SELECT p FROM Pedidos p WHERE p.fTerminado = :fTerminado"),
    @NamedQuery(name = "Pedidos.findByIva", query = "SELECT p FROM Pedidos p WHERE p.iva = :iva"),
    @NamedQuery(name = "Pedidos.findByDescuento", query = "SELECT p FROM Pedidos p WHERE p.descuento = :descuento"),
    @NamedQuery(name = "Pedidos.findByTotal", query = "SELECT p FROM Pedidos p WHERE p.total = :total"),
    @NamedQuery(name = "Pedidos.findByEstado", query = "SELECT p FROM Pedidos p WHERE p.estado = :estado"),
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date fPedido;
    @Column(name = "f_entrega")
    @Temporal(TemporalType.DATE)
    private Date fEntrega;
    @Column(name = "f_programacion")
    @Temporal(TemporalType.DATE)
    private Date fProgramacion;
    @Column(name = "f_produccion")
    @Temporal(TemporalType.DATE)
    private Date fProduccion;
    @Column(name = "f_terminado")
    @Temporal(TemporalType.DATE)
    private Date fTerminado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "iva")
    private Float iva;
    @Column(name = "descuento")
    private Float descuento;
    @Column(name = "Total")
    private Float total;
    @Size(max = 20)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Clientes clienteId;

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

    public Date getFProgramacion() {
        return fProgramacion;
    }

    public void setFProgramacion(Date fProgramacion) {
        this.fProgramacion = fProgramacion;
    }

    public Date getFProduccion() {
        return fProduccion;
    }

    public void setFProduccion(Date fProduccion) {
        this.fProduccion = fProduccion;
    }

    public Date getFTerminado() {
        return fTerminado;
    }

    public void setFTerminado(Date fTerminado) {
        this.fTerminado = fTerminado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
