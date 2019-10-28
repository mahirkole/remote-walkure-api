package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbCrewInfo {

  private String creditId;
  private String department;
  private Integer gender;
  private Long id;
  private String job;
  private String name;
  private String profilePath;
}
