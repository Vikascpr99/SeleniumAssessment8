package Acions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class SortByDropDown {
	public void sortByDropDown(WebDriver driver) {
		WebElement element4 = driver.findElement(By.cssSelector("#desktopSearchResults > div:nth-child(1) > section > div:nth-child(1) > div.horizontal-filters-sortContainer > div > div > div"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element4).perform();
		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[1]/section/div[1]/div[1]/div/div/div/ul/li[6]/label")).click();
	}
}

