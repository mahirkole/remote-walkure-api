package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCastInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCrewInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvCreditsResponse {

    private Long id;
    private List<TmdbCrewInfo> crew;
    private List<TmdbCastInfo> cast;
}
