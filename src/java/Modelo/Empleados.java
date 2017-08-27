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
@Table(name = "empleados")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"),
    @NamedQuery(name = "Empleados.findById", query = "SELECT e FROM Empleados e WHERE e.id = :id"),
    @NamedQuery(name = "Empleados.findByNombre", query = "SELECT e FROM Empleados e WHERE e.nombre = :nombre"),
    @NamedQuery(name = "Empleados.findByDocumento", query = "SELECT e FROM Empleados e WHERE e.documento = :documento"),
    @NamedQuery(name = "Empleados.findByCargo", query = "SELECT e FROM Empleados e WHERE e.cargo = :cargo"),
    @NamedQuery(name = "Empleados.findByCorreoPersonal", query = "SELECT e FROM Empleados e WHERE e.correoPersonal = :correoPersonal"),
    @NamedQuery(name = "Empleados.findByTelefono", query = "SELECT e FROM Empleados e WHERE e.telefono = :telefono"),
    @NamedQuery(name = "Empleados.findByCelular", query = "SELECT e FROM Empleados e WHERE e.celular = :celular"),
    @NamedQuery(name = "Empleados.findByFNacimiento", query = "SELECT e FROM Empleados e WHERE e.fNacimiento = :fNacimiento"),
    @NamedQuery(name = "Empleados.findByRh", query = "SELECT e FROM Empleados e WHERE e.rh = :rh"),
    @NamedQuery(name = "Empleados.findByContactoFamiliar", query = "SELECT e FROM Empleados e WHERE e.contactoFamiliar = :contactoFamiliar"),
    @NamedQuery(name = "Empleados.findByTelefonoContacto", query = "SELECT e FROM Empleados e WHERE e.telefonoContacto = :telefonoContacto"),
    @NamedQuery(name = "Empleados.findByCelularContacto", query = "SELECT e FROM Empleados e WHERE e.celularContacto = :celularContacto"),
    @NamedQuery(name = "Empleados.findByDireccion", query = "SELECT e FROM Empleados e WHERE e.direccion = :direccion"),
    @NamedQuery(name = "Empleados.findByHabilitado", query = "SELECT e FROM Empleados e WHERE e.habilitado = :habilitado")})
public class Empleados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "documento")
    private String documento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 50)
    @Column(name = "correo_personal")
    private String correoPersonal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "rh")
    private String rh;
    @Size(max = 50)
    @Column(name = "contacto_familiar")
    private String contactoFamiliar;
    @Size(max = 50)
    @Column(name = "telefono_contacto")
    private String telefonoContacto;
    @Size(max = 50)
    @Column(name = "celular_contacto")
    private String celularContacto;
    @Size(max = 40)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "habilitado")
    private String habilitado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<Insumos> insumosCollection;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuarios usuarioId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpleado")
    private Collection<Facturas> facturasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpledo")
    private Collection<Programaciones> programacionesCollection;

    public Empleados() {
    }

    public Empleados(Integer id) {
        this.id = id;
    }

    public Empleados(Integer id, String nombre, String documento, String cargo, String telefono, String celular, Date fNacimiento, String rh, String habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.cargo = cargo;
        this.telefono = telefono;
        this.celular = celular;
        this.fNacimiento = fNacimiento;
        this.rh = rh;
        this.habilitado = habilitado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getFNacimiento() {
        return fNacimiento;
    }

    public void setFNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getContactoFamiliar() {
        return contactoFamiliar;
    }

    public void setContactoFamiliar(String contactoFamiliar) {
        this.contactoFamiliar = contactoFamiliar;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public String getCelularContacto() {
        return celularContacto;
    }

    public void setCelularContacto(String celularContacto) {
        this.celularContacto = celularContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }

    @XmlTransient
    public Collection<Insumos> getInsumosCollection() {
        return insumosCollection;
    }

    public void setInsumosCollection(Collection<Insumos> insumosCollection) {
        this.insumosCollection = insumosCollection;
    }

    public Usuarios getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuarios usuarioId) {
        this.usuarioId = usuarioId;
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
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Empleados[ id=" + id + " ]";
    }
    
}
