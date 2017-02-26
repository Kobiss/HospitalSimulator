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

	public void incDoctorCount(int i) {
		this.doctorCount=+i;
	}
	
	public void incVisitorCount(int i) {
		this.visitorCount=+i;
	}
	
	public synchronized void notifyDisplay() {
		setChanged();
		notifyObservers();
	}

}
