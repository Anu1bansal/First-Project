package org.anu;

public class MethodStatic {
	public static void main(String arg[]) {
		System.out.println(MethodStatic.getSum(7, 6));
		MethodStatic.Name();
		System.out.println(MethodStatic.getstatus()[1]); 

	}

	public static  int getSum(int x, int y) {
		return x+y;

	}

	public static  void Name() {
		System.out.println("My name is Anu");
	}
	public static String[] getstatus() {
		String[] defects =	new String[]{"Open", "Closed"};
		System.out.println("My array is =  "+defects[0]);
		return  defects ;
	}
}

