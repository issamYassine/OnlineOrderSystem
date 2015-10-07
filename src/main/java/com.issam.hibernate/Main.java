package com.issam.hibernate;

import javafx.scene.effect.SepiaTone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.Date;


/**
 * Created by user on 10/4/2015.
 */
public class Main {

    public static void main(String[] args){
        Order order = new Order();
        order.setCustomerId(1);
        order.setDateTime("2015-09-15");
        order.setDeliveryAddressId("1000 State Dr Fairfax,Va 22030");
        order.setOrderId(1);
        order.setPaymentType(0000000000000000);
        order.setReg(1);
        order.setStatus("pending");
        order.setTotal(30.00);

        OrderItems orderitems = new OrderItems();
        orderitems.setOrderId(50);
        orderitems.setId(1);
        orderitems.setProductId(60);
        orderitems.setQuantity(2);

        Items items = new Items();
        items.setId(1);
        items.setCatId(0);
        items.setDescription("book");
        items.setName("java");
        items.setPrice(15.00);

        DeliveryAddresses deliveryaddress = new DeliveryAddresses();
        deliveryaddress.setId(1);
        deliveryaddress.setAddress("1000 State Dr Fairfax,Va 22030");
        deliveryaddress.setEmail("issam@gmail.com");
        deliveryaddress.setFirstName("issam");
        deliveryaddress.setLastName("yassine");
        deliveryaddress.setPhone("5402783618");

        Customers customers = new Customers();
        customers.setEmail("issam@gmail.com");
        customers.setPhone("5402783618");
        customers.setLastName("yassine");
        customers.setReg(0);
        customers.setAddress("1000 State Dr Fairfax,Va 22030");
        customers.setId(1);
        customers.setFirstName("issam");

        Categories categories = new Categories();
        categories.setId(1);
        categories.setName("books");
        categories.setDescription("java");



        order.setCustomers(customers);
        customers.setOrder(order);




        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(order);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();


    }



}
