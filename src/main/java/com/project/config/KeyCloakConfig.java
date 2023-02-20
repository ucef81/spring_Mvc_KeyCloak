package com.project.config;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KeyCloakConfig {

	
	@Bean
	KeycloakSpringBootConfigResolver configResolver() {
		
		return new KeycloakSpringBootConfigResolver();
	}
	
}
