package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {

		Xls_Reader d = new Xls_Reader("C:\\testing\\ShyamalTest.xlsx");
		
		System.out.println(d.getCellData("Data1","Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 3);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getColumnCount("Data1"));
		System.out.println(d.getRowCount("Data1"));
		
		d.setCellData("Data1", "Name", 10, "Addword");
		
		System.out.println(d.getCellData("Data1", "Name", 10));
		System.out.println(d.getRowCount("Data1"));
		
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1"));
		
		
	}

}
