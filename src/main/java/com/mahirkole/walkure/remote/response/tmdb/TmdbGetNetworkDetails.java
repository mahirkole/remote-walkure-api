package com.mahirkole.walkure.remote.response.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbGetNetworkDetails {

    private String headquarters;
    private String homepage;
    private Long id;
    private String name;
    private String originCountry;
}
