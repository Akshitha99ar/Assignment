package com.prg5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hen eggs=new Hen();
		Thread owner=new Thread(eggs);
		owner.start();
	}

}
