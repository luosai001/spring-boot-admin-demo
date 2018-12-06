package com.springcloud.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: luosai
 * @Date: 2018/12/6 14:10
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class SpringBootAdminApplication {
  public static void main(String[] args) {
    SpringApplication.run(SpringBootAdminApplication.class, args);
  }
}

