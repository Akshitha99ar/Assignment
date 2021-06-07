package com.prg3;

public class Main {
	public static void main(String args[])
	{
		for(int i=1;i<=60;i++)
		{
			Clock c1=new Clock();
			Thread a1=new Thread(c1,Integer.toString(i));
			a1.start();
//If the join() method is called on a thread instance, 
			//the currently running thread will block until the thread instance has finished executing.
			try {
				a1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
