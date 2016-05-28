package com.pesanantar.entity;

import com.pesanantar.entity.Driver;
import com.pesanantar.entity.Makanan;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T17:27:03")
@StaticMetamodel(Restoran.class)
public class Restoran_ { 

    public static volatile SingularAttribute<Restoran, String> restoranDeskripsi;
    public static volatile SingularAttribute<Restoran, Boolean> restoranAvaibilitystatus;
    public static volatile SingularAttribute<Restoran, String> restoranAlamat;
    public static volatile SingularAttribute<Restoran, byte[]> restoranGambar;
    public static volatile SingularAttribute<Restoran, String> restoranId;
    public static volatile SingularAttribute<Restoran, String> restoranNama;
    public static volatile SingularAttribute<Restoran, Date> restoranWaktubuka;
    public static volatile ListAttribute<Restoran, Makanan> makananList;
    public static volatile SingularAttribute<Restoran, Date> restoranWaktututup;
    public static volatile ListAttribute<Restoran, Driver> driverList;

}