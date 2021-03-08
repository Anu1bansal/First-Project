
package org.anu;
import java.util.ArrayList;
public class GenericArrayList {

	public GenericArrayList() {
		nameList.add("Ram");
		nameList.add("Sham");
		nameList.add("Balram");
		nameList.add("Krishna");
		nameList.add("Krish");
		System.out.println("ArrayList before removing object : " + nameList);
		nameList.remove("Krish");
		bufferList.add(sb);
	
		sb.append("");
		sb.append(",");
		sb.append("Radha");
		
	
	
	}
	
	public void addName() {
		
	
		System.out.println("ArrayList after removing object : " + nameList);
		System.out.println(bufferList);
	}
	
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<StringBuffer> bufferList = new ArrayList<StringBuffer>();
	StringBuffer sb = new StringBuffer("Shiva");
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	GenericArrayList gal =  new GenericArrayList();
	gal.addName();

		

	}

}
