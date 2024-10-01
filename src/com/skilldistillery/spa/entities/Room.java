package com.skilldistillery.spa.entities;

import java.util.Objects;

public class Room {   
	private int creatureSize; //How big is the animal asking to stay here
	private int roomCapacity; //How large can an animal can be in this room
	
	public Room() {} //The no arg constructor

	// Constructors, getters, setters, hash, to string
	
	public Room(int creatureSize, int roomCapacity) {  //Generated constructors
		super();
		this.creatureSize = creatureSize;
		this.roomCapacity = roomCapacity;
	}

	// So the outside world can see and data remains private
	
	public int getCreatureSize() {
		return creatureSize;
	}

	public void setCreatureSize(int creatureSize) {
		this.creatureSize = creatureSize;
	}

	public int getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	//Really just for debugging purposes
	@Override
	public String toString() {
		return "Room [creatureSize=" + creatureSize + ", roomCapacity=" + roomCapacity + "]";
	}

	//Must generate a hash code equals
	@Override
	public int hashCode() {
		return Objects.hash(creatureSize, roomCapacity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return creatureSize == other.creatureSize && roomCapacity == other.roomCapacity;
	}
	
}
	