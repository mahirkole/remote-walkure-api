package com.mahirkole.walkure.remote.client;

import com.mahirkole.walkure.remote.response.tmdb.TmdbCompanyDetailsResponse;
import com.mahirkole.walkure.remote.response.tmdb.TmdbGetGenresResponse;
import com.mahirkole.walkure.remote.response.tmdb.TmdbGetKeywordResponse;
import com.mahirkole.walkure.remote.response.tmdb.TmdbGetNetworkDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "the-moviedb-client", url = "${tmdb.api_url}")
public interface TheMovieDbClient {

    @GetMapping("/company/{company_id}")
    TmdbCompanyDetailsResponse getCompanyDetailsByCompanyId(@PathVariable Long company_id);

    @GetMapping("/genre/movie/list")
    TmdbGetGenresResponse getMovieGenres();

    @GetMapping("/genre/tv/list")
    TmdbGetGenresResponse getTvGenres();

    @GetMapping("/keyword/{keyword_id}")
    TmdbGetKeywordResponse getKeywordByKeywordId(@PathVariable Long keyword_id);

    @GetMapping("/network/{network_id}")
    TmdbGetNetworkDetails getNetworkDetailsByNetworkId(@PathVariable Long network_id);
}
