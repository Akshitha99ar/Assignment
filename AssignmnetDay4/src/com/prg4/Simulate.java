package com.prg4;

public class Simulate {

	/*
	 * private int i;
	 * 
	 * public int getI() { return i; }
	 * 
	 * public void setI(int i) { this.i = i; }
	 */
	boolean flag=true;
	synchronized public void displayBridge(int i)
	{
		if(flag==false)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle "+i+" Crossed Birdge");
		flag=false;
		notify();
	}
	
	synchronized public void displayToll(int i)
	{
		if(flag==true)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Vehicle "+i+" Crossed Toll");
		flag=true;
		notify();
	}
	
	
}
