package com.mahirkole.walkure.remote.response.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbTvEpisodeExternalIdsResponse {

    private Long id;
    private String imdbId;
    private String freebaseMid;
    private String freebaseId;
    private String tvdbId;
    private String tvrageId;
}
