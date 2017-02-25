package com.softgroup.java;

public class Doctor extends Human{
	
	private Room room;

	public Doctor(Room room) {
		super(1000);
		this.room = room;
	}

	@Override
	public void enter() throws InterruptedException {
		synchronized (room) {
			while(room.getDoctorCount()>0||room.getVisitorCount()>0){
				room.wait();
			}
			room.doctorCount++;
			room.notifyDisplay();
		}		
	}

	@Override
	public void exit() {
		synchronized (room) {
			room.doctorCount--;		
			room.notify();
			room.notifyDisplay();
		}		
	}

}
