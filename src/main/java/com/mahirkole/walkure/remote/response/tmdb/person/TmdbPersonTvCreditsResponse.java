package com.mahirkole.walkure.remote.response.tmdb.person;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonTvCreditsResponse {

    private Long id;
    private List<TmdbPersonTvCreditsCastInfo> cast;
    private List<TmdbPersonTvCreditsCrewInfo> crew;
}
