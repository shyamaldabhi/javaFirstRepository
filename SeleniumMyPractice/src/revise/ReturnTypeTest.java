package revise;

public class ReturnTypeTest {

	public static void main(String[] args) {

		int x = sum();
		System.out.println(x);
		System.out.println(sum());
		String y = hello();
		System.out.println(y);
	}
	public static int sum() {
		int a = 4+5;
		return a;
	}
	public static String hello() {
		String s ="hello java";
		return s;
	}
}
