package Acions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckPage {
	public void checkPage1(WebDriver driver) {
		String temp1 = driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[1]/div/ul/li[3]/span")).getText(); //Homegiftsets check
		if(temp1.equals("Homegiftsets")) {
			System.out.println("Results are according to search criteria");
		}
		else {
			System.out.println("Results are not according to search criteria");
		}
	}public void checkPage(WebDriver driver) {
		// TODO Auto-generated method stub
	}
}

