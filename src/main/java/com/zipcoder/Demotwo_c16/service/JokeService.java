package com.zipcoder.Demotwo_c16.service;


//Biz logic

import com.zipcoder.Demotwo_c16.model.Joke;
import com.zipcoder.Demotwo_c16.repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeService {


    @Autowired
    JokeRepository jokeRepository;

    //Create
     public void addJoke(Joke joke){
         jokeRepository.save(joke);
     }

     //Read
    public Iterable<Joke> getAllJokes(){
         return jokeRepository.findAll();
    }
}
