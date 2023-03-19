package assignement4;

import java.util.ArrayList;

public class Task5 {

	public static void main(String[] args) {
		//           List 1- 11,22,33
		   // List 2-  9,19,29	
		   // List 3-  7,17,27
		
		//First List
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(11);
		a1.add(22);
		a1.add(33);
		System.out.println("List 1-"+a1);
		
		//Second List
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(9);
		a2.add(19);
		a2.add(29);
		System.out.println("List 2-"+a2);
		
		//Third List
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(7);
		a3.add(17);
		a3.add(27);
		System.out.println("List 3-"+a3);
		
		//another list as an element
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.addAll(a1);
		a4.addAll(a2);
		a4.addAll(a3);
		
		System.out.println("Combined List-"+a4);
		

	}

}
