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
import org.codehaus.jackson.annotate.JsonIgnore;

/**
 *
 * @author Juan
 */
@Entity
@Table(name = "telas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telas.findAll", query = "SELECT t FROM Telas t"),
    @NamedQuery(name = "Telas.findById", query = "SELECT t FROM Telas t WHERE t.id = :id"),
    @NamedQuery(name = "Telas.findByRefTela", query = "SELECT t FROM Telas t WHERE t.refTela = :refTela"),
    @NamedQuery(name = "Telas.findByDescripcion", query = "SELECT t FROM Telas t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Telas.findByTipoDeUnidad", query = "SELECT t FROM Telas t WHERE t.tipoDeUnidad = :tipoDeUnidad"),
    @NamedQuery(name = "Telas.findByCantidad", query = "SELECT t FROM Telas t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Telas.findByEstado", query = "SELECT t FROM Telas t WHERE t.estado = :estado"),
    @NamedQuery(name = "Telas.findByHabilitado", query = "SELECT t FROM Telas t WHERE t.habilitado = :habilitado")})
public class Telas implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "telasId")
    private Collection<PedidosDetallados> pedidosDetalladosCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ref_tela")
    private String refTela;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 40)
    @Column(name = "tipo_de_unidad")
    private String tipoDeUnidad;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Size(max = 40)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne
    private Clientes idCliente;

    public Telas() {
    }

    public Telas(Integer id) {
        this.id = id;
    }

    public Telas(Integer id, String refTela, String descripcion, String habilitado) {
        this.id = id;
        this.refTela = refTela;
        this.descripcion = descripcion;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefTela() {
        return refTela;
    }

    public void setRefTela(String refTela) {
        this.refTela = refTela;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDeUnidad() {
        return tipoDeUnidad;
    }

    public void setTipoDeUnidad(String tipoDeUnidad) {
        this.tipoDeUnidad = tipoDeUnidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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

    public Clientes getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Clientes idCliente) {
        this.idCliente = idCliente;
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
        if (!(object instanceof Telas)) {
            return false;
        }
        Telas other = (Telas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Telas[ id=" + id + " ]";
    }

    @XmlTransient
    @JsonIgnore
    public Collection<PedidosDetallados> getPedidosDetalladosCollection() {
        return pedidosDetalladosCollection;
    }

    public void setPedidosDetalladosCollection(Collection<PedidosDetallados> pedidosDetalladosCollection) {
        this.pedidosDetalladosCollection = pedidosDetalladosCollection;
    }
    
}
