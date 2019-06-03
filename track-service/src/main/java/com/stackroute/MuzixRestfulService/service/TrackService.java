package com.stackroute.MuzixRestfulService.service;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.exceptions.TrackAlreadyExistsException;
import com.stackroute.MuzixRestfulService.exceptions.TrackNotFoundException;

import java.util.List;
import java.util.Optional;

public interface TrackService {

    public void seedData(Track track);

    public Track saveTrack(Track track) throws TrackAlreadyExistsException;

    public List<Track> getAllTracks();

    public Optional<Track> getTracksById(int id);

//    public List<Track> getTracksByName(String name);

    public void deleteTrack(Track track);

    public void update(Track track) throws TrackNotFoundException;

}
