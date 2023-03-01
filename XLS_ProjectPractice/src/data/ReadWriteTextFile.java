package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {

		//CREATE FILE
		File f = new File("C:\\testing\\practicetemp.txt");
		f.createNewFile();
	
		//WRITE FILE
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("1st line");
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
		
		//READ FILE
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		String x;
		int i =0;
		while((x= rd.readLine()) !=null) {
			System.out.println(x);
			i++;
		}
		System.out.println("Number of Lines: " +i);
	}

}
