/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycart.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author DELL
 */
@Entity
public class category1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int categoryId;
    private String categoryTitles;
    private String categoryDescription; 
    
    @OneToMany(mappedBy ="category")
private List<Product>products=new ArrayList<>();

    public category1() {
    }

    public category1(int categoryId, String categoryTitles, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryTitles = categoryTitles;
        this.categoryDescription = categoryDescription;
    }

    public category1(String categoryTitles, String categoryDescription,List<Product>products) {
        this.categoryTitles = categoryTitles;
        this.categoryDescription = categoryDescription;
        this.products=products;
    
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryTitles() {
        return categoryTitles;
    }

    public void setCategoryTitles(String categoryTitles) {
        this.categoryTitles = categoryTitles;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    

    @Override
    public String toString() {
        return "category1{" + "categoryId=" + categoryId + ", categoryTitles=" + categoryTitles + ", categoryDescription=" + categoryDescription + '}';
    }
    
}
