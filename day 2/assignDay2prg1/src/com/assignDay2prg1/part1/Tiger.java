package com.assignDay2prg1.part1;

public class Tiger extends Animal{

	public Tiger(String color, int weight, int age) {
		super(color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return true;
	}

	@Override
	public void sound() {
		System.out.println("tiger growls");
	}

}
