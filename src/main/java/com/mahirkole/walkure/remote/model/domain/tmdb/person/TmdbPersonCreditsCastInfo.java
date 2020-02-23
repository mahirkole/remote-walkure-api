package com.mahirkole.walkure.remote.model.domain.tmdb.person;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonCreditsCastInfo {

    private String character;
    private String creditId;
    private List<Integer> genreIds;
    private String originalLanguage;
    private Long id;
    private String backdropPath;
    private String overview;
    private String posterPath;

}
