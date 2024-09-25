package com.skilldistillery.spa.entities;

public class Walrus extends Animal{
	private String noise = "whistle";


	
// methods
	
	public Walrus() { }
	
	public Walrus(String name) {
		super( name );
	}
		
	public Walrus(String name, String noise) {
			super( name );
			this.noise = noise;
		
	}
	
	@Override
	public void makeNoise() {
		super.makeNoise();
		System.out.println("noisey and what animal does");
		
	}
	
}