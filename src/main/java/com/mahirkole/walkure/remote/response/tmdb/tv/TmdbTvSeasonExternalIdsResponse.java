package com.mahirkole.walkure.remote.response.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbTvSeasonExternalIdsResponse {

    private Long id;
    private String freebaseMid;
    private String freebaseId;
    private String tvdbId;
    private String tvrageId;
}
