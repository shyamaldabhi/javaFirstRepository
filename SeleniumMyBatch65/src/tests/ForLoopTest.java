package tests;

public class ForLoopTest {

	public static void main(String[] args) {

		/*System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);*/
		
		
		// in for = 3 condition- initialization - from where you want to start, conditon and increement
		for(int i = 1; i<11 ; i++) {
			System.out.println(i);
			if(i==5) {
				System.out.println("we have 5");
				break;
			}
			}

		System.out.println("******************************");
		
		//10,9,8,7,6,5,4,3,2,1,
		for(int j=10; j>=1; j--) {
			System.out.println(j);
			if(j==5) {
			System.out.println("Got5");
		}
}
}}