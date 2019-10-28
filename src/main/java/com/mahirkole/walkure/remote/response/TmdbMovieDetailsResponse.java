package com.mahirkole.walkure.remote.response;

import com.mahirkole.walkure.remote.model.domain.tmdb.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieDetailsResponse {

  private Boolean adult;
  private String backdropPath;
  private TmdbCollectionInfo belongsToCollection;
  private Integer budget;
  private List<TmdbGenre> genres;
  private String homepage;
  private Long id;
  private String imdbId;
  private String originalLanguage;
  private String originalTitle;
  private String overview;
  private Double popularity;
  private String posterPath;
  private List<TmdbProductionCompanyInfo> productionCompanies;
  private List<TmdbProductionCountryInfo> productionCountries;
  private String releaseDate;
  private Integer revenue;
  private Integer runtime;
  private List<TmdbSpokenLanguageInfo> spokenLanguages;
  private String status;
  private String tagline;
  private String title;
  private Boolean video;
  private Double voteAverage;
  private Integer voteCount;
}
