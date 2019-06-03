package com.stackroute.MuzixRestfulService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "track")
public class Track {

    @Id
    private int trackId;

    private String trackName;

    private String comments;

}
