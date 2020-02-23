package com.mahirkole.walkure.remote.response.tmdb;

import com.mahirkole.walkure.remote.model.domain.tmdb.TmdbGenreInfo;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureGenre;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface GenreMapper {

    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class);

    WalkureGenre toWalkureGenre(TmdbGenreInfo tmdbGenre);
}
