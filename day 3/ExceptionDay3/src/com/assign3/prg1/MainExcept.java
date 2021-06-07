package com.assign3.prg1;

import java.util.Scanner;

public class MainExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of the employee:");
		String name=sc.next();
		System.out.println("Enter age of the employee:");
		int age=sc.nextInt();
		
		Employee e=new Employee(name,age);
		e.setName(name);
		System.out.println("Entered name to the Listt!!!!");
		
		e.setAge(age);
		System.out.println("Eligible Employee!!!!");
		
		}
		catch(FirstException e)
		{
			System.out.println("Not eligible employee!!!!");
		}
		catch(NameException e)
		{
			System.out.println("Already Exsiting employee!!!!");
		}
	}

}
