package com.mahirkole.walkure.remote.model.domain.tmdb.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbMovieReleaseDateInfo {

    private String certification;
    private String iso_639_1;
    private String releaseDate;
    private Integer type;
    private String note;
}
