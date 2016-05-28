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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "pesanan", catalog = "db_pesanantar", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pesanan.findAll", query = "SELECT p FROM Pesanan p"),
    @NamedQuery(name = "Pesanan.findByPesananId", query = "SELECT p FROM Pesanan p WHERE p.pesananId = :pesananId"),
    @NamedQuery(name = "Pesanan.findByPesananWaktupesan", query = "SELECT p FROM Pesanan p WHERE p.pesananWaktupesan = :pesananWaktupesan"),
    @NamedQuery(name = "Pesanan.findByPesananTotalharga", query = "SELECT p FROM Pesanan p WHERE p.pesananTotalharga = :pesananTotalharga"),
    @NamedQuery(name = "Pesanan.findByPesananWaktusampai", query = "SELECT p FROM Pesanan p WHERE p.pesananWaktusampai = :pesananWaktusampai"),
    @NamedQuery(name = "Pesanan.findByPesananStatusproses", query = "SELECT p FROM Pesanan p WHERE p.pesananStatusproses = :pesananStatusproses"),
    @NamedQuery(name = "Pesanan.findByPesananStatusbayar", query = "SELECT p FROM Pesanan p WHERE p.pesananStatusbayar = :pesananStatusbayar"),
    @NamedQuery(name = "Pesanan.findByPesananAlamatantar", query = "SELECT p FROM Pesanan p WHERE p.pesananAlamatantar = :pesananAlamatantar")})
public class Pesanan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "PESANAN_ID", nullable = false, length = 10)
    private String pesananId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESANAN_WAKTUPESAN", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pesananWaktupesan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESANAN_TOTALHARGA", nullable = false)
    private float pesananTotalharga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESANAN_WAKTUSAMPAI", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date pesananWaktusampai;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "PESANAN_STATUSPROSES", nullable = false, length = 1)
    private String pesananStatusproses;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESANAN_STATUSBAYAR", nullable = false)
    private boolean pesananStatusbayar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "PESANAN_ALAMATANTAR", nullable = false, length = 255)
    private String pesananAlamatantar;
    @ManyToMany(mappedBy = "pesananList", fetch = FetchType.LAZY)
    private List<Makanan> makananList;
    @JoinColumn(name = "KONSUMEN_ID", referencedColumnName = "KONSUMEN_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Konsumen konsumenId;
    @JoinColumn(name = "DRIVER_ID", referencedColumnName = "DRIVER_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Driver driverId;

    public Pesanan() {
    }

    public Pesanan(String pesananId) {
        this.pesananId = pesananId;
    }

    public Pesanan(String pesananId, Date pesananWaktupesan, float pesananTotalharga, Date pesananWaktusampai, String pesananStatusproses, boolean pesananStatusbayar, String pesananAlamatantar) {
        this.pesananId = pesananId;
        this.pesananWaktupesan = pesananWaktupesan;
        this.pesananTotalharga = pesananTotalharga;
        this.pesananWaktusampai = pesananWaktusampai;
        this.pesananStatusproses = pesananStatusproses;
        this.pesananStatusbayar = pesananStatusbayar;
        this.pesananAlamatantar = pesananAlamatantar;
    }

    public String getPesananId() {
        return pesananId;
    }

    public void setPesananId(String pesananId) {
        this.pesananId = pesananId;
    }

    public Date getPesananWaktupesan() {
        return pesananWaktupesan;
    }

    public void setPesananWaktupesan(Date pesananWaktupesan) {
        this.pesananWaktupesan = pesananWaktupesan;
    }

    public float getPesananTotalharga() {
        return pesananTotalharga;
    }

    public void setPesananTotalharga(float pesananTotalharga) {
        this.pesananTotalharga = pesananTotalharga;
    }

    public Date getPesananWaktusampai() {
        return pesananWaktusampai;
    }

    public void setPesananWaktusampai(Date pesananWaktusampai) {
        this.pesananWaktusampai = pesananWaktusampai;
    }

    public String getPesananStatusproses() {
        return pesananStatusproses;
    }

    public void setPesananStatusproses(String pesananStatusproses) {
        this.pesananStatusproses = pesananStatusproses;
    }

    public boolean getPesananStatusbayar() {
        return pesananStatusbayar;
    }

    public void setPesananStatusbayar(boolean pesananStatusbayar) {
        this.pesananStatusbayar = pesananStatusbayar;
    }

    public String getPesananAlamatantar() {
        return pesananAlamatantar;
    }

    public void setPesananAlamatantar(String pesananAlamatantar) {
        this.pesananAlamatantar = pesananAlamatantar;
    }

    @XmlTransient
    public List<Makanan> getMakananList() {
        return makananList;
    }

    public void setMakananList(List<Makanan> makananList) {
        this.makananList = makananList;
    }

    public Konsumen getKonsumenId() {
        return konsumenId;
    }

    public void setKonsumenId(Konsumen konsumenId) {
        this.konsumenId = konsumenId;
    }

    public Driver getDriverId() {
        return driverId;
    }

    public void setDriverId(Driver driverId) {
        this.driverId = driverId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pesananId != null ? pesananId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesanan)) {
            return false;
        }
        Pesanan other = (Pesanan) object;
        if ((this.pesananId == null && other.pesananId != null) || (this.pesananId != null && !this.pesananId.equals(other.pesananId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesanantar.entity.Pesanan[ pesananId=" + pesananId + " ]";
    }
    
}
