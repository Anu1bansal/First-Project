package org.anu;

public class MixDemoMain {
	public static void main(String args[]) {
		Mixdemo s= new Mixdemo( "anu", "bansal");
		s.fullName("John","Doe");
		System.out.println("My name is  " +s.fullName("John","Doe") );		
		String stuName = "Aditi Bansal";
		String grade = "A+ ";
		int marks = 99;
		s.stuDetails("Aditi Bansal", "A+", 99);
		System.out.println(s.stuDetails(stuName, grade,  marks));

		int[] arr = new int[] {93,87,67,100,99,97};
	
	s.array(arr);
	System.out.println("maximum number is " +s.array(arr));
	
	
	
	Mixdemo.getCountry();
	Mixdemo.getSum(20,54);
	System.out.println("Sum of x and y is : " +Mixdemo.getSum(20,54));
	}
}
