package org.example.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();


        Director director = new Director();
        director.setDname("Vinod");
        director.setDid(1);

//        Director director1 = new Director();
//        director1.setDname("Subhash");
//        director1.setDid(2);

        Movie movie = new Movie();
        movie.setMid(100);
        movie.setMname("Fast");
        movie.setDirector(director);

        Movie movie1 = new Movie();
        movie1.setMidId(101);
        movie1.setMname("Harry potter");
        movie1.setDirector(director);


        List<Movie> list = new ArrayList<Movie>();
        list.add(movie);
        list.add(movie1);
        director.setMovies(list);


        session.save(movie);
        session.save(movie1);
        session.save(director);

       transaction.commit();
        session.close();

    }
}
