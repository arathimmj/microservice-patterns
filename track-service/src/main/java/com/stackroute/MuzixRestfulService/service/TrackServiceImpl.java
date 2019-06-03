package com.stackroute.MuzixRestfulService.service;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.exceptions.TrackAlreadyExistsException;
import com.stackroute.MuzixRestfulService.exceptions.TrackNotFoundException;
import com.stackroute.MuzixRestfulService.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService{

    @Autowired
    private TrackRepository trackRepository;

    @Override
    public void seedData(Track track) {

        if (!trackRepository.existsById(track.getTrackId()))
        {
            trackRepository.save(track);
        }

    }

    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException {
        if (trackRepository.existsById(track.getTrackId()))
        {
            throw new TrackAlreadyExistsException("Track already exists");
        }
        Track trackOne = trackRepository.save(track);

        if (trackOne == null)
            throw new TrackAlreadyExistsException("Track already exists");

        return trackOne;
    }

    @Override
    public List<Track> getAllTracks() {

        return trackRepository.findAll();
    }

    @Override
    public Optional<Track> getTracksById(int id) {
        return trackRepository.findById(id);
    }

//    @Override
//    public List<Track> getTracksByName(String name) {
//        return trackRepository.findTrackByName(name);
//    }

    @Override
    public void deleteTrack(Track track){
        trackRepository.delete(track);
    }

    @Override
    public void update(Track track) throws TrackNotFoundException {

        if (!trackRepository.existsById(track.getTrackId()))
            throw new TrackNotFoundException("Track not found");
        trackRepository.save(track);

    }

}
