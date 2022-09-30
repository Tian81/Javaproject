package com.java.practice.cinema.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieid;
    @Column(name="moviename")
    private String moviename;
    @Column(name="category")
    private String category;
    @Column(name="moviestatus")
    private String moviestatus;
    @Column(name="moviedescription")
    private String moviedescription;
    @Column(name="released_date")
    private LocalDateTime releasedDate;

    public int getMovieid() {
        return movieid;
    }

    public void setMovieid(int movieid) {
        this.movieid = movieid;
    }

    public String getMoviename() {
        return moviename;
    }

    public Movie() {
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMoviestatus() {
        return moviestatus;
    }

    public void setMoviestatus(String moviestatus) {
        this.moviestatus = moviestatus;
    }

    public String getMoviedescription() {
        return moviedescription;
    }

    public void setMoviedescription(String moviedescription) {
        this.moviedescription = moviedescription;
    }

    public LocalDateTime getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(LocalDateTime releasedDate) {
        this.releasedDate = releasedDate;
    }


}
