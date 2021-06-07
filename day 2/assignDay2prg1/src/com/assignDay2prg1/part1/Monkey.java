package com.assignDay2prg1.part1;
public class Monkey extends Animal{

	public Monkey(String color, int weight, int age) {
		super(color, weight, age);
	}

	@Override
	public boolean isVegetarian() {
		return true;
	}

	@Override
	public boolean canClimb() {
		return true;
	}

	@Override
	public void sound() {
		System.out.println("Monkeys Screech");
		
	}
	
}
