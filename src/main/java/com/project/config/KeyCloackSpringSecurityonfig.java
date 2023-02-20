package com.project.config;

import java.util.List;

import org.keycloak.adapters.springsecurity.config.KeycloakWebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.session.SessionInformation;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;


@EnableWebSecurity
public class KeyCloackSpringSecurityonfig extends KeycloakWebSecurityConfigurerAdapter {

	@Override
	protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
		// TODO Auto-generated method stub
		return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.authenticationProvider(keycloakAuthenticationProvider());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		super.configure(http);
		http.authorizeRequests().antMatchers("/products/**").authenticated();
	}
}
