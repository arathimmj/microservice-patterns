package com.stackroute.MuzixRestfulService.config;

import com.stackroute.MuzixRestfulService.domain.Track;
import com.stackroute.MuzixRestfulService.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StartUpApplicationListener implements
        ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private TrackService trackService;

    Track track;

    /*@Value("${track.trackId}")
    int trackId;

    @Value("${track.trackName}")
    String trackName;

    @Value("${track.comments}")
    String comments;*/

    @Autowired
    Environment env;

    @Override

    public void onApplicationEvent(ContextRefreshedEvent event) {

//        track = new Track(trackId,trackName,comments);

//        track = new Track(Integer.parseInt(env.getProperty("trackId")),env.getProperty("trackName"), env.getProperty("comments"));
//
//        trackService.seedData(track);
    }

}
