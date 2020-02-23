package com.mahirkole.walkure.remote.model.domain.tmdb.person;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class TmdbPersonMovieCreditsCastInfo extends TmdbPersonCreditsCastInfo {

    private String releaseDate;
    private Boolean video;
    private Boolean adult;
    private String title;
    private String originalTitle;
}
