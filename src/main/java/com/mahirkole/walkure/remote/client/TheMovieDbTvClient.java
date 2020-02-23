package com.mahirkole.walkure.remote.client;

import com.mahirkole.walkure.remote.response.tmdb.tv.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "the-moviedb-tv-client", url = "${tmdb.api_url}/tv")
public interface TheMovieDbTvClient {

    @GetMapping("/{id}/")
    TmdbTvDetailsResponse getTvDetailsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/alternative_titles")
    TmdbTvAlternativeTitlesResponse getTvAlternativeTitlesByTvId(@PathVariable Long id);

    @GetMapping("/{id}/credits")
    TmdbTvCreditsResponse getTvCreditsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/external_ids")
    TmdbTvExternalIdsResponse getTvExternalIdsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/images")
    TmdbTvImagesResponse getTvImagesIdsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/keywords")
    TmdbTvKeywordsResponse getTvKeywordsIdsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/translations")
    TmdbTvTranslationsResponse getTvTranslationsIdsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/videos")
    TmdbTvVideosResponse getTvVideosIdsByTvId(@PathVariable Long id);

    @GetMapping("/{id}/season/{season_number}")
    TmdbTvSeasonDetailsResponse getTvSeasonDetailsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number);

    @GetMapping("/{id}/season/{season_number}/credits")
    TmdbTvSeasonCreditsResponse getTvSeasonCreditsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number);

    @GetMapping("/{id}/season/{season_number}/external_ids")
    TmdbTvSeasonExternalIdsResponse getTvSeasonExternalIdsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number);

    @GetMapping("/{id}/season/{season_number}/images")
    TmdbTvSeasonImagesResponse getTvSeasonImagesByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number);

    @GetMapping("/{id}/season/{season_number}/videos")
    TmdbTvSeasonVideosResponse getTvSeasonVideosByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number);

    @GetMapping("/{id}/season/{season_number}/episode/{episode_number}")
    TmdbTvEpisodeDetailsResponse getTvEpisodeDetailsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number, @PathVariable Long episode_number);

    @GetMapping("/{id}/season/{season_number}/episode/{episode_number}/credits")
    TmdbTvEpisodeCreditsResponse getTvEpisodeCreditsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number, @PathVariable Long episode_number);

    @GetMapping("/{id}/season/{season_number}/episode/{episode_number}/external_ids")
    TmdbTvEpisodeExternalIdsResponse getTvEpisodeExternalIdsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number, @PathVariable Long episode_number);

    @GetMapping("/{id}/season/{season_number}/episode/{episode_number}/images")
    TmdbTvEpisodeImagesResponse getTvEpisodeImagesByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number, @PathVariable Long episode_number);

    @GetMapping("/{id}/season/{season_number}/episode/{episode_number}/translations")
    TmdbTvEpisodeTranslationsResponse getTvEpisodeTranslationsByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number, @PathVariable Long episode_number);

    @GetMapping("/{id}/season/{season_number}/episode/{episode_number}/videos")
    TmdbTvEpisodeVideosResponse getTvEpisodeVideosByTvIdAndSeasonNumber(@PathVariable Long id, @PathVariable Long season_number, @PathVariable Long episode_number);
}
