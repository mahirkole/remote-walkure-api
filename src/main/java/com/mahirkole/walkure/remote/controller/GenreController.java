package com.mahirkole.walkure.remote.controller;

import com.mahirkole.walkure.remote.client.WalkureMovieClient;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("genre")
public class GenreController {

  @Autowired WalkureMovieClient walkureMovieClient;

  @PostMapping("/")
  public ResponseEntity createGenre(@RequestBody WalkureGenre genre) {
    return ResponseEntity.ok(walkureMovieClient.createGenre(genre));
  }
}
