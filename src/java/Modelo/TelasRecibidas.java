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
@Table(name = "telas_recibidas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TelasRecibidas.findAll", query = "SELECT t FROM TelasRecibidas t"),
    @NamedQuery(name = "TelasRecibidas.findById", query = "SELECT t FROM TelasRecibidas t WHERE t.id = :id"),
    @NamedQuery(name = "TelasRecibidas.findByTipoDeUnidad", query = "SELECT t FROM TelasRecibidas t WHERE t.tipoDeUnidad = :tipoDeUnidad"),
    @NamedQuery(name = "TelasRecibidas.findByCantidad", query = "SELECT t FROM TelasRecibidas t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "TelasRecibidas.findByEstado", query = "SELECT t FROM TelasRecibidas t WHERE t.estado = :estado"),
    @NamedQuery(name = "TelasRecibidas.findByHabilitado", query = "SELECT t FROM TelasRecibidas t WHERE t.habilitado = :habilitado")})
public class TelasRecibidas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "tipo_de_unidad")
    private String tipoDeUnidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Size(max = 40)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "id_tela", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Telas idTela;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Clientes idCliente;

    public TelasRecibidas() {
    }

    public TelasRecibidas(Integer id) {
        this.id = id;
    }

    public TelasRecibidas(Integer id, String tipoDeUnidad, int cantidad, String habilitado) {
        this.id = id;
        this.tipoDeUnidad = tipoDeUnidad;
        this.cantidad = cantidad;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDeUnidad() {
        return tipoDeUnidad;
    }

    public void setTipoDeUnidad(String tipoDeUnidad) {
        this.tipoDeUnidad = tipoDeUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
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

    public Telas getIdTela() {
        return idTela;
    }

    public void setIdTela(Telas idTela) {
        this.idTela = idTela;
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
        if (!(object instanceof TelasRecibidas)) {
            return false;
        }
        TelasRecibidas other = (TelasRecibidas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.TelasRecibidas[ id=" + id + " ]";
    }
    
}
