package com.mahirkole.walkure.remote.response;

import com.mahirkole.walkure.remote.model.domain.walkure.WalkureCompany;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureGenre;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureMovieCollectionInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WalkureCreateMovieResponse {

  private Long id;
  private String name;
  private String homepage;
  private String poster;
  private String overview;
  private String language;
  private Integer runtime;
  private Integer budget;
  private String imdbId;
  private String idAdult;
  private String releaseDate;
  private WalkureMovieCollectionInfo movieCollection;
  private List<WalkureGenre> genres;
  private List<WalkureCompany> companies;
}
