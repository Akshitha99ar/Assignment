package com.prg1;

class First implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("|"+Thread.currentThread().getId()+"  |"+Thread.currentThread().getName()+"  |"+Thread.currentThread().isAlive()+"  |"+Thread.currentThread().getState()+"  |"+Thread.currentThread().getPriority()+"  |");
	}
	
}
public class Display {
	public static void main(String args[])
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("------------------------------------------");
		
		for(int j=0;j<4;j++)
		{
			First f1=new First();
			Thread t=new Thread(f1);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("------------------------------------------");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
