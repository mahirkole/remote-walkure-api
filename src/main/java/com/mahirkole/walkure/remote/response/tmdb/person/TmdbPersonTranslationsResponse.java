package com.mahirkole.walkure.remote.response.tmdb.person;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbTranslationsInfo;
import com.mahirkole.walkure.remote.model.domain.tmdb.person.TmdbPersonTranslationInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonTranslationsResponse {

    private Long id;
    private List<TmdbTranslationsInfo<TmdbPersonTranslationInfo>> data;
}
