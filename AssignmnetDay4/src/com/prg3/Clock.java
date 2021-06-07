package com.prg3;

public class Clock implements Runnable {
	
	 public static void Tick()
	{
		System.out.print("Tick "+Thread.currentThread().getName());
	}
	 public static void Tack()
	{
		System.out.print(" Tack "+Thread.currentThread().getName());
	}
	 public static void Tock()
	{
		System.out.print(" Tock "+Thread.currentThread().getName());
		System.out.println();
	}
	
	public void run()
	{
		
			Tick();
			Tack();
			Tock();
		
		
		
	}
}
