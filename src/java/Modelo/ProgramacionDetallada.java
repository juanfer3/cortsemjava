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
import javax.persistence.Id;
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
@Table(name = "programacion_detallada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProgramacionDetallada.findAll", query = "SELECT p FROM ProgramacionDetallada p")
    , @NamedQuery(name = "ProgramacionDetallada.findById", query = "SELECT p FROM ProgramacionDetallada p WHERE p.id = :id")
    , @NamedQuery(name = "ProgramacionDetallada.findByIdProgramacion", query = "SELECT p FROM ProgramacionDetallada p WHERE p.idProgramacion = :idProgramacion")
    , @NamedQuery(name = "ProgramacionDetallada.findByPrenda", query = "SELECT p FROM ProgramacionDetallada p WHERE p.prenda = :prenda")
    , @NamedQuery(name = "ProgramacionDetallada.findByPieza", query = "SELECT p FROM ProgramacionDetallada p WHERE p.pieza = :pieza")
    , @NamedQuery(name = "ProgramacionDetallada.findByCantidad", query = "SELECT p FROM ProgramacionDetallada p WHERE p.cantidad = :cantidad")
    , @NamedQuery(name = "ProgramacionDetallada.findByIdTela", query = "SELECT p FROM ProgramacionDetallada p WHERE p.idTela = :idTela")
    , @NamedQuery(name = "ProgramacionDetallada.findByIdColor", query = "SELECT p FROM ProgramacionDetallada p WHERE p.idColor = :idColor")
    , @NamedQuery(name = "ProgramacionDetallada.findByHabilitado", query = "SELECT p FROM ProgramacionDetallada p WHERE p.habilitado = :habilitado")})
public class ProgramacionDetallada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_programacion")
    private int idProgramacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "prenda")
    private String prenda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "pieza")
    private String pieza;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tela")
    private int idTela;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_color")
    private int idColor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;

    public ProgramacionDetallada() {
    }

    public ProgramacionDetallada(Integer id) {
        this.id = id;
    }

    public ProgramacionDetallada(Integer id, int idProgramacion, String prenda, String pieza, int cantidad, int idTela, int idColor, String habilitado) {
        this.id = id;
        this.idProgramacion = idProgramacion;
        this.prenda = prenda;
        this.pieza = pieza;
        this.cantidad = cantidad;
        this.idTela = idTela;
        this.idColor = idColor;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(int idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public String getPrenda() {
        return prenda;
    }

    public void setPrenda(String prenda) {
        this.prenda = prenda;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdTela() {
        return idTela;
    }

    public void setIdTela(int idTela) {
        this.idTela = idTela;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
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
