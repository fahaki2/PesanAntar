/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
 * @author ASUS
 */
@Entity
@Table(name = "konsumen", catalog = "db_pesanantar", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Konsumen.findAll", query = "SELECT k FROM Konsumen k"),
    @NamedQuery(name = "Konsumen.findByKonsumenId", query = "SELECT k FROM Konsumen k WHERE k.konsumenId = :konsumenId"),
    @NamedQuery(name = "Konsumen.findByKonsumenNama", query = "SELECT k FROM Konsumen k WHERE k.konsumenNama = :konsumenNama"),
    @NamedQuery(name = "Konsumen.findByKonsumenEmail", query = "SELECT k FROM Konsumen k WHERE k.konsumenEmail = :konsumenEmail"),
    @NamedQuery(name = "Konsumen.findByKonsumenPassword", query = "SELECT k FROM Konsumen k WHERE k.konsumenPassword = :konsumenPassword"),
    @NamedQuery(name = "Konsumen.findByKonsumenNomortelepon", query = "SELECT k FROM Konsumen k WHERE k.konsumenNomortelepon = :konsumenNomortelepon")})
public class Konsumen implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "KONSUMEN_ID", nullable = false, length = 7)
    private String konsumenId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "KONSUMEN_NAMA", nullable = false, length = 255)
    private String konsumenNama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "KONSUMEN_EMAIL", nullable = false, length = 255)
    private String konsumenEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "KONSUMEN_PASSWORD", nullable = false, length = 255)
    private String konsumenPassword;
    @Basic(optional = false)
    @NotNull
    @Column(name = "KONSUMEN_NOMORTELEPON", nullable = false)
    private long konsumenNomortelepon;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "konsumenId", fetch = FetchType.LAZY)
    private List<Pesanan> pesananList;

    public Konsumen() {
    }

    public Konsumen(String konsumenId) {
        this.konsumenId = konsumenId;
    }

    public Konsumen(String konsumenId, String konsumenNama, String konsumenEmail, String konsumenPassword, long konsumenNomortelepon) {
        this.konsumenId = konsumenId;
        this.konsumenNama = konsumenNama;
        this.konsumenEmail = konsumenEmail;
        this.konsumenPassword = konsumenPassword;
        this.konsumenNomortelepon = konsumenNomortelepon;
    }

    public String getKonsumenId() {
        return konsumenId;
    }

    public void setKonsumenId(String konsumenId) {
        this.konsumenId = konsumenId;
    }

    public String getKonsumenNama() {
        return konsumenNama;
    }

    public void setKonsumenNama(String konsumenNama) {
        this.konsumenNama = konsumenNama;
    }

    public String getKonsumenEmail() {
        return konsumenEmail;
    }

    public void setKonsumenEmail(String konsumenEmail) {
        this.konsumenEmail = konsumenEmail;
    }

    public String getKonsumenPassword() {
        return konsumenPassword;
    }

    public void setKonsumenPassword(String konsumenPassword) {
        this.konsumenPassword = konsumenPassword;
    }

    public long getKonsumenNomortelepon() {
        return konsumenNomortelepon;
    }

    public void setKonsumenNomortelepon(long konsumenNomortelepon) {
        this.konsumenNomortelepon = konsumenNomortelepon;
    }

    @XmlTransient
    public List<Pesanan> getPesananList() {
        return pesananList;
    }

    public void setPesananList(List<Pesanan> pesananList) {
        this.pesananList = pesananList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (konsumenId != null ? konsumenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Konsumen)) {
            return false;
        }
        Konsumen other = (Konsumen) object;
        if ((this.konsumenId == null && other.konsumenId != null) || (this.konsumenId != null && !this.konsumenId.equals(other.konsumenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesanantar.entity.Konsumen[ konsumenId=" + konsumenId + " ]";
    }
    
}
