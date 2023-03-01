package revise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("TestLink");
		tools.add("TestRail");

		System.out.println(tools.size());
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.add("Junit");
		System.out.println(tools.get(4));
		System.out.println(tools.size());
		
		tools.remove(2);
		System.out.println(tools.size()); 
		System.out.println(tools.get(2)); 
		System.out.println(tools.get(3));
		
		System.out.println("------------------------------"); 
		for(int i = 0;i<tools.size();i++) {
			System.out.println(tools.get(i));
			
		}
		}
	
	}
