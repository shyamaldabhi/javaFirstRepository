package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {

		//add log4j.jar to the project - to build path
		//copy log4j.propertie directly inside the src folder
		//create the object of logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello"); //System.out.println("hello");
		//System.out.println("hello");
		print.debug("we are writing in log file");
		print.debug("starting the test case - xyz test");
		print.debug("starting the test case - xyz test");
		print.debug("starting the test case - xyz1 test");

	}

}
