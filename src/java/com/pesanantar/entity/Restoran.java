/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
 * @author ASUS
 */
@Entity
@Table(name = "restoran", catalog = "db_pesanantar", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restoran.findAll", query = "SELECT r FROM Restoran r"),
    @NamedQuery(name = "Restoran.findByRestoranId", query = "SELECT r FROM Restoran r WHERE r.restoranId = :restoranId"),
    @NamedQuery(name = "Restoran.findByRestoranNama", query = "SELECT r FROM Restoran r WHERE r.restoranNama = :restoranNama"),
    @NamedQuery(name = "Restoran.findByRestoranDeskripsi", query = "SELECT r FROM Restoran r WHERE r.restoranDeskripsi = :restoranDeskripsi"),
    @NamedQuery(name = "Restoran.findByRestoranAlamat", query = "SELECT r FROM Restoran r WHERE r.restoranAlamat = :restoranAlamat"),
    @NamedQuery(name = "Restoran.findByRestoranWaktubuka", query = "SELECT r FROM Restoran r WHERE r.restoranWaktubuka = :restoranWaktubuka"),
    @NamedQuery(name = "Restoran.findByRestoranWaktututup", query = "SELECT r FROM Restoran r WHERE r.restoranWaktututup = :restoranWaktututup"),
    @NamedQuery(name = "Restoran.findByRestoranAvaibilitystatus", query = "SELECT r FROM Restoran r WHERE r.restoranAvaibilitystatus = :restoranAvaibilitystatus")})
public class Restoran implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "RESTORAN_ID", nullable = false, length = 3)
    private String restoranId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "RESTORAN_NAMA", nullable = false, length = 255)
    private String restoranNama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "RESTORAN_DESKRIPSI", nullable = false, length = 255)
    private String restoranDeskripsi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "RESTORAN_ALAMAT", nullable = false, length = 255)
    private String restoranAlamat;
    @Lob
    @Column(name = "RESTORAN_GAMBAR")
    private byte[] restoranGambar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESTORAN_WAKTUBUKA", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date restoranWaktubuka;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESTORAN_WAKTUTUTUP", nullable = false)
    @Temporal(TemporalType.TIME)
    private Date restoranWaktututup;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RESTORAN_AVAIBILITYSTATUS", nullable = false)
    private boolean restoranAvaibilitystatus;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restoranId", fetch = FetchType.LAZY)
    private List<Driver> driverList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "restoranId", fetch = FetchType.LAZY)
    private List<Makanan> makananList;

    public Restoran() {
    }

    public Restoran(String restoranId) {
        this.restoranId = restoranId;
    }

    public Restoran(String restoranId, String restoranNama, String restoranDeskripsi, String restoranAlamat, Date restoranWaktubuka, Date restoranWaktututup, boolean restoranAvaibilitystatus) {
        this.restoranId = restoranId;
        this.restoranNama = restoranNama;
        this.restoranDeskripsi = restoranDeskripsi;
        this.restoranAlamat = restoranAlamat;
        this.restoranWaktubuka = restoranWaktubuka;
        this.restoranWaktututup = restoranWaktututup;
        this.restoranAvaibilitystatus = restoranAvaibilitystatus;
    }

    public String getRestoranId() {
        return restoranId;
    }

    public void setRestoranId(String restoranId) {
        this.restoranId = restoranId;
    }

    public String getRestoranNama() {
        return restoranNama;
    }

    public void setRestoranNama(String restoranNama) {
        this.restoranNama = restoranNama;
    }

    public String getRestoranDeskripsi() {
        return restoranDeskripsi;
    }

    public void setRestoranDeskripsi(String restoranDeskripsi) {
        this.restoranDeskripsi = restoranDeskripsi;
    }

    public String getRestoranAlamat() {
        return restoranAlamat;
    }

    public void setRestoranAlamat(String restoranAlamat) {
        this.restoranAlamat = restoranAlamat;
    }

    public byte[] getRestoranGambar() {
        return restoranGambar;
    }

    public void setRestoranGambar(byte[] restoranGambar) {
        this.restoranGambar = restoranGambar;
    }

    public Date getRestoranWaktubuka() {
        return restoranWaktubuka;
    }

    public void setRestoranWaktubuka(Date restoranWaktubuka) {
        this.restoranWaktubuka = restoranWaktubuka;
    }

    public Date getRestoranWaktututup() {
        return restoranWaktututup;
    }

    public void setRestoranWaktututup(Date restoranWaktututup) {
        this.restoranWaktututup = restoranWaktututup;
    }

    public boolean getRestoranAvaibilitystatus() {
        return restoranAvaibilitystatus;
    }

    public void setRestoranAvaibilitystatus(boolean restoranAvaibilitystatus) {
        this.restoranAvaibilitystatus = restoranAvaibilitystatus;
    }

    @XmlTransient
    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
    }

    @XmlTransient
    public List<Makanan> getMakananList() {
        return makananList;
    }

    public void setMakananList(List<Makanan> makananList) {
        this.makananList = makananList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (restoranId != null ? restoranId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restoran)) {
            return false;
        }
        Restoran other = (Restoran) object;
        if ((this.restoranId == null && other.restoranId != null) || (this.restoranId != null && !this.restoranId.equals(other.restoranId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesanantar.entity.Restoran[ restoranId=" + restoranId + " ]";
    }
    
}
