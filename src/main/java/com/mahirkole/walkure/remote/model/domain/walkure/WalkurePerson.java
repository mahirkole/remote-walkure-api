package com.mahirkole.walkure.remote.model.domain.walkure;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkurePerson {

    private String name;
    private String birthday;
    private String gender;
    private String bio;
    private String birthPlace;
    private String homepage;
    private String imageUrl;
}
