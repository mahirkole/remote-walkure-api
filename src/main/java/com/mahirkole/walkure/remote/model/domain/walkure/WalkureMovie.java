package com.mahirkole.walkure.remote.model.domain.walkure;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class WalkureMovie {

  private String name;
  private String homepage;
  private Long posterId;
  private String overview;
  private String language;
  private Integer runtime;
  private Integer budget;
  private String imdbId;
  private Boolean isAdult;
  private String releaseDate;
  private Long movieCollectionId;
  private List<Long> genreIds;
  private List<Long> companyIds;
}
