package com.mahirkole.walkure.remote.response.tmdb;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbGenreInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbGetGenresResponse {

    List<TmdbGenreInfo> genres;
}
