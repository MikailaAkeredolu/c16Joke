package com.zipcoder.Demotwo_c16.repository;

import com.zipcoder.Demotwo_c16.model.Joke;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository extends CrudRepository<Joke, Long > {

}
