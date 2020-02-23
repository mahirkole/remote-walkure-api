package com.mahirkole.walkure.remote.model.domain.tmdb.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbMovieTranslationInfo {

    private String title;
    private String overview;
    private String homepage;
}
