package com.assignDay2.prg3;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person> persons=new TreeSet<Person>();
		Person per1=new Person("Akshitha","Rk puram","1239214900");
		Person per2=new Person("Amar","Ts","1233455667");
		Person per4=new Person("xyz","Mum","1233455337");
		Person per3=new Person("hmm","Hell","1233455667");
		Person per5=new Person("fcc","siddipet","1238784667");
		Person per6=new Person("Follow","hcl","1234455667");
		Person per7=new Person("Zombie","ecil","194005667");
		persons.add(per1);
		persons.add(per2);
		persons.add(per3);
		persons.add(per4);
		persons.add(per5);
		persons.add(per6);
		persons.add(per7);
		TelephoneDirectory TD=new TelephoneDirectory();
		TD.setDirectory(persons);
		TD.display();

	}

}
