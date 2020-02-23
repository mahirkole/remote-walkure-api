package com.mahirkole.walkure.remote.response.tmdb.person;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbPersonExternalIdsResponse {

    private String imdbId;
    private String facebookId;
    private String freebaseMid;
    private String freebaseId;
    private Long tvrageId;
    private String twitterId;
    private Long id;
    private String instagramId;
}
