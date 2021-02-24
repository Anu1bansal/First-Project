package org.anu;

public class SecondMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myname();
		addition (3,4);
		equal(3,4);
		name1("Sachin");
System.out.println  ( " My favourite player is "  +name1("Sachin"));
		System.out.println("addition of x and y  is "  + addition(3,4));
		System.out.println( " x and value are equal "  + equal(3,4));
	}
	public static void Myname() {
		System.out.println("My name is Anu Bansal ");
	}
	public static int addition (int x,int y) {
		return (x+y);
	}
	public static boolean equal(int x , int y) {
		if(x ==y) {
			return true;
		}
		else {
			return false;
		}
	}
	public static String name1(String s1)
		{
			return s1;

		}
	
}