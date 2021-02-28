package org.anu;

public class StudentRecordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRecords  s  = new StudentRecords ();
		s.stu("Anu", "Bansal");
		System.out.println(s.stu("Anu", "Bansal"));	
		s.stu("Maths","French", "Chemistry","Social Studies");	
		System.out.println("This is overloaded method");
		System.out.println("This student doesn't A.P. classes");
		s.stu("John","Smith","Doe");
		System.out.println("This is overloaded method");
		System.out.println("The name of student is " + s.stu("John","Smith","Doe"));
		s.stu("Maths Excel", "A.P. Chemistry", "A.P. French", "A.P.English", "Social Studies");
		System.out.println("This is overloaded method");
		System.out.println("This student has A.P. classes");
	}


}
