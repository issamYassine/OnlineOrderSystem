package com.issam.hibernate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by user on 10/6/2015.
 */
public class Items {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "CATEGORY_ID")
    private int categoryId;
    @Column (name = "NAME")
    private String name;
    @Column(name ="DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCatId() {
        return categoryId;
    }

    public void setCatId(int catId) {
        this.categoryId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
