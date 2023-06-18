package Acions;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openxml4j.opc.Package;
public class Excel {
	public FileInputStream fis;
	public FileInputStream fis2;
	public XSSFWorkbook wb;
	public XSSFWorkbook wb2;
	public XSSFSheet sheet1;
	public XSSFSheet sheet2;
	public File file;
	public File file2;
	public double number;
	public double number1;
	public void write(WebDriver driver) throws IOException {
		file = new File("C:\\Users\\VK65778\\eclipse-workspace\\Selenium Assessment\\Selenium Assessment Vikas Kumar\\Ouput.xlsx");
		file2 = new File("C:\\Users\\VK65778\\eclipse-workspace\\Selenium Assessment\\Selenium Assessment Vikas Kumar\\input1.xlsx");
		fis = new FileInputStream(file);
		fis2 = new FileInputStream(file2);
		wb = new XSSFWorkbook(fis);
		wb2 = new XSSFWorkbook(fis2);
		
		sheet1 = wb.getSheetAt(0);
		sheet2 = wb2.getSheetAt(0);
		
		number = sheet2.getRow(0).getCell(0).getNumericCellValue();
	}
}

