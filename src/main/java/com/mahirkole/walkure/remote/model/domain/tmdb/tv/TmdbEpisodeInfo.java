package com.mahirkole.walkure.remote.model.domain.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbEpisodeInfo {

    private String airDate;
    private Integer episodeNumber;
    private Long id;
    private String name;
    private String overview;
    private String productionCode;
    private Integer seasonNumber;
    private Long showId;
    private String stillPath;
}
