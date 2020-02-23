package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbCompanyInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbGenreInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.tv.TmdbEpisodeInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.tv.TmdbNetworkInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.tv.TmdbSeasonInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.tv.TmdbTvCreatedByInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvDetailsResponse {

    private String backdopPath;
    private List<TmdbTvCreatedByInfo> createdBy;
    private List<Integer> episodeRunTime;
    private String firstAirDate;
    private List<TmdbGenreInfo> genres;
    private String homepage;
    private Long id;
    private Boolean inProduction;
    private List<String> languages;
    private String lastAirDate;
    private TmdbEpisodeInfo lastEpisodeToAir;
    private String name;
    private List<TmdbNetworkInfo> networks;
    private Integer numberOfEpisodes;
    private Integer numberOfSeasons;
    private List<String> originCountry;
    private String originalLanguage;
    private String originalName;
    private String overview;
    private String posterPath;
    private List<TmdbCompanyInfo> productionCompanies;
    private List<TmdbSeasonInfo> seasons;
    private String status;
    private String type;
}
