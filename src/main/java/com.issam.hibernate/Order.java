package com.issam.hibernate;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 10/4/2015.
 */
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int orderId;
    @Column(name = "CUSTOMER_ID")
    private int customerId;
    @Column(name = "REG")
    private int reg;
    @Column(name = "DELIVERY_ADDRESS_ID")
    private String deliveryAddressId;
    @Column(name = "PAYMENT_TYPE")
    private int paymentType;
    @Column(name = "DATE_TIME")
    private String dateTime;
    @Column(name = "STATUS")
    private String Status;
    @Column(name = "TOTAL")
    private double Total;

    public String getDeliveryAddressId() {
        return deliveryAddressId;
    }

    public void setDeliveryAddressId(String deliveryAddressId) {
        this.deliveryAddressId = deliveryAddressId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int registred) {
        this.reg = registred;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }



}