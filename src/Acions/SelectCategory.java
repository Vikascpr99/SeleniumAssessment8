package Acions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SelectCategory {
	public void selectCategory(WebDriver driver) {
		By checkHomeGiftsSets = By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[3]/ul/li[2]/label");driver.findElement(checkHomeGiftsSets).click();
	}
}

