package com.mahirkole.walkure.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
// @EnableDiscoveryClient
public class RemoteWalkureApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(RemoteWalkureApiApplication.class, args);
  }
}
