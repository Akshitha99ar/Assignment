package com.assign.prg1;

public class Calculate {
	
	private int eggs,gross,dozen,left;

	public void setEggs(int eggs) {
		this.eggs = eggs;
	}
	
	public int getGross() {
		calGross();
		return gross;
	}

	public int getDozen() {
		calDozen();
		return dozen;
	}

	public int getLeft() {
		return eggs;
	}
	
	public void calGross()
	{
		gross=eggs/144;
		eggs=eggs-(144*gross);
		
	}
	public void calDozen()
	{
		dozen=eggs/12;
		eggs=eggs-(12*dozen);
		
	}
	
	

}
