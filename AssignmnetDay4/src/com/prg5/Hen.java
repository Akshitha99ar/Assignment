package com.prg5;

public class Hen implements Runnable{

	static int count=1;
	static int sum=0;
	 public void LaidEggs()
	{
		System.out.println("Hen Laid the Egg- "+count);
		count++;
	}
	 public void gain()
	{
		sum=sum+2;
		System.out.println("Owner gained Rs "+sum);
	}
	
public void run() {
		
		while(sum!=100)
		{
			LaidEggs();
			gain();
		}
		
	}
}
