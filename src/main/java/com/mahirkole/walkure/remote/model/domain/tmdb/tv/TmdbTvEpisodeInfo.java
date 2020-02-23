package com.mahirkole.walkure.remote.model.domain.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCastInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCrewInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvEpisodeInfo {

    private String airDate;
    private Integer episodeNumber;
    private List<TmdbCastInfo> guestStars;
    private String name;
    private String overview;
    private Long id;
    private String productionCode;
    private Integer seasonNumber;
    private String stillPath;
    private List<TmdbCrewInfo> crew;
}
