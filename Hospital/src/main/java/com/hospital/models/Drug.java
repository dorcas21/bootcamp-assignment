package com.hospital.models;

import javax.persistence.*;

/**
 * Created by mueni on 5/7/15.
 */
@Entity
@Table(name="drugs")
public class Drug {
    @Id
    @GeneratedValue
    @Column(name = "drug_id")
    private int id;

     @Column(name = "drug_name")
     private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}