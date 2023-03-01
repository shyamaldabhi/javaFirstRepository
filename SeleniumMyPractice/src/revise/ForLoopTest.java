package revise;

public class ForLoopTest {

	public static void main(String[] args) {

		for(int i = 1; i<11 ; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("we have 5");
				break;
			}
			}
		System.out.println("After for loop");
		}
}
