package com.mahirkole.walkure.remote.response.tmdb;

import com.mahirkole.walkure.remote.model.domain.tmdb.movie.TmdbMovieProductionCompanyInfo;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureCompany;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {

    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    WalkureCompany toWalkureCompany(TmdbMovieProductionCompanyInfo tmdbProductionCompanyInfo);
}
