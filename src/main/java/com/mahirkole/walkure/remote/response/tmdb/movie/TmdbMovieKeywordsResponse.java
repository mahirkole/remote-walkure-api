package com.mahirkole.walkure.remote.response.tmdb.movie;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbKeywordInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbMovieKeywordsResponse {

    private Long id;
    private List<TmdbKeywordInfo> keywords;
}
