package com.mahirkole.walkure.remote.response.tmdb.person;

import com.mahirkole.walkure.remote.model.domain.tmdb.person.TmdbPersonCreditsCrewInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class TmdbPersonTvCreditsCrewInfo extends TmdbPersonCreditsCrewInfo {

    private List<String> originCountry;
    private String originalName;
    private String name;
    private String firstAirDate;
}
