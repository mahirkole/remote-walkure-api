package com.mahirkole.walkure.remote.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbMovieExternalIdsResponse {

  private Long id;
  private String imdbId;
  private String facebookId;
  private String instagramId;
  private String twitterId;
}
