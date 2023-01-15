package br.com.limas.springapicrud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenAPiConfig {

    @Bean
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("RESTFUL API JAVA And Spring - LEARNING")
                        .version("v1")
                        .description("Detalhar depois")
                        .termsOfService("trocar pela url depois")
                        .license(new License().name("MIT License")
                                .url("trocar pela url depois")));

    }

}
