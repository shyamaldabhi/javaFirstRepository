package tests;

public class Test2 {
/*Static- no object
 -class name Static  - No Object
  - className.methodName();
  - methodName(); // when calling in the same class

Non-Static Method  - Through Object
   - objName.methodName

 */
	public static void red() {
		System.out.println("red");
	}
	
	public void blue() {
		System.out.println("blue");
	}

	//Name same as class name
	// no return type
	public Test2() {
		System.out.println("i`m in constructor");
	}
}