package com.stackroute.MuzixRestfulService.repository;

import com.stackroute.MuzixRestfulService.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
public interface TrackRepository extends MongoRepository<Track, Integer> {

}
