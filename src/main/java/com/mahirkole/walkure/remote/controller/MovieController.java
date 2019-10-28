package com.mahirkole.walkure.remote.controller;

import com.mahirkole.walkure.remote.client.TheMovieDbClient;
import com.mahirkole.walkure.remote.client.WalkureMovieClient;
import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbProductionCompanyInfo;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureMovie;
import com.mahirkole.walkure.remote.response.TmdbMovieDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {

  @Autowired TheMovieDbClient theMovieDbClient;

  @Autowired WalkureMovieClient walkureMovieClient;

  @GetMapping("/{id}")
  public ResponseEntity getMovieById(@PathVariable Long id, @PathVariable String apiKey) {
    return ResponseEntity.ok(theMovieDbClient.getMovieById(id, apiKey));
  }

  @GetMapping("/{id}/alternative_titles")
  public ResponseEntity getAlternativeMovieTitlesByMovieId(
      @PathVariable Long id, @PathVariable String apiKey) {
    return ResponseEntity.ok(theMovieDbClient.getAlternativeMovieTitlesByMovieId(id, apiKey));
  }

  @GetMapping("/{id}/credits")
  public ResponseEntity getMovieCreditsByMovieId(
      @PathVariable Long id, @PathVariable String apiKey) {
    return ResponseEntity.ok(theMovieDbClient.getMovieCreditsByMovieId(id, apiKey));
  }

  @GetMapping("/{id}/external_ids")
  public ResponseEntity getMovieExternalIdsByMovieId(
      @PathVariable Long id, @PathVariable String apiKey) {
    return ResponseEntity.ok(theMovieDbClient.getMovieExternalIdsByMovieId(id, apiKey));
  }

  @GetMapping("/{id}/create")
  public ResponseEntity createMovie(@PathVariable Long id, @PathVariable String apiKey) {

    TmdbMovieDetailsResponse movieDetails = theMovieDbClient.getMovieById(id, apiKey);

    WalkureMovie movie = new WalkureMovie();
    movie.setName(movieDetails.getTitle());
    movie.setHomepage(movieDetails.getHomepage());
    movie.setOverview(movieDetails.getOverview());
    movie.setLanguage(movieDetails.getOriginalLanguage());
    movie.setRuntime(movieDetails.getRuntime());
    movie.setBudget(movieDetails.getBudget());
    movie.setImdbId(movieDetails.getImdbId());
    movie.setIsAdult(movieDetails.getAdult());
    movie.setReleaseDate(movieDetails.getReleaseDate());
    movie.setMovieCollectionId(movieDetails.getBelongsToCollection().getId());

    List<Long> productionCompanyIdList = new ArrayList<>();

    for (TmdbProductionCompanyInfo productionCompanyInfo : movieDetails.getProductionCompanies()) {
      // WalkureGetCompanyResponse companyResponse =
      // walkureMovieClient.getCompanyById(productionCompanyInfo.getName());
      /*
      if(companyResponse != null) {
          productionCompanyIdList.add(productionCompanyInfo.getId());
      } else {
          WalkureCompany walkureCompany = new WalkureCompany();
          walkureCompany.setName(productionCompanyInfo.getName());
          walkureCompany.setCountry(productionCompanyInfo.getOrigin_country());

          WalkureCreateCompanyResponse createCompanyResponse = walkureMovieClient.createCompany(walkureCompany);
          productionCompanyIdList.add(createCompanyResponse.getId());
      }
      */
    }

    movie.setCompanyIds(productionCompanyIdList);

    List<Long> genreIdList = new ArrayList<>();
    /*
    for (TmdbGenre genre : movieDetails.getGenres()) {
        WalkureGenre walkureGenre = walkureMovieClient.getGenreById(genre.getId());
    }*/

    // movie.setGenreIds();

    return ResponseEntity.ok(walkureMovieClient.createMovie(movie));
  }
}
