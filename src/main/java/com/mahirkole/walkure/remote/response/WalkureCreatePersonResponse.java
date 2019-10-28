package com.mahirkole.walkure.remote.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureCreatePersonResponse {

  private Long id;
  private String name;
  private String birthday;
  private String gender;
  private String bio;
  private String birthPlace;
  private String homepage;
  private String imageUrl;
}
