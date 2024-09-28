package com.skilldistillery.spa.entities;

public class AnimalRoom {
	private String rooms[] = new String[9];
	private String occupant[] = new String[9];
	
	public AnimalRoom(int roomnum) {
	
	System.out.println("this is room" + rooms[roomnum]);
	
  }

	public int[] getRooms() {
		return rooms;
	}

	public void setRooms(int[] rooms) {
		this.rooms = rooms;
	}

	public String[] getOccupant() {
		return occupant;
	}

	public void setOccupant(String[] occupant) {
		this.occupant = occupant;
	}

}
