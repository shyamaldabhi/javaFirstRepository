package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("C:\\testing\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 3));
		String correctEmail = d.getCellData("Data1", 1, 2);
		System.out.println(correctEmail);
		
		String browser = d.getCellData("Data1", "Browser", 2);
		System.out.println(browser);
		
		System.out.println(d.getRowCount("Data1"));
		System.out.println(d.getColumnCount("Data1"));
		
		d.setCellData("Data1", "Name", 11, "testing11");
		System.out.println(d.getCellData("Data1", "Name", 12));
		System.out.println(d.getRowCount("Data1"));
		
		d.addColumn("Data1", "Nikul");
		System.out.println(d.getColumnCount("Data1"));
	}

}
