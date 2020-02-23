package com.mahirkole.walkure.remote.model.domain.tmdb.tv;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbNetworkInfo {

    private String name;
    private Long id;
    private String logoPath;
    private String originCountry;
}
