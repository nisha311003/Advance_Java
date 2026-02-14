package com.lpu;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadOperation {
    public static void main(String[] args){

        Configuration con = new Configuration();

        con.configure();

        SessionFactory sessionFactory = con.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Product product = (Product) session.get(Product.class, 1);
        System.out.println("Reading data from database");
        System.out.println("Name of the product: "+product.getName()+"\nCategory: "+product.getCategory()+
                "\nTotal Price: "+(product.getPrice()* product.getQunatity()));

        session.close();
        sessionFactory.close();
    }

}
