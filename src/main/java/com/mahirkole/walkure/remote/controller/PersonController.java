package com.mahirkole.walkure.remote.controller;

import com.mahirkole.walkure.remote.client.TheMovieDbClient;
import com.mahirkole.walkure.remote.client.WalkureMovieClient;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkurePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class PersonController {

  @Autowired TheMovieDbClient theMovieDbClient;

  @Autowired WalkureMovieClient walkureMovieClient;

  @GetMapping("/{personId}")
  public ResponseEntity getPersonByPersonId(
      @PathVariable Long personId, @PathVariable String apiKey) {
    return ResponseEntity.ok(theMovieDbClient.getPersonDetailsByPersonId(personId, apiKey));
  }

  @PostMapping("/")
  public ResponseEntity createPerson(@RequestBody WalkurePerson person) {
    return ResponseEntity.ok(walkureMovieClient.createPerson(person));
  }
}
