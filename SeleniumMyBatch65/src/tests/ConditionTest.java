package tests;

public class ConditionTest {

	public static void main(String[] args) {

		String expected = "Hello Selenium";
		String actual = "Hello Selenium";
		
		/*if(condition) {
		 
		 }else {
		 
		 
		 }*/
		
		if(actual.equals(expected)) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Not equal");
		}
		
	//i==j - In this double equal are conditional operators. When we compare number we us "=="
		int i = 10;
		int j = 20;
		if(i==j) {
			System.out.println("equal");
		}else {
			System.out.println("Not equal");
		}
		}

}
