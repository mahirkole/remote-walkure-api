package com.mahirkole.walkure.remote.response.tmdb.person;

import com.mahirkole.walkure.remote.model.domain.tmdb.person.TmdbPersonCreditsCastInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
class TmdbPersonTvCreditsCastInfo extends TmdbPersonCreditsCastInfo {

    private String originalName;
    private String name;
    private String firstAirDate;
    private List<String> originCountry;
}
