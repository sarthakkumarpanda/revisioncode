package readingDataFromExcelSheet;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelCode {

	// Create an Excel sheet which has the data
	// Copy the Excel sheet under this package
	// If you edit the Excel sheet, it will make no difference to the Excel sheet
	// copied here
	public static XSSFWorkbook workbook;
	public static FileInputStream ip;
	public static XSSFSheet sheet;
	
	@DataProvider(name = "RediffDataExcelSheet")
	public static Object[][] getRediffExcelData() throws Exception{
		Object[][] data = ExcelCode.readDataFromExcelRediff("Login");
		return data;
	}
	
	
	@DataProvider(name = "TutorialsNinjaDataExcelSheet")
	public static Object[][] readDataFromExcelTutorialsNinja() throws Exception{
		Object[][] data = ExcelCode.readDataFromExcelRediff("LoginTN");
		return data;
	}
	

	public static Object[][] readDataFromExcelRediff(String sheetName) throws Exception {
		// You have to create the object of FileInput Stream
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\readingDataFromExcelSheet\\RediffData.xlsx");
		//You have to create the Object of XSSFWorkbook
		workbook = new XSSFWorkbook(ip);
		
		sheet = workbook.getSheet(sheetName);
		
		//determine the number of rows and cols
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows][cols];
		
		for(int i=0; i<rows ; i++) {
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0 ; j<cols ; j++) {
				XSSFCell cell =  row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				
				case NUMERIC:
					data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
				data[i][j] = cell.getBooleanCellValue();
				break;
				
				}
			}
		}
		
		return data;
	}
	
	public static Object[][] readDataFromExcelTutorialsNinja(String sheetName) throws Exception {
		// You have to create the object of FileInput Stream
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\readingDataFromExcelSheet\\RediffData.xlsx");
		//You have to create the Object of XSSFWorkbook
		workbook = new XSSFWorkbook(ip);
		
		sheet = workbook.getSheet(sheetName);
		
		//determine the number of rows and cols
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		Object[][] data = new Object[rows][cols];
		
		for(int i=0; i<rows ; i++) {
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0 ; j<cols ; j++) {
				XSSFCell cell =  row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				
				case NUMERIC:
					data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					break;
					
				case BOOLEAN:
				data[i][j] = cell.getBooleanCellValue();
				break;
				
				}
			}
		}
		
		return data;
	}
	
	
	
}
