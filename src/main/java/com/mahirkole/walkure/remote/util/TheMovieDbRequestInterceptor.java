package com.mahirkole.walkure.remote.util;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TheMovieDbRequestInterceptor implements RequestInterceptor {

    @Value("${tmdb.api_key}")
    private String apiKey;
    private final String API_KEY_PARAM = "api_key";

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.query(API_KEY_PARAM, apiKey);
    }
}
