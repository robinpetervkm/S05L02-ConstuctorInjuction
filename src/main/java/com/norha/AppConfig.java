package com.norha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.norha.cars.Corolla;
import com.norha.cars.Swift;
import com.norha.specs.EngineType;


@Configuration
@ComponentScan("com.norha")
public class AppConfig {
	
	@Bean("myCorolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	} 
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 ENGINE");
	}
	
	
}
