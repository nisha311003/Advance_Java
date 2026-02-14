package com.lpu;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Here the process starts" );

        Configuration configuration = new Configuration();

        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Product product = new Product();
        product.setName("Kettle");
        product.setDescription("Used for boiling water");
        product.setCategory("Electronics");
        product.setQunatity(1);
        product.setPrice(879.90);
        product.setSku("AA1");
        product.setActive(true);

        Product product1 = new Product();
        product1.setName("T-Shirt");
        product1.setDescription("cotton");
        product1.setCategory("Clothing");
        product1.setQunatity(2);
        product1.setPrice(300);
        product1.setSku("AB1");
        product1.setActive(true);
        Transaction transaction = session.beginTransaction();

        session.persist(product);
        session.persist(product1);

        transaction.commit();

        session.close();


    }
}
