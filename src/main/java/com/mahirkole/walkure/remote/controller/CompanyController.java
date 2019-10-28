package com.mahirkole.walkure.remote.controller;

import com.mahirkole.walkure.remote.client.TheMovieDbClient;
import com.mahirkole.walkure.remote.client.WalkureMovieClient;
import com.mahirkole.walkure.remote.model.domain.walkure.WalkureCompany;
import com.mahirkole.walkure.remote.response.TmdbCompanyDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("company")
public class CompanyController {

  @Autowired private TheMovieDbClient theMovieDbClient;

  @Autowired private WalkureMovieClient walkureMovieClient;

  @GetMapping("/{companyId}")
  public ResponseEntity getCompanyByCompanyId(
      @PathVariable Long companyId, @PathVariable String apiKey) {
    return ResponseEntity.ok(theMovieDbClient.getCompanyByCompanyId(companyId, apiKey));
  }

  @GetMapping("")
  public ResponseEntity getCompaniesByCompanyName(@RequestParam String name) {
    return ResponseEntity.ok(walkureMovieClient.getCompaniesByName(name));
  }

  @GetMapping("/{companyId}/create")
  public ResponseEntity createCompany(@PathVariable Long companyId, @PathVariable String apiKey) {
    TmdbCompanyDetailsResponse companyDetails =
        theMovieDbClient.getCompanyByCompanyId(companyId, apiKey);
    WalkureCompany company = new WalkureCompany();
    company.setName(companyDetails.getName());
    company.setDescription(companyDetails.getDescription());
    company.setCountry(companyDetails.getOriginCountry());
    company.setHomepage(companyDetails.getHomepage());

    return ResponseEntity.ok(walkureMovieClient.createCompany(company));
  }
}
