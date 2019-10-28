package com.mahirkole.walkure.remote.response;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbAlternativeMovieTitle;
import lombok.Data;

import java.util.List;

@Data
public class TmdbAlternativeMovieTitlesResponse {

  private Long id;
  private List<TmdbAlternativeMovieTitle> titles;

  public TmdbAlternativeMovieTitlesResponse() {}
}
