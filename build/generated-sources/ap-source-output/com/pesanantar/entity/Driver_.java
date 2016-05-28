package com.pesanantar.entity;

import com.pesanantar.entity.Pesanan;
import com.pesanantar.entity.Restoran;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T17:27:02")
@StaticMetamodel(Driver.class)
public class Driver_ { 

    public static volatile SingularAttribute<Driver, Restoran> restoranId;
    public static volatile SingularAttribute<Driver, String> driverId;
    public static volatile SingularAttribute<Driver, String> driverNama;
    public static volatile ListAttribute<Driver, Pesanan> pesananList;

}