package com.mahirkole.walkure.remote.response.tmdb.person;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbImageInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbPersonImagesResponse {

    private Long id;
    private List<TmdbImageInfo> profiles;
}
