package prg2;

public class Student {
	
	private int RollNo,MarksInEng,MarksInMaths,MarksInScience;
	String name;
	
	
	
	public Student(int rollNo, int marksInEng, int marksInMaths, int marksInScience, String name) {
		
		RollNo = rollNo;
		MarksInEng = marksInEng;
		MarksInMaths = marksInMaths;
		MarksInScience = marksInScience;
		this.name = name;
	}
	
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getMarksInEng() {
		return MarksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return MarksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
