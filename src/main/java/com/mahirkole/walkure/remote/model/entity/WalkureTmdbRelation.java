package com.mahirkole.walkure.remote.model.entity;

import com.mahirkole.walkure.remote.enums.ContentType;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "walkure_tmdb_relation")
@Table(
    name = "walkure_tmdb_relation",
    uniqueConstraints = @UniqueConstraint(columnNames = {"walkureId", "type"}))
@Data
public class WalkureTmdbRelation {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @NotNull private Long walkureId;
  @NotNull private Long tmdbId;

  @Enumerated(EnumType.STRING)
  private ContentType type;
}
