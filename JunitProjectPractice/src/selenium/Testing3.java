package selenium;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;


public class Testing3 {

	@Rule
	public ErrorCollector err =new ErrorCollector();
	@Test
	public void test6() {

		String actual = "abc";
		String expected = "abc";
		System.out.println("Before 1st assert");
		Assert.assertEquals(expected,actual);
		System.out.println("After 1 st assert");
		Assert.assertTrue("Verify 4>3", 4>3);
		System.out.println("After 2nd assert");
	}
	
	@Test
	public void test7() {

		String actual = "abc";
		String expected = "abc";
		System.out.println("Before 1st assert");
		try {
		Assert.assertEquals(expected,actual);
		}catch (Throwable t) {
			err.addError(t);
			System.out.println("I`m in catch 1");
		}
		System.out.println("After 1st assert");
		try {
		Assert.assertTrue("Verify 4>3", 4>3);
		}catch(Throwable t){
			err.addError(t);
			System.out.println("I`m in catch 2");
		}
		System.out.println("After 2nd assert");

}
}
