package com.mahirkole.walkure.remote.service;

import com.mahirkole.walkure.remote.enums.ContentType;
import com.mahirkole.walkure.remote.model.entity.WalkureTmdbRelation;
import com.mahirkole.walkure.remote.repository.RelationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RelationService {

  private final RelationRepository relationRepository;

  @Autowired
  public RelationService(RelationRepository relationRepository) {
    this.relationRepository = relationRepository;
  }

  public WalkureTmdbRelation getRelationByTmdbId(Long tmdbId, ContentType contentType)
      throws Exception {
    return this.relationRepository
        .findByTmdbIdAndContentType(tmdbId, contentType)
        .orElseThrow(Exception::new);
  }

  public WalkureTmdbRelation getRelationByWalkureId(Long walkureId, ContentType contentType)
      throws Exception {
    return this.relationRepository
        .findByWalkureIdAndContentType(walkureId, contentType)
        .orElseThrow(Exception::new);
  }

  public WalkureTmdbRelation createRelation(WalkureTmdbRelation newRelation) throws Exception {
    WalkureTmdbRelation relation =
        getRelationByTmdbId(newRelation.getTmdbId(), newRelation.getType());
    return relationRepository.save(relation);
  }
}
