package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbTranslationsInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.tv.TmdbTvTranslationInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvTranslationsResponse {

    private Long id;
    private List<TmdbTranslationsInfo<TmdbTvTranslationInfo>> translations;
}
