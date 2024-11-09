/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycart.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DELL
 */
@Entity
public class person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    private String Pname;
    private String Pcn;

    public person() {
    }

    public person(String Pname, String Pcn) {
        this.Pname = Pname;
        this.Pcn = Pcn;
    }

    public person(int ID, String Pname, String Pcn) {
        this.ID = ID;
        this.Pname = Pname;
        this.Pcn = Pcn;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public String getPcn() {
        return Pcn;
    }

    public void setPcn(String Pcn) {
        this.Pcn = Pcn;
    }

    @Override
    public String toString() {
        return "person{" + "ID=" + ID + ", Pname=" + Pname + ", Pcn=" + Pcn + '}';
    }
    
    
}
