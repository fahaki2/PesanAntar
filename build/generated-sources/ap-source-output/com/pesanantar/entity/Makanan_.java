package com.pesanantar.entity;

import com.pesanantar.entity.Pesanan;
import com.pesanantar.entity.Restoran;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T17:27:02")
@StaticMetamodel(Makanan.class)
public class Makanan_ { 

    public static volatile SingularAttribute<Makanan, Float> makananHarga;
    public static volatile SingularAttribute<Makanan, Restoran> restoranId;
    public static volatile SingularAttribute<Makanan, Boolean> makananAvaibilitystatus;
    public static volatile SingularAttribute<Makanan, String> makananDeskripsi;
    public static volatile ListAttribute<Makanan, Pesanan> pesananList;
    public static volatile SingularAttribute<Makanan, byte[]> makananGambar;
    public static volatile SingularAttribute<Makanan, String> makananId;
    public static volatile SingularAttribute<Makanan, String> makananNama;

}