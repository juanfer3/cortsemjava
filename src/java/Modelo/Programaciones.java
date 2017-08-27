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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "programaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programaciones.findAll", query = "SELECT p FROM Programaciones p"),
    @NamedQuery(name = "Programaciones.findById", query = "SELECT p FROM Programaciones p WHERE p.id = :id"),
    @NamedQuery(name = "Programaciones.findByFecha", query = "SELECT p FROM Programaciones p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Programaciones.findByFechaEntrega", query = "SELECT p FROM Programaciones p WHERE p.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "Programaciones.findByHabilitado", query = "SELECT p FROM Programaciones p WHERE p.habilitado = :habilitado")})
public class Programaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "habilitado")
    private int habilitado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProgramacion")
    private Collection<ProgramacionDetallada> programacionDetalladaCollection;
    @JoinColumn(name = "id_pedido", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Pedidos idPedido;
    @JoinColumn(name = "id_empledo", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleados idEmpledo;

    public Programaciones() {
    }

    public Programaciones(Integer id) {
        this.id = id;
    }

    public Programaciones(Integer id, Date fecha, int habilitado) {
        this.id = id;
        this.fecha = fecha;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(int habilitado) {
        this.habilitado = habilitado;
    }

    @XmlTransient
    public Collection<ProgramacionDetallada> getProgramacionDetalladaCollection() {
        return programacionDetalladaCollection;
    }

    public void setProgramacionDetalladaCollection(Collection<ProgramacionDetallada> programacionDetalladaCollection) {
        this.programacionDetalladaCollection = programacionDetalladaCollection;
    }

    public Pedidos getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedidos idPedido) {
        this.idPedido = idPedido;
    }

    public Empleados getIdEmpledo() {
        return idEmpledo;
    }

    public void setIdEmpledo(Empleados idEmpledo) {
        this.idEmpledo = idEmpledo;
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
        if (!(object instanceof Programaciones)) {
            return false;
        }
        Programaciones other = (Programaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Programaciones[ id=" + id + " ]";
    }
    
}
