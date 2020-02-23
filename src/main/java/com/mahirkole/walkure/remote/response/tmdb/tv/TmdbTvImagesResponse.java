package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbImageInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvImagesResponse {

    private Long id;
    private List<TmdbImageInfo> backdrops;
    private List<TmdbImageInfo> posters;
}
