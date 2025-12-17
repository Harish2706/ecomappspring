package com.ecomapp.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Product {


    @Id
    private int id;

    private String name;

    @Column(name = "description")
    private String desc;

    private String brand;

    private BigDecimal price;

    private String category;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-mm-yyyy")
    private Date releasedate;

    private boolean available;

    private int quantity;

    private String imagename;
    private String imagetype;
    @Lob
    private byte[] imagedata;

    // No-args constructor (REQUIRED by JPA)
    public Product() {
    }


    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public byte[] getImagedata() {
        return imagedata;
    }

    public void setImagedata(byte[] imagedata) {
        this.imagedata = imagedata;
    }

    public Product(int id, String name, String desc, String brand,
                   BigDecimal price, String category, Date releasedate,
                   boolean available, int quantity) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releasedate = releasedate;
        this.available = available;
        this.quantity = quantity;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
