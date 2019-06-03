package com.stackroute.MuzixRestfulService.controller;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.exceptions.TrackAlreadyExistsException;
import com.stackroute.MuzixRestfulService.exceptions.TrackNotFoundException;
import com.stackroute.MuzixRestfulService.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class TrackController {

    @Autowired
    private TrackService trackService;

    /*@EventListener
    public void seed(ContextRefreshedEvent event) {

        Track track = new Track(6,"For You","Rita Ora");

        trackService.seedData(track);

    }*/

    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track) throws TrackAlreadyExistsException {
        ResponseEntity responseEntity;
        try {
            Track trackOne = trackService.saveTrack(track);
            responseEntity = new ResponseEntity<Track>(track, HttpStatus.CREATED);
        } catch (TrackAlreadyExistsException trackAlreadyExistsException) {
            responseEntity = new ResponseEntity(trackAlreadyExistsException.getMessage(), HttpStatus.CONFLICT);
//            throw trackAlreadyExistsException;
        }

        return responseEntity;
    }

    @GetMapping("track")
    public ResponseEntity<?> getAllTracks(){

        return new ResponseEntity<List<Track>>(trackService.getAllTracks(),HttpStatus.OK);

    }

    @GetMapping("trackById")
    public ResponseEntity<?> getTracksById(@RequestParam("id") int id){

        return new ResponseEntity<Optional<Track>>(trackService.getTracksById(id),HttpStatus.OK);

    }

//    @GetMapping("trackByName")
//    public ResponseEntity<?> getTracksByName(@RequestParam("name") String name){
//
//        return new ResponseEntity<List<Track>>(trackService.getTracksByName(name),HttpStatus.OK);
//
//    }

    @DeleteMapping("delete")
    public void deleteTrack(@RequestBody Track track){

        trackService.deleteTrack(track);

    }

    @PutMapping("update")
    public ResponseEntity<?> updateTrack(@RequestBody Track track) throws TrackNotFoundException {

        ResponseEntity responseEntity;
            try {
                trackService.update(track);
                responseEntity = new ResponseEntity<String>("Updated", HttpStatus.CREATED);
            } catch (TrackNotFoundException trackNotFoundException) {
                throw trackNotFoundException;
            }

            return responseEntity;

    }
}
