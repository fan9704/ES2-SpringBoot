package com.fkt.es2springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableElasticsearchRepositories
//@EnableWebMvc
public class Es2SpringBootApplication {
    private static final Logger log = LoggerFactory.getLogger(Es2SpringBootApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(Es2SpringBootApplication.class, args);
        log.info("Web Document Reference http://127.0.0.1:8080/swagger-ui/index.html");
        log.info("Server is Running on http://127.0.0.1:8080");
    }

}
