package com.stackroute.MuzixRestfulService.service;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.exceptions.TrackAlreadyExistsException;
import com.stackroute.MuzixRestfulService.repository.TrackRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    private Track track;

    //Create a mock for UserRepository
    @Mock
    private TrackRepository trackRepository;

    //Inject the mocks as dependencies into UserServiceImpl
    @InjectMocks
    private TrackServiceImpl trackService;
    List<Track> list= null;


    @Before
    public void setUp(){
        //Initialising the mock object
        MockitoAnnotations.initMocks(this);
        track = new Track();
        track.setTrackId(101);
        track.setTrackName("Jenny");
        track.setComments("commenting");
        list = new ArrayList<>();
        list.add(track);


    }

    @Test
    public void saveUserTestSuccess() throws TrackAlreadyExistsException {

        when(trackRepository.save((Track) any())).thenReturn(track);
        Track savedUser = trackService.saveTrack(track);
        Assert.assertEquals(track,savedUser);

        //verify here verifies that userRepository save method is only called once
        verify(trackRepository,times(1)).save(track);
      
    }

    @Test(expected = TrackAlreadyExistsException.class)
    public void saveUserTestFailure() throws TrackAlreadyExistsException {
        when(trackRepository.save((Track)any())).thenReturn(null);
        Track savedUser = trackService.saveTrack(track);
        System.out.println("savedUser" + savedUser);
        Assert.assertEquals(track,savedUser);

doThrow(new TrackAlreadyExistsException()).when(trackRepository).findById(eq(101));
       trackService.saveTrack(track);

    }

    @Test
    public void getAllUser(){
        trackRepository.save(track);
        //stubbing the mock to return specific data
        when(trackRepository.findAll()).thenReturn(list);
        List<Track> userlist = trackService.getAllTracks();
        Assert.assertEquals(list,userlist);
    }

    @Test
    public void getTrackById(){
        trackRepository.save(track);
        when(trackRepository.findById(any())).thenReturn(Optional.of(track));
        Optional<Track> tracks = trackService.getTracksById(track.getTrackId());

        Assert.assertEquals(Optional.of(track),tracks);
    }

    /*@Test
    public void getTracksByName(){
        trackRepository.save(track);
        when(trackRepository.findTrackByName(any())).thenReturn(list);
        List<Track> tracks = trackService.getTracksByName(track.getTrackName());

        Assert.assertEquals(list,tracks);

    }*/

}
