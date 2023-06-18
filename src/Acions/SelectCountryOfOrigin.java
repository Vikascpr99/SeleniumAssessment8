package Acions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelectCountryOfOrigin {
	public void selectCountryOfOrigin(WebDriver driver) {
		WebElement element2 = driver.findElement(By.cssSelector("#desktopSearchResults > div:nth-child(1) > section > div:nth-child(1) > div.atsa-base > ul > li:nth-child(2) > label > h4"));
		element2.click();
		WebElement element3 = driver.findElement(By.cssSelector("#desktopSearchResults > div:nth-child(1) > section > div:nth-child(1) > div.atsa-base > div > ul > li:nth-child(2) > label"));
		element3.click();
	}
}

