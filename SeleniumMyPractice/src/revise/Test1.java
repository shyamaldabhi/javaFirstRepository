package revise;

import seleniumprac.Test4;

public class Test1 {
	static Test1 t1 = new Test1();
	static Test2 t2 = new Test2();
	static Test3 t3 = new Test3();
	static Test4 t4 = new Test4();
	public static void main(String[] args) {

		System.out.println("I`m in main method");
		scanMe();
		printMe();
		System.out.println("After printMe");
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
	}
	
	public void testMe() {
		System.out.println("testMe");
	}
	public void paintMe() {
		System.out.println("paintMe");
	}
}

