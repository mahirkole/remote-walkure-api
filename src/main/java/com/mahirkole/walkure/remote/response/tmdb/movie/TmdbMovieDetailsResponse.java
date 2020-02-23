package com.mahirkole.walkure.remote.response.tmdb.movie;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbGenreInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieCollectionInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieProductionCompanyInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieProductionCountryInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieSpokenLanguageInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieDetailsResponse {

    private Boolean adult;
    private String backdropPath;
    private TmdbMovieCollectionInfo belongsToCollection;
    private Integer budget;
    private List<TmdbGenreInfo> genres;
    private String homepage;
    private Long id;
    private String imdbId;
    private String originalLanguage;
    private String originalTitle;
    private String overview;
    private Double popularity;
    private String posterPath;
    private List<TmdbMovieProductionCompanyInfo> productionCompanies;
    private List<TmdbMovieProductionCountryInfo> productionCountries;
    private String releaseDate;
    private Integer revenue;
    private Integer runtime;
    private List<TmdbMovieSpokenLanguageInfo> spokenLanguages;
    private String status;
    private String tagline;
    private String title;
    private Boolean video;
    private Double voteAverage;
    private Integer voteCount;
}
