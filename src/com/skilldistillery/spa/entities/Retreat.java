package com.skilldistillery.spa.entities;

import java.util.Arrays;

public class Retreat {
	private Room[] rooms; // An array of rooms, rooms are not strings, they have characteristics

	public Retreat() {
	} // public no arg constructor

	public Retreat(Room[] rooms) {
		this.rooms = rooms;

	}

//Generate the getters and setters
	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
//Generate the hash code equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(rooms);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retreat other = (Retreat) obj;
		return Arrays.equals(rooms, other.rooms);
	}
	
//Generate the toString
	@Override
	public String toString() {
		return "Retreat [rooms=" + Arrays.toString(rooms) + "]";
	}

}
