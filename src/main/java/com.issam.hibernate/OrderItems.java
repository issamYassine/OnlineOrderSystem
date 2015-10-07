package com.issam.hibernate;

import javax.persistence.*;

/**
 * Created by user on 10/6/2015.
 */

@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItems {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    @Column(name = "ORDER_ID")
    private int orderId;
    @Column(name = "PRODUCT_ID")
    private int productId;
    @Column(name = "QUANTITY")
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
