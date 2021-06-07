package com.assignDay2.prg3;

import java.util.Set;
import java.util.TreeSet;

public class TelephoneDirectory {
private Set<Person> directory=new TreeSet<Person>();
	
	public void setDirectory(Set<Person> directory) {
		this.directory = directory;
	}

	public void display() {
		System.out.println("Telephone Directory:");
		for(Person person:directory) {
			System.out.println(person.toString());
		}
	}

}
