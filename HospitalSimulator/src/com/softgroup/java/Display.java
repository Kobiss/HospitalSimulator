package com.softgroup.java;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer{
	
	private Room room;
	private int testVar = 0;

	public Display(Room room) {
		this.room = room;
		room.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		synchronized (room) {
			System.out.println("Doctors: " + room.getDoctorCount() + " | Visitors: " + room.getVisitorCount());
		}	
	}
}
