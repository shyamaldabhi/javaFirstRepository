package tests;

public class ArrayTest {

	public static void main(String[] args) {

		/*Advantage of Array
		1. multiple value into single variable with a similar data types we can store
		
		Disadvantage of Array
		1. size is fixed  
		2. Static*/
		
		String tool = "Selenium";
		System.out.println(tool);
		
		String tools[] = {"Selenium","Testlink","Testrail","Junit","Testing"};
		System.out.println(tools.length);
		
		for(int i=0;i<tools.length;i++) {
			System.out.println(tools[i]);
		}
	}

}
