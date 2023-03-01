package tests;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testing = "Automation";
		System.out.println(testing);
		
		String tool = "Selenium";
		System.out.println(tool);
		
		// "  " = break between two word
		String s = "  ";
		System.out.println(testing+tool);
		System.out.println(testing+"  "+tool);
		System.out.println(testing+s+tool);
		
		// a+b in front will be counted as an arithmetic progession
		// (a+b) is in bracket so first the string will do maths first and then remaining
		int a = 10;
		int b = 20;
		System.out.println(testing+tool+a+b);
		System.out.println(a+b+testing+tool);
		System.out.println(testing+tool+(a+b));

		

	}

}
