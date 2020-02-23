package com.mahirkole.walkure.remote.response.tmdb.tv;

import com.mahirkole.walkure.remote.model.domain.tmdb.tv.TmdbTvEpisodeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class TmdbTvSeasonDetailsResponse {

    private Long id;
    private String _id;
    private String name;
    private Integer seasonNumber;
    private String overview;
    private String airDate;
    private String posterPath;
    private List<TmdbTvEpisodeInfo> episodes;
}
