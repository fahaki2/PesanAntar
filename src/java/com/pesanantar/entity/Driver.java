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

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "driver", catalog = "db_pesanantar", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d"),
    @NamedQuery(name = "Driver.findByDriverId", query = "SELECT d FROM Driver d WHERE d.driverId = :driverId"),
    @NamedQuery(name = "Driver.findByDriverNama", query = "SELECT d FROM Driver d WHERE d.driverNama = :driverNama")})
public class Driver implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "DRIVER_ID", nullable = false, length = 4)
    private String driverId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DRIVER_NAMA", nullable = false, length = 255)
    private String driverNama;
    @JoinColumn(name = "RESTORAN_ID", referencedColumnName = "RESTORAN_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Restoran restoranId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "driverId", fetch = FetchType.LAZY)
    private List<Pesanan> pesananList;

    public Driver() {
    }

    public Driver(String driverId) {
        this.driverId = driverId;
    }

    public Driver(String driverId, String driverNama) {
        this.driverId = driverId;
        this.driverNama = driverNama;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getDriverNama() {
        return driverNama;
    }

    public void setDriverNama(String driverNama) {
        this.driverNama = driverNama;
    }

    public Restoran getRestoranId() {
        return restoranId;
    }

    public void setRestoranId(Restoran restoranId) {
        this.restoranId = restoranId;
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
        hash += (driverId != null ? driverId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.driverId == null && other.driverId != null) || (this.driverId != null && !this.driverId.equals(other.driverId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pesanantar.entity.Driver[ driverId=" + driverId + " ]";
    }
    
}
