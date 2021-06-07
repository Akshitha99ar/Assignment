package com.assignDay2prg1.part1;

public class Lion extends Animal{

	public Lion(String color, int weight, int age) {
		super(color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return false;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println("Lion roars");
		
	}

}
