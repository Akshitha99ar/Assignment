package com.prg4;

public class MainSim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle(new Simulate());
		Thread t1=new Thread(vehicle);
		t1.start();
	}

}
