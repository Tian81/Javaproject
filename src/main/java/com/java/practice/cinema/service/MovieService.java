package com.java.practice.cinema.service;

import com.java.practice.cinema.daos.MovieDao;
import com.java.practice.cinema.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MovieService {
    @Autowired
    private MovieDao movieDao;

    public List<Movie> getAllMovieList() {
        return movieDao.findAll();
    }


}
