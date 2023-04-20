package org.example.com;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Director {
    @Id
    private int did;
    private String dname;

   @OneToMany(mappedBy = "director")
   private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Director() {
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Director{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", movies=" + movies +
                '}';
    }
}
