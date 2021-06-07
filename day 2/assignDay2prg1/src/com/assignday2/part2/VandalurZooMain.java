package com.assignday2.part2;
import java.util.*;

import com.assignDay2prg1.part1.Animal;
import com.assignDay2prg1.part1.Elephant;
import com.assignDay2prg1.part1.Lion;
import com.assignDay2prg1.part1.Monkey;
import com.assignDay2prg1.part1.Tiger;

public class VandalurZooMain {

	public static void main(String[] args) {
		
		List<Animal> animalsList=new ArrayList<Animal>();
		Animal lion1=new Lion("Yellow",120,12);
		Animal lion2=new Lion("golden",130,11);
		Animal tiger1=new Tiger("golden with blackspots",190,17);
		Animal tiger2=new Tiger("golden with blackmarks",160,15);
		Animal monkey1=new Monkey("light brown",30,22);
		Animal monkey2=new Monkey("white",45,28);
		Animal elephant1=new Elephant("Grey",500,35);
		Animal elephant2=new Elephant("Dark Grey",300,13);
		animalsList.add(lion1);
		animalsList.add(lion2);
		animalsList.add(tiger1);
		animalsList.add(tiger2);
		animalsList.add(monkey1);
		animalsList.add(monkey2);
		animalsList.add(elephant1);
		animalsList.add(elephant2);
		
		VandalurZoo zoo=new VandalurZoo();
		zoo.setAnimalsInZoo(animalsList);
		zoo.displayCharacteristicsOfAnimals();
	}

}