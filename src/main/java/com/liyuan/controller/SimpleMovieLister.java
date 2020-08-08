package com.liyuan.controller;

public class SimpleMovieLister {
    private MovieFinder movieFinder;


    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    public void test(){
        System.out.println(movieFinder);
    }
}
