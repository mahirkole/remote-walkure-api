package com.mahirkole.walkure.remote.response.tmdb.movie;

import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieReleaseDatesInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieReleaseDatesResponse {

    private Long id;
    private List<TmdbMovieReleaseDatesInfo> results;
}
