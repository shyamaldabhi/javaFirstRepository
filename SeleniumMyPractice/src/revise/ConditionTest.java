package revise;

public class ConditionTest {

	public static void main(String[] args) {

		String expected= "Hello Selenium";
		String actual= "Hello Selenium";
		
		if(expected.equals(actual)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		int i = 10;
		int j = 20;
		if(i==j) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}

}
