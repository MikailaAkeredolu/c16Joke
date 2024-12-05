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

    //Update a Joke
  public Joke updateJoke(Long id, Joke joke){
      for(Joke j : getAllJokes() ){
          if(j.getId().equals(id)){
              j.setValue(joke.getValue());
              return jokeRepository.save(j);
          }
      }
      return null;
  }

    //Get a single joke
    public Joke getJokeById(Long id){
        for (Joke j : getAllJokes()){
            if (j.getId().equals(id)){
                return j;
            }
        }
        return null;
    }




    //Delete a Joke
    public void deleteJokeById(Long id){
        jokeRepository.deleteById(id);
    }

}
