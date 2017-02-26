package com.softgroup.java;

import java.util.Observable;

public class Room extends Observable{
	
	public int doctorCount;
	public int visitorCount;
	
	public int getDoctorCount() {
		return doctorCount;
	}
	
	public int getVisitorCount() {
		return visitorCount;
	}
	
	public synchronized void notifyDisplay() {
		setChanged();
		notifyObservers();
	}

}
