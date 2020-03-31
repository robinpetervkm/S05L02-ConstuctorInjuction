package com.norha;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.norha.cars.Corolla;
import com.norha.cars.Swift;
import com.norha.specs.V6;
import com.norha.specs.V8;

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
	
	@Bean("V6Engine")
	public V6 v6() {
		return new V6();
	}
	
	@Bean("V8Engine")
	public V8 v8() {
		return new V8();
	}
	
}
