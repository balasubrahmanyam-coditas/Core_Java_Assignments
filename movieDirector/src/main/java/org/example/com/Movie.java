package org.example.com;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {
    @Id
    private int mid;
    private String mname;
    @ManyToOne
    private Director director;
//    private List<Songs> songs = new ArrayList<Songs>();


    public Movie(int mid, String mname,Director director) {
        this.mid = mid;
        this.mname = mname;
        this.director=director;
    }

    public Movie() {
    }

    public int getMidId() {
        return mid;
    }

    public void setMidId(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", director=" + director +
                '}';
    }
}
