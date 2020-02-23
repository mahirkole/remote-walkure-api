package com.mahirkole.walkure.remote.response.tmdb.movie;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbAlternativeTitleInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieAlternativeTitlesResponse {

    private Long id;
    private List<TmdbAlternativeTitleInfo> titles;
}
