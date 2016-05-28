/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pesanantar.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "makanan", catalog = "db_pesanantar", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Makanan.findAll", query = "SELECT m FROM Makanan m"),
    @NamedQuery(name = "Makanan.findByMakananId", query = "SELECT m FROM Makanan m WHERE m.makananId = :makananId"),
    @NamedQuery(name = "Makanan.findByRestoranId", query = "SELECT m FROM Makanan m JOIN m.restoranId r WHERE r.restoranId = :restoranId"),
    @NamedQuery(name = "Makanan.findByRestoranIdAndMakananId", query = "SELECT m FROM Makanan m JOIN m.restoranId r WHERE r.restoranId = :restoranId AND m.makananId = :makananId"),
    @NamedQuery(name = "Makanan.findByMakananNama", query = "SELECT m FROM Makanan m WHERE m.makananNama = :makananNama"),
    @NamedQuery(name = "Makanan.findByMakananHarga", query = "SELECT m FROM Makanan m WHERE m.makananHarga = :makananHarga"),
    @NamedQuery(name = "Makanan.findByMakananDeskripsi", query = "SELECT m FROM Makanan m WHERE m.makananDeskripsi = :makananDeskripsi"),
    @NamedQuery(name = "Makanan.findByMakananAvaibilitystatus", query = "SELECT m FROM Makanan m WHERE m.makananAvaibilitystatus = :makananAvaibilitystatus")})
public class Makanan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "MAKANAN_ID", nullable = false, length = 3)
    private String makananId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MAKANAN_NAMA", nullable = false, length = 255)
    private String makananNama;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAKANAN_HARGA", nullable = false)
    private float makananHarga;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "MAKANAN_DESKRIPSI", nullable = false, length = 255)
    private String makananDeskripsi;
    @Lob
    @Column(name = "MAKANAN_GAMBAR")
    private byte[] makananGambar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MAKANAN_AVAIBILITYSTATUS", nullable = false)
    private boolean makananAvaibilitystatus;
    @JoinTable(name = "pesanan_detail", joinColumns = {
        @JoinColumn(name = "MAKANAN_ID", referencedColumnName = "MAKANAN_ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "PESANAN_ID", referencedColumnName = "PESANAN_ID", nullable = false)})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Pesanan> pesananList;
    @JoinColumn(name = "RESTORAN_ID", referencedColumnName = "RESTORAN_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Restoran restoranId;

    public Makanan() {
    }

    public Makanan(String makananId) {
        this.makananId = makananId;
    }

    public Makanan(String makananId, String makananNama, float makananHarga, String makananDeskripsi, boolean makananAvaibilitystatus) {
        this.makananId = makananId;
        this.makananNama = makananNama;
        this.makananHarga = makananHarga;
        this.makananDeskripsi = makananDeskripsi;
        this.makananAvaibilitystatus = makananAvaibilitystatus;
    }

    public String getMakananId() {
        return makananId;
    }

    public void setMakananId(String makananId) {
        this.makananId = makananId;
    }

    public String getMakananNama() {
        return makananNama;
    }

    public void setMakananNama(String makananNama) {
        this.makananNama = makananNama;
    }

    public float getMakananHarga() {
        return makananHarga;
    }

    public void setMakananHarga(float makananHarga) {
        this.makananHarga = makananHarga;
    }

    public String getMakananDeskripsi() {
        return makananDeskripsi;
    }

    public void setMakananDeskripsi(String makananDeskripsi) {
        this.makananDeskripsi = makananDeskripsi;
    }

    public byte[] getMakananGambar() {
        return makananGambar;
    }

    public void setMakananGambar(byte[] makananGambar) {
        this.makananGambar = makananGambar;
    }

    public boolean getMakananAvaibilitystatus() {
        return makananAvaibilitystatus;
    }

    public void setMakananAvaibilitystatus(boolean makananAvaibilitystatus) {
        this.makananAvaibilitystatus = makananAvaibilitystatus;
    }

    @XmlTransient
    public List<Pesanan> getPesananList() {
        return pesananList;
    }

    public void setPesananList(List<Pesanan> pesananList) {
        this.pesananList = pesananList;
    }

    public Restoran getRestoranId() {
        return restoranId;
    }

    public void setRestoranId(Restoran restoranId) {
        this.restoranId = restoranId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (makananId != null ? makananId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Makanan)) {
            return false;
        }
        Makanan other = (Makanan) object;
        if ((this.makananId == null && other.makananId != null) || (this.makananId != null && !this.makananId.equals(other.makananId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesanantar.entity.Makanan[ makananId=" + makananId + " ]";
    }
    
}
