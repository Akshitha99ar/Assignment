package com.assign.prg1;

public class EggsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate cal=new Calculate();
		cal.setEggs(1342);
		
		
		System.out.println("Gross: "+cal.getGross());
		System.out.println("Dozen: "+cal.getDozen());
		System.out.println("Left: "+cal.getLeft());

	}

}
