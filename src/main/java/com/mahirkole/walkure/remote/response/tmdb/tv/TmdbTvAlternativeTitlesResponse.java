package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbAlternativeTitleInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvAlternativeTitlesResponse {

    private Long id;
    private List<TmdbAlternativeTitleInfo> results;
}
