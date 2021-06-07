package com.prg4;


public class Vehicle implements Runnable
{
	Simulate s=new Simulate();
	
	Vehicle(Simulate s)
	{
		this.s=s;
	}

	@Override
	public void run() {
		
		for(int i=1;i<=5;i++)
		{
			s.displayBridge(i);
			s.displayToll(i);
		}
		
	}
		
		
	
		

	
}
