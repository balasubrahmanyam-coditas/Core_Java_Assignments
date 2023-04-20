package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;

import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

import static com.sun.java.accessibility.util.GUIInitializedMulticaster.add;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setLname("Dell");

        Laptop laptop1 = new Laptop();
        laptop1.setLid(2);
        laptop1.setLname("HP");

        Student s = new Student();
        s.setName("Kishor");
        s.setRollNo(10);
        s.setMarks(90);
        s.getLaptop().add(laptop);

        List<Laptop> list = new ArrayList<Laptop>();
        list.add(laptop);
        list.add(laptop1);
        s.setLaptop(list);


        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        session.save(laptop);
        tx.commit();
        session.close();
        factory.close();


        System.out.println( "Hello World!" );
    }
}
