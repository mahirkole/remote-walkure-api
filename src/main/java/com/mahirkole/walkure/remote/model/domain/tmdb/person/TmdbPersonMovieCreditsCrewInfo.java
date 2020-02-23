package com.mahirkole.walkure.remote.model.domain.tmdb.person;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class TmdbPersonMovieCreditsCrewInfo extends TmdbPersonCreditsCrewInfo {

    private String originalTitle;
    private Boolean video;
    private String title;
    private Boolean adult;
    private String releaseDate;
}
