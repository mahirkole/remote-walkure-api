package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbParentCompanyInfo {

  private Long id;
  private String name;
  private String logoPath;
}
