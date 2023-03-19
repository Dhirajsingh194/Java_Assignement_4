package assignement4;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		// Input – 10,45, 90,45, 23, 90, 44
		//Output – 45,90

		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(45);
		a1.add(90);
		a1.add(45);
		a1.add(23);
		a1.add(90);
		a1.add(44);
		
		System.out.println("Input-"+a1);
		
		System.out.println("Output-"+a1.get(1) + ","+ a1.get(a1.size()-2));		
	}
}
