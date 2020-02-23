package com.mahirkole.walkure.remote.model.domain.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbSeasonInfo {

    private String airDate;
    private Integer episodeCount;
    private Long id;
    private String name;
    private String overview;
    private String posterPath;
    private Integer seasonNumber;
}
