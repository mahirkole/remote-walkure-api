package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbCastInfo {

  private Long castId;
  private String character;
  private String creditId;
  private Integer gender;
  private Long id;
  private String name;
  private Integer order;
  private String profilePath;
}
