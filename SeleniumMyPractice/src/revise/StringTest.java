package revise;

public class StringTest {

	public static void main(String[] args) {
		
		String testing = "Automation";
		System.out.println(testing);
		
		String tool = "Selenium";
		System.out.println(tool);
		
		String s = "  ";
		System.out.println(testing+tool);
		System.out.println(testing+"  "+tool);
		System.out.println(testing+s+tool);
		
		int a = 10;
		int b = 30;
		System.out.println(testing+tool+a+b);
		System.out.println(a+b+testing+tool);
		System.out.println(testing+tool+(a+b));
	}

}
