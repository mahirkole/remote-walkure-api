package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCastInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCrewInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvEpisodeDetailsResponse {

    private String airDate;
    private Integer episodeNumber;
    private String name;
    private String overview;
    private Long id;
    private String productionCode;
    private Integer seasonNumber;
    private String stillPath;
    private List<TmdbCastInfo> guestStars;
    private List<TmdbCrewInfo> crew;
}
