package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbVideoInfo {

    private Long id;
    private String iso_639_1;
    private String iso_3166_1;
    private String key;
    private String name;
    private String site;
    private Integer size;
    private String type;
}
