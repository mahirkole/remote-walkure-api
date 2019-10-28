package com.mahirkole.walkure.remote.client;

import com.mahirkole.walkure.remote.response.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "the-moviedb-client", url = "https://api.themoviedb.org/3/")
public interface TheMovieDbClient {

  String API_KEY_PARAM = "?api_key={api_key}";

  @GetMapping("/movie/{id}" + API_KEY_PARAM)
  TmdbMovieDetailsResponse getMovieById(@PathVariable Long id, @PathVariable String api_key);

  @GetMapping("/movie/{id}/alternative_titles" + API_KEY_PARAM)
  TmdbAlternativeMovieTitlesResponse getAlternativeMovieTitlesByMovieId(
      @PathVariable Long id, @PathVariable String api_key);

  @GetMapping("/movie/{id}/credits" + API_KEY_PARAM)
  TmdbMovieCreditsResponse getMovieCreditsByMovieId(
      @PathVariable Long id, @PathVariable String api_key);

  @GetMapping("/movie/{id}/external_ids" + API_KEY_PARAM)
  TmdbMovieExternalIdsResponse getMovieExternalIdsByMovieId(
      @PathVariable Long id, @PathVariable String api_key);

  @GetMapping("/person/{personId}" + API_KEY_PARAM)
  TmdbPersonDetailsResponse getPersonDetailsByPersonId(
      @PathVariable Long personId, @PathVariable String api_key);

  @GetMapping("/company/{companyId}" + API_KEY_PARAM)
  TmdbCompanyDetailsResponse getCompanyByCompanyId(
      @PathVariable Long companyId, @PathVariable String api_key);
}
