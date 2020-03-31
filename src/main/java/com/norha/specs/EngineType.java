package com.norha.specs;
import com.norha.interfaces.Engine;

public class EngineType implements Engine {
	
	String type;
	
	

	public EngineType() {
		
		this.type = "Unknown";
	}


	public EngineType(String type) {
		
		this.type = type;
	}



	public String type() {
		return type;
	}

	

}
 