package com.lpu;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateOperation {
    public static void main(String[] args){

        Configuration con = new Configuration();
        con.configure();

        SessionFactory sessionFactory = con.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();
        System.out.println("Updating data");
        Product product = (Product) session.get(Product.class,2);
        product.setPrice(500);

        transaction.commit();

        session.close();

    }
}
