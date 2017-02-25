package com.softgroup.java;

public class Room{
	
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
		System.out.println("Doctors: "+doctorCount+" | Visitors: "+visitorCount);
	}

}
