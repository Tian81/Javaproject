package com.java.practice.cinema.daos;

import com.java.practice.cinema.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieDao extends JpaRepository<Movie, Long> {
}
