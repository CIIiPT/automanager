package com.homeurok.automanager.domain;

import javax.persistence.*;

@Entity
@Table(name="autos")
public class Auto {

    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;

    @Column(name="marka")
    private String marka;

    @Column(name="vladelec")
    private String vladelec;

    @Column(name="number")
    private String number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getVladelec() {
        return vladelec;
    }

    public void setVladelec(String vladelec) {
        this.vladelec = vladelec;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
