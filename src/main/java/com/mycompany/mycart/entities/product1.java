/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycart.entities;

import javax.persistence.Column;

import javax.persistence.*;

/**
 *
 * @author DELL
 */
@Entity
public class product1 {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int pId;
private String pNmae;
@Column(length=3000)
private String pDesc;
private String pPhoto;
private int pPrice;
private int pDiscount;
private int pQuantity;
@ManyToOne
private category1 category;

    public product1() {
    }

    public product1(int pId, String pNmae, String pDesc, String pPhoto, int pPrice, int pDiscount, int pQuantity) {
        this.pId = pId;
        this.pNmae = pNmae;
        this.pDesc = pDesc;
        this.pPhoto = pPhoto;
        this.pPrice = pPrice;
        this.pDiscount = pDiscount;
        this.pQuantity = pQuantity;
    }

    public product1(String pNmae, String pDesc, String pPhoto, int pPrice, int pDiscount, int pQuantity,category1 category) {
        this.pNmae = pNmae;
        this.pDesc = pDesc;
        this.pPhoto = pPhoto;
        this.pPrice = pPrice;
        this.pDiscount = pDiscount;
        this.pQuantity = pQuantity;
        this.category=category;
    }
    

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpNmae() {
        return pNmae;
    }

    public void setpNmae(String pNmae) {
        this.pNmae = pNmae;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getpPhoto() {
        return pPhoto;
    }

    public void setpPhoto(String pPhoto) {
        this.pPhoto = pPhoto;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public int getpDiscount() {
        return pDiscount;
    }

    public void setpDiscount(int pDiscount) {
        this.pDiscount = pDiscount;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public category1 getCategory() {
        return category;
    }

    public void setCategory(category1 category) {
        this.category = category;
    }
    

    @Override
    public String toString() {
        return "product1{" + "pId=" + pId + ", pNmae=" + pNmae + ", pDesc=" + pDesc + ", pPhoto=" + pPhoto + ", pPrice=" + pPrice + ", pDiscount=" + pDiscount + ", pQuantity=" + pQuantity + '}';
    }

}
