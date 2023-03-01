package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		//ClassName ObjName = New ClassName();
		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("Selenium");
		tools.add("Java");
		tools.add("TestLink");
		tools.add("TestRail");
		
		System.out.println(tools.size());//4
		
		System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		
		tools.add("Junit");
		System.out.println(tools.size()); //5
		
		tools.remove(2); //TestLink
		System.out.println(tools.size()); //4
		System.out.println(tools.get(2)); //TestRail
		System.out.println(tools.get(3));
		
		//for loop
		System.out.println("------------------------------"); 
		/*for(int i = 0;i<tools.size();i++) {
			System.out.println(tools.get(i));                             THIS ONE IS STANDARD FORMAT
	}*/
		for(String s : tools) {
			System.out.println(s);                                      // THIS ONE IS ADVANCE FORMAT
		}
	}
	}

