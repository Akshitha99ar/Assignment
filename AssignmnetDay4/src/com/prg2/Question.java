package com.prg2;

import java.util.Scanner;

/*Write a program that picks up a question from an array containing 10 elements and displays the question. 
It then waits 30 seconds for the user to answer.
If user answers it correctly, then it moves to the next question,  otherwise it terminates the program*/



public class Question implements Runnable{

	String questions[]= {"What is your name?","What is your age?","Which school?","Where do you stay?","Which State?","Which city?","Which street?","Road no?","Appartment?","pincode?","Flat no?"};
	String answers[]= {"Akshitha","21","Little Flower","Hyderbad","Telangana","Rk Puram","5","Manik Nilayam","500035","F4"};
	static int j=0;
	public boolean answer()
	{
		boolean t=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the answer");
		String ans=sc.nextLine();
		
			if(!(answers[j].equals(ans)))
			{
				t=false;
				return false;
			}
			else
			{
				j++;
			}
	
		return true;
		
	}
	static int i=0;
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		boolean tf;
		while(true) {
		System.out.println(questions[i]);
		i++;
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
			tf= answer();
			if(tf==false)
			{
				System.out.println("wrong answer!!");
				break;
			}
		
			
		}
		
		
	}
	
}
