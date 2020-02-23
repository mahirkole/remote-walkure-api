package com.mahirkole.walkure.remote;

import com.mahirkole.walkure.remote.client.TheMovieDbMovieClient;
import com.mahirkole.walkure.remote.response.tmdb.movie.TmdbMovieDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private final TheMovieDbMovieClient movieClient;

    @Autowired
    public MovieController(TheMovieDbMovieClient movieClient) {
        this.movieClient = movieClient;
    }

    @GetMapping("/{movie_id}")
    public TmdbMovieDetailsResponse getMovieDetailsByMovieId(@PathVariable Long movie_id) {
        return movieClient.getMovieDetailsByMovieId(movie_id);
    }
}
