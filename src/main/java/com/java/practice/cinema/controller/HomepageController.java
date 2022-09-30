package com.java.practice.cinema.controller;

import com.java.practice.cinema.entity.Movie;
import com.java.practice.cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomepageController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/home")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "homepage/homepage.html";
    }

    @GetMapping("/movieList")
    public String viewHomePage(Model model){
        List<Movie> movieList = movieService.getAllMovieList();
        System.out.print(movieList);
        System.out.print("Hello");
        return "";
    }

    @GetMapping("/member")
    public String member_login(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "member/member.html";
    }

    @GetMapping("/member_registration")
    public String member_registration(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "member/membercreate.html";
    }
}
