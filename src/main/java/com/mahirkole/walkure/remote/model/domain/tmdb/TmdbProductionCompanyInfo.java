package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbProductionCompanyInfo {

  private String name;
  private Long id;
  private String logo_path;
  private String origin_country;
}
