package com.softgroup.java;

import java.util.Random;

public class Main {	

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Start");
		Random r = new Random();
		
		Room room = new Room();
		Display display = new Display(room);
		
		while(true){			
			if(r.nextBoolean()){				
				new Visitor(room).start();
			}
			if(r.nextInt(5)==3){
				new Doctor(room).start();
			}			
			Thread.sleep(200);			
		}
		
		
	}

}
