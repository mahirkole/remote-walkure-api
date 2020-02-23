package com.mahirkole.walkure.remote.response.tmdb.person;

import com.mahirkole.walkure.remote.model.domain.tmdb.person.TmdbPersonMovieCreditsCastInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.person.TmdbPersonMovieCreditsCrewInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonMovieCreditsResponse {

    private Long id;
    private List<TmdbPersonMovieCreditsCastInfo> cast;
    private List<TmdbPersonMovieCreditsCrewInfo> crew;
}
