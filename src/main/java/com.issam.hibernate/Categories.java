package com.issam.hibernate;

import javax.persistence.*;

/**
 * Created by user on 10/6/2015.
 */
@Entity
@Table(name = "CATEGORIES")
public class Categories {
    @Id
    @GeneratedValue
    @Column (name = "ID")
    private int id;
    @Column (name = "NAME")
    private String name;
    @Column (name = "DESCRIPTION")
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
