package com.skilldistillery.spa.entities;

public class Hippo extends Animal{
	private String noise = "wheeze";


	
// methods
	
	public Hippo() { }
	
	public Hippo(String name) {
		super( name );
	}
		
	public Hippo(String name, String noise) {
			super( name );
			this.noise = noise;
		
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("noisey and what animal does");
		
	}
	
}
