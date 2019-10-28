package com.mahirkole.walkure.remote.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureGetCompanyResponse {

  private Long id;
  private String name;
  private String country;
  private Long parentId;
  private String description;
  private String homepage;
  private Long imageId;
}
