package com.assignDay2prg1.part1;

public class Elephant extends Animal{

	public Elephant(String color, int weight, int age) {
		super(color, weight, age);
	}

	public boolean isVegetarian() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return false;
	}

	@Override
	public void sound() {
		System.out.println("Elephant roars");
	}

}
