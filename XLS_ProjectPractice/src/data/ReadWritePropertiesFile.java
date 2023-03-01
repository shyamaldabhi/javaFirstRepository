package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {

		//read
		
		FileInputStream f =new FileInputStream("C:\\testing\\proprac.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("correctEmail"));
		
		prop.setProperty("testing","automation");
		System.out.println(prop.getProperty("testing"));
		
		FileOutputStream fo = new FileOutputStream("C:\\testing\\proprac.properties");
		prop.store(	fo, "Adding to properties File");
	}

}
