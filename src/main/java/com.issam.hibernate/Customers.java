package com.issam.hibernate;

import javax.persistence.*;

/**
 * Created by user on 10/6/2015.
 */

@Entity
@Table(name = "CUSTOMERS")
public class Customers {
    @Id
    @GeneratedValue
    @Column (name = "ID")
    private int id;
    @Column (name = "FIRST_NAME")
    private String firstName;
    @Column (name = "LAST_NAME")
    private String lastName;
    @Column (name = "ADDRESS")
    private String address;
    @Column (name = "PHONE")
    private String phone;
    @Column (name = "EMAIL")
    private String email;
    @Column (name = "REG")
    private int reg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }
}
