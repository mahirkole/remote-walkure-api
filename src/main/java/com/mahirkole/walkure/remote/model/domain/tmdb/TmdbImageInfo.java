package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class TmdbImageInfo {

    private BigDecimal aspectRatio;
    private String filePath;
    private Integer height;
    private String iso_639_1;
    private Integer voteAverage;
    private Integer voteCount;
    private Integer width;
}
