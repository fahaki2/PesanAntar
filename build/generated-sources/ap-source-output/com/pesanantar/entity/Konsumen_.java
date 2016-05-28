package com.pesanantar.entity;

import com.pesanantar.entity.Pesanan;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-05-28T17:27:02")
@StaticMetamodel(Konsumen.class)
public class Konsumen_ { 

    public static volatile SingularAttribute<Konsumen, String> konsumenNama;
    public static volatile SingularAttribute<Konsumen, Long> konsumenNomortelepon;
    public static volatile SingularAttribute<Konsumen, String> konsumenId;
    public static volatile ListAttribute<Konsumen, Pesanan> pesananList;
    public static volatile SingularAttribute<Konsumen, String> konsumenPassword;
    public static volatile SingularAttribute<Konsumen, String> konsumenEmail;

}