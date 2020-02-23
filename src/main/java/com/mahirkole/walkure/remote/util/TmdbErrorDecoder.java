package com.mahirkole.walkure.remote.util;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class TmdbErrorDecoder implements ErrorDecoder {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 401:
                logger.error("Unauthorized Access to remote api");
                return new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid API Key");
            case 404:
                logger.error("Not found on remote api");
                return new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Resource Not Found on Remote API Server");
        }

        return new ResponseStatusException(
                HttpStatus.INTERNAL_SERVER_ERROR, "There is an issue on Remote API Server");
    }
}
