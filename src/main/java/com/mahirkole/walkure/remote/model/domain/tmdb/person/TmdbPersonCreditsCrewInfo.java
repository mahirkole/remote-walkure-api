package com.mahirkole.walkure.remote.model.domain.tmdb.person;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonCreditsCrewInfo {

    private Long id;
    private String department;
    private String originalLanguage;
    private String job;
    private String overview;
    private List<Integer> genreIds;
    private String backdropPath;
    private String posterPath;
    private String creditId;
}
