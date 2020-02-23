package com.mahirkole.walkure.remote.client;

import com.mahirkole.walkure.remote.response.tmdb.TmdbPersonDetailsResponse;
import com.mahirkole.walkure.remote.response.tmdb.person.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "the-moviedb-person-client", url = "${tmdb.api_url}/person")
public interface TheMovieDbPersonClient {

    @GetMapping("/{id}/")
    TmdbPersonDetailsResponse getPersonDetailsByPersonId(@PathVariable Long id);

    @GetMapping("/{id}/movie_credits")
    TmdbPersonMovieCreditsResponse getPersonMovieCreditsByPersonId(@PathVariable Long id);

    @GetMapping("/{id}/tv_credits")
    TmdbPersonTvCreditsResponse getPersonTvCreditsByPersonId(@PathVariable Long id);

    @GetMapping("/{id}/external_ids")
    TmdbPersonExternalIdsResponse getPersonExternalIdsByPersonId(@PathVariable Long id);

    @GetMapping("/{id}/images")
    TmdbPersonImagesResponse getPersonImagesByPersonId(@PathVariable Long id);

    @GetMapping("/{id}/translations")
    TmdbPersonTranslationsResponse getPersonTranslationsByPersonId(@PathVariable Long id);
}
