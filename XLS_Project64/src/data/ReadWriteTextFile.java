package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		
		// Create new File
		File f = new File("C:\\testing\\temp.txt");  // provide path of where you want ot create file
		f.createNewFile();  
		
		// Write in to text file
		FileWriter w = new FileWriter(f);  // using this we can not write inside file .. This can access file 
		BufferedWriter out = new BufferedWriter(w);  // This is writer class .. which can write in to  your file 
		
		out.write("This is 1st Line");
		out.newLine();
		out.write("This is 2nd Line");
		out.newLine();
		out.write("This is 3rd line");
		out.newLine();
		out.write("This is 4rd line");
		out.newLine();
		out.write("This is 5rd line");
		out.newLine();
		out.flush();
		
		// Read Text File
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);  // This is reader class .. which can read in to your file
		
	/*	System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		System.out.println(rd.readLine());
		*/
		
		String x;
		int i = 0;
		while((x = rd.readLine()) != null) {
			System.out.println(x);
			i++;
		}
		
		System.out.println("number of line: "+ i);

		

	}

}
