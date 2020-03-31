package com.norha.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


import com.norha.interfaces.Car;
import com.norha.interfaces.Engine;


public class Corolla implements Car {

	@Autowired 
	@Qualifier("engineType")
	Engine engine;
	

	public String specs() {

		String speString = "Sedan From Toyota With Engine Type as " + engine.type();
		return speString;
	}

}
