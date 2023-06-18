package Acions;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WriteToExel {
	public void writeToExcel(WebDriver driver,Excel excel) throws IOException {
		List<WebElement> fristname = driver.findElements(By.xpath("//body/div[@id='mountRoot']/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li/a[1]/div[2]/h3[1]"));
		List<WebElement> secondname = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li/a[1]/div[2]/h4[1]"));
		List<WebElement> prices = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li/a[1]/div[2]/div[1]/span[1]/span[1]"));
		/*
		 * Excell excel = new Excell(); excel.write(driver);
		 */for(int i=0;i<=4;i++) {
			 Row row = excel.sheet1.createRow(i);
			 excel.sheet1.getRow(i).createCell(0).setCellValue(fristname.get(i).getText());
			 excel.sheet1.getRow(i).createCell(1).setCellValue(secondname.get(i).getText());
			 excel.sheet1.getRow(i).createCell(2).setCellValue(prices.get(i).getText().substring(3));
		 }
		 FileOutputStream fout = new FileOutputStream(excel.file);
		 excel.wb.write(fout);
		 excel.wb.close();
	}
}

