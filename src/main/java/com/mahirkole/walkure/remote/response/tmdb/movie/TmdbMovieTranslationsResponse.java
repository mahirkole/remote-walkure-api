package com.mahirkole.walkure.remote.response.tmdb.movie;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbTranslationsInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieTranslationInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieTranslationsResponse {

    private Long id;
    private List<TmdbTranslationsInfo<TmdbMovieTranslationInfo>> translations;
}
