package com.mahirkole.walkure.remote.model.domain.walkure;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WalkureMovieCollectionInfo {

    private Long id;
    private String name;
    private String overview;
    private String poster;
}
