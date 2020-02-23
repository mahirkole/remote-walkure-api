package com.mahirkole.walkure.remote.model.domain.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbTvCreatedByInfo {

    private Long id;
    private String creditId;
    private String name;
    private Integer gender;
    private String profilePath;
}
