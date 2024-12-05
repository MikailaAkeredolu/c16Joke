package com.zipcoder.Demotwo_c16.controller;

import com.zipcoder.Demotwo_c16.model.Joke;
import com.zipcoder.Demotwo_c16.service.JokeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JokeController {

    private  final Logger logger = LoggerFactory.getLogger(JokeController.class);

    @Autowired
    JokeService jokeService;

    @PostMapping("/jokes")
    public void createJoke(@RequestBody Joke joke){
        jokeService.addJoke(joke);
        logger.info("Created a joke successfully");
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
        logger.info("deleted a joke with id of " + id);
        jokeService.deleteJokeById(id);
    }


    @PutMapping("/jokes/{id}")
    public Joke editJoke(@PathVariable Long id, @RequestBody Joke joke){
        return jokeService.updateJoke(id, joke);
    }


}
