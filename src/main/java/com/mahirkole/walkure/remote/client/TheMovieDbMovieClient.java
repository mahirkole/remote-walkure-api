package com.mahirkole.walkure.remote.client;

import com.mahirkole.walkure.remote.response.tmdb.movie.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "the-moviedb-movie-client", url = "${tmdb.api_url}/movie")
public interface TheMovieDbMovieClient {

    @GetMapping("/{id}")
    TmdbMovieDetailsResponse getMovieDetailsByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/alternative_titles")
    TmdbMovieAlternativeTitlesResponse getMovieAlternativeTitlesByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/credits")
    TmdbMovieCreditsResponse getMovieCreditsByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/external_ids")
    TmdbMovieExternalIdsResponse getMovieExternalIdsByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/images")
    TmdbMovieImagesResponse getMovieImagesByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/keywords")
    TmdbMovieKeywordsResponse getMovieKeywordsByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/release_dates")
    TmdbMovieReleaseDatesResponse getMovieReleaseDatesByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/videos")
    TmdbMovieVideosResponse getMovieVideosByMovieId(@PathVariable Long id);

    @GetMapping("/{id}/translations")
    TmdbMovieTranslationsResponse getMovieTranslationsByMovieId(@PathVariable Long id);
}
