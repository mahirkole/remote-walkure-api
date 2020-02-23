package com.mahirkole.walkure.remote.model.domain.walkure;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureCast {

    private Long personId;
    private String character;
    private Integer order;
}
