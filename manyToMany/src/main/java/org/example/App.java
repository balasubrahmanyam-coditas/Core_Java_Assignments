package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration().configure();

        SessionFactory factory = cfg.buildSessionFactory();

        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setLname("Dell");

        Student s = new Student();
        s.setName("Kishor");
        s.setRollNo(10);
        s.setMarks(90);
        s.setLaptop(laptop);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(laptop);
        tx.commit();
        session.close();
        factory.close();

        System.out.println( "Hello World!" );
    }
}
