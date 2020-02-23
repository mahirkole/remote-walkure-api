package com.mahirkole.walkure.remote.response.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonDetailsResponse {

    private Long id;
    private String name;
    private List<String> alsoKnownAs;
    private Integer gender;
    private String birthday;
    private String knownForDepartment;
    private String deathday;
    private String biography;
    private Double popularity;
    private String placeOfBirth;
    private String profilePath;
    private Boolean adult;
    private String imdbId;
    private String homepage;
}
