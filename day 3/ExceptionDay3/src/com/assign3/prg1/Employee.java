package com.assign3.prg1;

import java.util.Arrays;
import java.util.*;

public class Employee {

	private String name;
	private int age;
	{
	al.add("Akshitha");
	al.add("Ranga");
	}
	  static List<String> al=new ArrayList<>();
	  public static void add(String name)
	  {
		  
		  al.add(name);
	  }
	 
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
			if(al.contains(name))
			{
				
				throw new NameException("Wrong");
			}
			add(name);
		}
		
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0||age<18||age>60)
		{
			throw new FirstException(name+" has Invalid Age");
		}
		this.age=age;
	}
	
	
	
}
