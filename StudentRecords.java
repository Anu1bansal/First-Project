package org.anu;

public class StudentRecords {
	String fName = " ";
	String mName = " ";
	String lName = " ";
	String sub1 = " ";
	String sub2 = " ";
	String sub3 = " ";
	String fullName= " ";
	public String  stu(String fName, String lName) {

		return fName.concat(lName);

	} 

	public String stu(String fName,String mName, String lName ) {
		fullName = fName + " " + mName +" " + lName;

		return fullName;
	}

	public void stu(String sub1, String sub2,String sub3, String sub4) {
	}
	public void stu(String sub1,String sub2, String sub3,  String sub4, String sub5) {

	}

}