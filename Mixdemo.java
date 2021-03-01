package org.anu;

//import java.lang.reflect.Array;

public class Mixdemo {
	String firstName = " ";
	String lastName = "  ";

	public Mixdemo () {

	}
	public Mixdemo (String firstName, String lastname) {

	}
	public String fullName (String firstName, String lastName) {
		this.firstName = firstName;

		this.lastName = lastName;

		return firstName.concat(lastName);
	}

	public String stuDetails(String stuName, String grade, int marks) {


		StringBuffer sb = new StringBuffer(stuName);
		sb.append(" ");
		sb.append("\n");
		sb.append(grade);
		sb.append("\n");
		sb.append(marks);
		return sb.toString();

	}






	public void getName() {
		System.out.println("My full name is " + firstName + " "  + lastName );
	}
	public int array(int[]a) {

		int maxNum = a[0];

		int i;

		for(i=0; i<a.length; i++) {
			if (a[i]>maxNum) {
				maxNum = a[i];

			}

		}
		return maxNum;
	}
	public static void  getCountry() {
		System.out.println("My country is India");
	}

	public static int getSum(int x, int y) {
		return x+y;
	}

}




