package com.skilldistillery.spa.entities;

public class Giraffe extends Animal{
	private String noise = "Guuulllpp";
	

	
// methods
	
	public Giraffe() { }
	
	public Giraffe(String name) {
		super( name );
	}
		
	public Giraffe(String name, String noise) {
			super( name );
			this.setNoise(noise);
		
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("noise " + getNoise());
		
	}

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}
	
}
