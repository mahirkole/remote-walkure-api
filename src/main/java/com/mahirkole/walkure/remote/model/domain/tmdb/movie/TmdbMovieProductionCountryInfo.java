package com.mahirkole.walkure.remote.model.domain.tmdb.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbMovieProductionCountryInfo {

    private String iso_3166_1;
    private String name;
}
