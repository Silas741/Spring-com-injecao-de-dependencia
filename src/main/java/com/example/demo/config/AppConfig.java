package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.utils.Calculadora;

@Configuration
public class AppConfig {
	@Bean
	public Calculadora getCalculadora() {
		return new Calculadora();
	}
	
}
