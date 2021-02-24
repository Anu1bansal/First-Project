package org.anu;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] days = new String[]{"Sunday","Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
	System.out.println(days.length);
	System.out.println(days[2]);
	if (days.length<3)
	{
	System.out.println(days[2]);	
	}
	for (int day=0; day<6; day++) {
		System.out.println(days[day]);
	}
	}

}
