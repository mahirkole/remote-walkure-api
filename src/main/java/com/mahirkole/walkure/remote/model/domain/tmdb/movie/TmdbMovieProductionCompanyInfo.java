package com.mahirkole.walkure.remote.model.domain.tmdb.movie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbMovieProductionCompanyInfo {

    private String name;
    private Long id;
    private String logo_path;
    private String origin_country;
}
