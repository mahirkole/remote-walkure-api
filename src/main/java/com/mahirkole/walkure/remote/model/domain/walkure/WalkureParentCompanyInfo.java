package com.mahirkole.walkure.remote.model.domain.walkure;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureParentCompanyInfo {

  private Long id;
  private String name;
  private String country;
  private WalkureParentCompanyInfo parent;
  private String description;
  private String homepage;
  private WalkureImageInfo logo;
}
