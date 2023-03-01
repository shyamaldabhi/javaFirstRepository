package data;

import utilities.Xls_Reader;

public class DataFile {

	//login
	Xls_Reader d = new Xls_Reader("C:\\testing\\NikulTest.xlsx");
	public String wrongEmail = d.getCellData("Data1","UserName", 3);
	public String wrongPassword = d.getCellData("Data1","Password", 2);
	public String wrongEmailSpecialCharac = d.getCellData("Data1","UserName", 4);
	public String specialCharac = d.getCellData("Data1","Email Error", 5);
	public String emptyEmail = d.getCellData("Data1","Email Error", 4);
	public String emptyPassword = d.getCellData("Data1","Password Error", 3);
	public String globalErr =  d.getCellData("Data1","Global Error", 2);
}
