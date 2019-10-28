package com.mahirkole.walkure.remote.client;

import com.mahirkole.walkure.remote.model.domain.walkure.WalkureCompany;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureGenre;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureMovie;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkurePerson;
import com.mahirkole.walkure.remote.response.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "walkure-movie", url = "http://localhost:8080")
public interface WalkureMovieClient {

  @PostMapping("/genre")
  WalkureCreateGenreResponse createGenre(WalkureGenre genre);

  @PostMapping("/company")
  WalkureCreateCompanyResponse createCompany(WalkureCompany company);

  @GetMapping("/company/{id}")
  WalkureGetCompanyResponse getCompanyById(@PathVariable Long id);

  @GetMapping("/company")
  List<WalkureGetCompanyResponse> getCompaniesByName(@RequestParam String name);

  @PostMapping("/person")
  WalkureCreatePersonResponse createPerson(WalkurePerson person);

  @PostMapping("/movie")
  WalkureCreateMovieResponse createMovie(WalkureMovie movie);

  @GetMapping("/genre/{id}")
  WalkureGetGenreResponse getGenreById(@PathVariable Long id);

  @GetMapping("/genre")
  List<WalkureGetGenreResponse> getGenresByName(@RequestParam String name);
}
