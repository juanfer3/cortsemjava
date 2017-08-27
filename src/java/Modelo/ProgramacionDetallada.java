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
 * @author USUARIO
 */
@Entity
@Table(name = "programacion_detallada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProgramacionDetallada.findAll", query = "SELECT p FROM ProgramacionDetallada p"),
    @NamedQuery(name = "ProgramacionDetallada.findById", query = "SELECT p FROM ProgramacionDetallada p WHERE p.id = :id"),
    @NamedQuery(name = "ProgramacionDetallada.findByPrenda", query = "SELECT p FROM ProgramacionDetallada p WHERE p.prenda = :prenda"),
    @NamedQuery(name = "ProgramacionDetallada.findByCantidad", query = "SELECT p FROM ProgramacionDetallada p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "ProgramacionDetallada.findByHabilitado", query = "SELECT p FROM ProgramacionDetallada p WHERE p.habilitado = :habilitado")})
public class ProgramacionDetallada implements Serializable {

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
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @JoinColumn(name = "id_tela", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Telas idTela;
    @JoinColumn(name = "id_programacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Programaciones idProgramacion;

    public ProgramacionDetallada() {
    }

    public ProgramacionDetallada(Integer id) {
        this.id = id;
    }

    public ProgramacionDetallada(Integer id, String prenda, int cantidad, String habilitado) {
        this.id = id;
        this.prenda = prenda;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public Programaciones getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(Programaciones idProgramacion) {
        this.idProgramacion = idProgramacion;
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
        if (!(object instanceof ProgramacionDetallada)) {
            return false;
        }
        ProgramacionDetallada other = (ProgramacionDetallada) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.ProgramacionDetallada[ id=" + id + " ]";
    }
    
}
