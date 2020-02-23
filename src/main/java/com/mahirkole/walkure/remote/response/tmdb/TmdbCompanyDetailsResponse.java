package com.mahirkole.walkure.remote.response.tmdb;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCompanyInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbCompanyDetailsResponse {

    private Long id;
    private String description;
    private String headquerters;
    private String homepage;
    private String logoPath;
    private String name;
    private String originCountry;
    private TmdbCompanyInfo parentCompany;
}
