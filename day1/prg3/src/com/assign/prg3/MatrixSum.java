package com.assign.prg3;

public class MatrixSum {

	private int rows,cols,sum=0;

	public int getSum() {
		calculate();
		return sum;
	}

	public MatrixSum() {
		rows=3;
		cols=3;
		
	}
	
	 private int m1[][]={{1,2,3},{4,5,6},{7,8,9}};
	 private int m2[][]={{1,2,3},{4,5,6},{7,8,9}};
	
	 public void calculate()
	 {
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 sum=sum+m1[i][j]+m2[i][j];
			 }
		 }
		 
	 }
	
	
	
}
