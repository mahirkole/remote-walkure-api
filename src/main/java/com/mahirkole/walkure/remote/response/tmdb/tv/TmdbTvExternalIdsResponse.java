package com.mahirkole.walkure.remote.response.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbTvExternalIdsResponse {

    private Long id;
    private String imdbId;
    private String freebaseMid;
    private String freebaseId;
    private Integer tvdbId;
    private Integer tvrageId;
    private String facebookId;
    private String instagramId;
    private String twitterId;
}
