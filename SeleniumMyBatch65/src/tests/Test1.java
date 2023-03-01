package tests;

import selenium.Test4;

public class Test1 {
	//we need main method to run the class
	//Java execute only main method
	//create object of the class 
	//className ibjName = New ClassName();
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();

	public static void main(String[] args) {
//printMe is written first but the code will only run what is written in main class
		//Test t1 = new Test1();
		System.out.println("i`m in main method");
		scanMe();
		printMe();
		System.out.println("after printMe");
		t1.testMe();
		t1.paintMe();
		Test2.red();
		t2.blue();
		Test3.circle();
		t3.square();
		Test4.bmw();
		t4.audi();
		
	}
	
	public static void printMe() {
		System.out.println("printMe");
		
	}
		public static void scanMe() {
			System.out.println("scanMe");
				//t1.testMe();	
	}	
		public void testMe() {
			System.out.println("testMe");
	}
		public void paintMe() {
			System.out.println("paintMe");
}
}