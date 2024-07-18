package com.dio.desafioAPI_dio.Doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Santander Dev Week API")
                        .version("1.0")
                        .description("API para o desafio Santander Dev Week 2023"));
    }

}
