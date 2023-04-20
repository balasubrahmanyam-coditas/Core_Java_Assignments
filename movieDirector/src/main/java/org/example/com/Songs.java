//package org.example.com;
//
//import javax.persistence.ManyToOne;
//
//public class Songs {
//    private int sid;
//    private String sname;
//
//    @ManyToOne
//    private Movie movie;
//
//    public Songs(int sid, String sname, Movie movie) {
//        this.sid = sid;
//        this.sname = sname;
//        this.movie = movie;
//    }
//
//    public int getSid() {
//        return sid;
//    }
//
//    public void setSid(int sid) {
//        this.sid = sid;
//    }
//
//    public String getSname() {
//        return sname;
//    }
//
//    public void setSname(String sname) {
//        this.sname = sname;
//    }
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Songs{" +
//                "sid=" + sid +
//                ", sname='" + sname + '\'' +
//                ", movie=" + movie +
//                '}';
//    }
//}
