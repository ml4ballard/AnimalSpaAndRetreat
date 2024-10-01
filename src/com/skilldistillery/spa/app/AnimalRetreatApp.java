package com.skilldistillery.spa.app;

import com.skilldistillery.spa.entities.Hippo;
import com.skilldistillery.spa.entities.AnimalRetreat;
import com.skilldistillery.spa.entities.Giraffe;

import java.util.Scanner;
public class AnimalRetreatApp {

	public static void main(String[] args) {
		AnimalRetreatApp app = new AnimalRetreatApp();
		app.run();

	}

	public void run() {
		
		Scanner kbinput = new Scanner(System.in);
		String selection = "0";
		
		AnimalRetreat retreat = new AnimalRetreat("Fred the Attendant");
		
	    boolean moreAnimals = true;
	    int totalAnimals = 0;
	    int whichAnmial = 1;
	    
	    while (moreAnimals) {
	      System.out.println();
	      System.out.println();
	      System.out.println();
	      System.out.printf("\t\tWelcome to the Animal Sanctuary\n\n");
	      System.out.println();
	      System.out.printf("\t\tPlease select an option from the menu below:\n");
	      System.out.println();
	      System.out.printf("\t\t1. List all animals in rooms\n");
	      System.out.printf("\t\t2. Add an animal\n");
	      System.out.printf("\t\t3. Start attendant rounds\n");
	      System.out.printf("\t\t4. Close the inn for the night, say goodbye\n");
	      System.out.printf("\t\tSelection:" );
	      selection = kbinput.nextLine();
	      
	      switch (selection) {
	      case "1" :
	    	  System.out.println("List all the animals");
	    	  break;
	      case "2": 
	    	  System.out.println("Add an animal");
//check the rooms for an opening - get room number total number of rooms
	    	  
//get the animal name and create a room, can I create a variable
// put two together roomNum = 
	    	  
//	    	  AnimalRoom 
	    	
	    	  Giraffe giffe = new Giraffe("George");
	    	  
	    	  break;
	      case "3": 
	    	  System.out.println("start atttending rounds");
	    	  break;
	      case "4":
	    	  System.out.println("Close inn for the night");
	    	  moreAnimals = false;
	    	  break;
	      default:
	          System.out.println("cant make up your mind? Good Night!");
	          moreAnimals = false;
	    	  break;
	      }  //end switch

	    } // end while
	    
//		System.out.println(AnimalRetreat.attendant);
		
//		Giraffe giffe = new Giraffe("George");
//		System.out.println(giffe.getName());
		
//		System.out.println(giffe.getNoise());
		
//		AnimalRoom suite = new AnimalRoom(0);
	    
		// close scanner
		
	    kbinput.close();	
	
	} //end public void run

} //end public class AnimalRetreat
