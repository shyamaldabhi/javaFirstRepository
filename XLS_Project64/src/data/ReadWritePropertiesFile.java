package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream f = new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		System.out.println(prop.getProperty("browser"));
		
		String correctEmail = prop.getProperty("correctEmail");
		System.out.println(correctEmail);
		System.out.println(prop.getProperty("correctEmail"));
		System.out.println(prop.getProperty("incorrectemail"));
		System.out.println(prop.getProperty("url"));
		
		prop.setProperty("testing", "automation");
		System.out.println(prop.getProperty("testing"));
		
		prop.setProperty("tool", "selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("C:\\\\Users\\\\Dharmik Prajapati\\\\Downloads\\\\eclipse\\\\Testing\\\\prop.properties");
		prop.store(fo, "Adding to Properties file");

	}

}
