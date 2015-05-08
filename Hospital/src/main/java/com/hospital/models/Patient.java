package com.hospital.models;

import javax.persistence.*;

/**
 * Created by
 */

@Entity
@Table(name="patients")
public class Patient {
    @Id
    @GeneratedValue

    @Column(name = "patient_id")
    private int id;
    
    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String last_name;

    @Column(name = "dob")
    private String dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() { return dob;}

    public void setDob(String dob) { this.dob = dob; }
}