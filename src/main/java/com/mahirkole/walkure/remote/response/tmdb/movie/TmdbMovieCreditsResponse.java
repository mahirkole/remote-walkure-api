package com.mahirkole.walkure.remote.response.tmdb.movie;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCastInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCrewInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieCreditsResponse {

    private Long id;
    private List<TmdbCastInfo> cast;
    private List<TmdbCrewInfo> crew;
}
