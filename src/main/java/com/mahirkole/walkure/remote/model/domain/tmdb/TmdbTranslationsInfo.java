package com.mahirkole.walkure.remote.model.domain.tmdb;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TmdbTranslationsInfo<T> {

    private String iso_3166_1;
    private String iso_639_1;
    private String name;
    private String englishName;
    private T data;
}
