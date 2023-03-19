package assignement4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		//Java, TestNG, Maven, Java, 
		l1.add("Java");
		l1.add("TestNG");
		l1.add("Maven");
		l1.add("Java");
		
		//print the input list as a comma-separated string without the enclosing square brackets
		String output = String.join(", ", l1);
		System.out.println("Input-"+output);
		
		//Convert Arraylist into hashset to remove duplicate element
		 HashSet<String> hashSet = new HashSet<>(l1);
		 
		 String output1 = String.join(", ", hashSet);
		 System.out.println("Output-"+output1);
	}

}
