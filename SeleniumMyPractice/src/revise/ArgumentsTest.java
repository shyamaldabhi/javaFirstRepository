package revise;

public class ArgumentsTest {

	public static void main(String[] args) {

		sum();
		sum(6,7);
		sum(10,11);
		sum(20,30);
		sum(4,5);
		sum(1,2,5);
		sum("Hello",5);
	}
	
	public static void sum() {
		int a =4+5;
		System.out.println(a);
		
	}
	public static void sum(int b, int c) {
		int a =b+c;
		System.out.println(a);
		
 }
	public static void sum(int b, int c, int d) {
		int a =b+c+d;
		System.out.println(a);
	}
		
		public static void sum(String b, int c) {
		System.out.println(b);
		System.out.println(c);
}
}
