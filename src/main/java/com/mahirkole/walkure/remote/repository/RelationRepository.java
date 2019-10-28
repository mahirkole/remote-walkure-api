package com.mahirkole.walkure.remote.repository;

import com.mahirkole.walkure.remote.enums.ContentType;
import com.mahirkole.walkure.remote.model.entity.WalkureTmdbRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RelationRepository extends JpaRepository<WalkureTmdbRelation, Long> {

  Optional<WalkureTmdbRelation> findByTmdbIdAndContentType(Long tmdbId, ContentType contentType);

  Optional<WalkureTmdbRelation> findByWalkureIdAndContentType(
      Long walkureId, ContentType contentType);
}
