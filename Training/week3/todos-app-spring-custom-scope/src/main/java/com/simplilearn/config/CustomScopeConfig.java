package com.simplilearn.config;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.simplilearn.scope.CustomScope;

@Configuration
public class CustomScopeConfig {

	@Bean
	public static CustomScopeConfigurer customScopeConfigurer() {
		
		CustomScopeConfigurer configure = new CustomScopeConfigurer();
		configure.addScope("custom", new CustomScope());
		return configure;
		
	}
	
	

}

