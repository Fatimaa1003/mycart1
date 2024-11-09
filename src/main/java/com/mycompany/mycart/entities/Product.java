package com.mycompany.mycart.entities;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    //@Column(name = "p_title", nullable = false)
    private String pTitle;

    //@Column(name = "p_desc")
    private String pDesc;

   // @Column(name = "p_photo")
    private String pPhoto;

   // @Column(name = "p_price", nullable = false)
    private int pPrice;

    //@Column(name = "p_discount")
    private int pDiscount;

   // @Column(name = "p_quality")
    private int pQuality;

    @ManyToOne
   // @JoinColumn(name = "cid", nullable = false)
    private Category category;

   

  
    

    
    // Getters and Setters

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
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

    public int getpQuality() {
        return pQuality;
    }

    public void setpQuality(int pQuality) {
        this.pQuality = pQuality;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "pid=" + pid + ", pTitle=" + pTitle + ", pDesc=" + pDesc + ", pPhoto=" + pPhoto + ", pPrice=" + pPrice + ", pDiscount=" + pDiscount + ", pQuality=" + pQuality + ", category=" + category + '}';
    }
//calculate after discount
    public int getPriceAfterApplyingDiscount(){
        int d=(int)((this.getpDiscount() / 100.0)* this.getpPrice());
        return this.getpPrice()-d;
    }
   
    
}
