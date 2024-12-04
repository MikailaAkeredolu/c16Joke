package com.zipcoder.Demotwo_c16.controller;

import com.zipcoder.Demotwo_c16.model.Joke;
import com.zipcoder.Demotwo_c16.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @Autowired
    JokeService jokeService;

    //define my route


    @PostMapping("/jokes")
    public void createJoke(@RequestBody Joke joke){
        jokeService.addJoke(joke);
    }

    @GetMapping("/jokes")
    public Iterable<Joke> getJokes(){
        return jokeService.getAllJokes();
    }


}
