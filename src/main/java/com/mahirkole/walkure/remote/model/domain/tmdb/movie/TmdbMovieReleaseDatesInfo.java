package com.mahirkole.walkure.remote.model.domain.tmdb.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieReleaseDatesInfo {

    private String iso_3166_1;
    private List<TmdbMovieReleaseDateInfo> releaseDates;
}
