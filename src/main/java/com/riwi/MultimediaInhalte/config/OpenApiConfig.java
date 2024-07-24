package com.riwi.MultimediaInhalte.config;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/*** Swagger configuration */
@Configuration
@OpenAPIDefinition(info = @Info(title = "Api for multimedia management", version = "1.0", description = "A multimedia content management system for virtual classrooms that allows RIWI to efficiently store and manage classes, lessons and multimedia materials."))
public class OpenApiConfig {
}
