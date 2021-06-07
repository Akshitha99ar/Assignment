package prg2;

public class Standard {

	Student info[]=new Student[8];
	String name[]= {"aks","bbc","cnn","dff","ell","fcc","gtl","hmt"};
	int engg[]= {12,34,33,65,22,1,45,76};
	int math[]={13,13,34,65,23,100,45,76};
	int sci[]={55,32,43,35,12,1,5,46};
	
	int j=1,index1,index2;
{
	for(int i=0;i<8;i++)
	{
		info[i]=new Student(j,engg[i],math[i],sci[i],name[i]);
		j++;
	}
}

public void displayAsce()
{
	System.out.println("==========Displaying in Ascending order=========");
	for(int i=0;i<8;i++)
	{
		
		System.out.println("RollNo: "+info[i].getRollNo()+" Name: "+info[i].getName());
		
	}
	System.out.println("================================================");
}
public void displayHigh()
{
	int max=Integer.MIN_VALUE;
	for(int i=0;i<8;i++)
	{
		int temp=info[i].getMarksInEng()+info[i].getMarksInMaths()+info[i].getMarksInScience();
		if(temp>max)
		{
			max=temp;
			index1=i;
		}
	}
	System.out.println("Highest Percentage--> RollNo:"+info[index1].getRollNo()+" Name:"+info[index1].getName());
}
public void highMath()
{
	int max=Integer.MIN_VALUE;
	for(int i=0;i<8;i++)
	{
		int temp=info[i].getMarksInMaths();
		if(temp>max)
		{
			max=temp;
			index2=i;
		}
	}
	System.out.println("Highest Marks in maths--> RollNo:"+info[index2].getRollNo()+" Name:"+info[index2].getName());
}
}
