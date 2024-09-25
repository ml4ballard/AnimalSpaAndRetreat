package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Giraffe;

public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.run();

	}

	public void run() {
		AnimalRetreat retreat = new AnimalRetreat("Fred the Attendant");
//		System.out.println(AnimalRetreat.attendant);
		
		Giraffe giffe = new Giraffe("George");
		System.out.println(giffe.getName());
		
		System.out.println(giffe.getNoise());
	
	}

}
