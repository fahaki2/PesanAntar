package com.pesanantar.entity;

import com.pesanantar.entity.Driver;
import com.pesanantar.entity.Konsumen;
import com.pesanantar.entity.Makanan;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T17:27:02")
@StaticMetamodel(Pesanan.class)
public class Pesanan_ { 

    public static volatile SingularAttribute<Pesanan, Float> pesananTotalharga;
    public static volatile SingularAttribute<Pesanan, Boolean> pesananStatusbayar;
    public static volatile SingularAttribute<Pesanan, Driver> driverId;
    public static volatile SingularAttribute<Pesanan, String> pesananId;
    public static volatile SingularAttribute<Pesanan, String> pesananStatusproses;
    public static volatile SingularAttribute<Pesanan, Konsumen> konsumenId;
    public static volatile ListAttribute<Pesanan, Makanan> makananList;
    public static volatile SingularAttribute<Pesanan, Date> pesananWaktusampai;
    public static volatile SingularAttribute<Pesanan, String> pesananAlamatantar;
    public static volatile SingularAttribute<Pesanan, Date> pesananWaktupesan;

}