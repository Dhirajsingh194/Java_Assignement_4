package assignement4;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

	private static String[] strings;

	public static void main(String[] args) {
		// Git, Github, GitLab,GitBash, Selenium, Java, Maven
		List<String> l1=new ArrayList<String>();
		l1.add("Git");
		l1.add("Github");
		l1.add("GitLab");
		l1.add("GitBash");
		l1.add("Selenium");
		l1.add("Java");
		l1.add("Maven");
		
		//print the input list as a comma-separated string without the enclosing square brackets
		String output = String.join(", ", l1);
		System.out.println("input-"+output);
		
		//List of string of which will have only values which starts with git
		String keyword="Git";
		System.out.print("Output-");
		for (String item : l1) {

		    if (item.contains(keyword)) {
		       // System.out.print(keyword + " Output :" + item);
		    	
		    	System.out.print(item + ", ");
		    }
		}
	}

}
