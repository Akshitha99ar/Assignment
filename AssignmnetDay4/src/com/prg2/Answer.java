package com.prg2;

public class Answer {

	public static void main(String args[])
	{
		Question ques=new Question();
		Thread QandA=new Thread(ques);
		QandA.start();
	}
}
