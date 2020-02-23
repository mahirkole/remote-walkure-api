package com.mahirkole.walkure.remote.model.domain.tmdb.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbMovieCollectionInfo {

    private Long id;
    private String name;
    private String posterPath;
    private String backdropPath;
}
