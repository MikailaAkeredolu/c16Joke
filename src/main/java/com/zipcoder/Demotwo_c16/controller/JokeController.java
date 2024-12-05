package com.zipcoder.Demotwo_c16.controller;

import com.zipcoder.Demotwo_c16.model.Joke;
import com.zipcoder.Demotwo_c16.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/jokes/{id}")
    public Joke getJoke(@PathVariable Long id){
        return jokeService.getJokeById(id);
    }


    @DeleteMapping("/jokes/{id}")
    public void deleteJoke(@PathVariable Long id){
        jokeService.deleteJokeById(id);
    }


    @PutMapping("/jokes/{id}")
    public Joke editJoke(@PathVariable Long id, @RequestBody Joke joke){
        return jokeService.updateJoke(id, joke);
    }


}
