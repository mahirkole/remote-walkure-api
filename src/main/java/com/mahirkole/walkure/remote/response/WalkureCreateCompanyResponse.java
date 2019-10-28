package com.mahirkole.walkure.remote.response;

import com.mahirkole.walkure.remote.model.domain.walkure.WalkureImageInfo;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureParentCompanyInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureCreateCompanyResponse {

  private Long id;
  private String name;
  private String country;
  private WalkureParentCompanyInfo parent;
  private String description;
  private String homepage;
  private WalkureImageInfo logo;
}
