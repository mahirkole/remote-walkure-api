package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbAlternativeTitleInfo {

    private String iso_3166_1;
    private String title;
    private String type;
}
