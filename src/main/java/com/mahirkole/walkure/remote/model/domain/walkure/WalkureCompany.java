package com.mahirkole.walkure.remote.model.domain.walkure;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureCompany {

  private String name;
  private String country;
  private Long parentId;
  private String description;
  private String homepage;
  private Long imageId;
}
