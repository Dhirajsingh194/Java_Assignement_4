package assignement4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		//Java, Selenium, TestNG, Git, Github
		l1.add("Java");
		l1.add("Selenium");
		l1.add("TestNG");
		l1.add("Git");
		l1.add("Github");
		
		System.out.println("Original list:"+l1);
		
			Collections.reverse(l1);
			System.out.println("Reverse of List:"+l1);

	}

}
