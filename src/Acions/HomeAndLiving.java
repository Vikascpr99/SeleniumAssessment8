package Acions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class HomeAndLiving {
	public void homeandLiving(WebDriver driver) {By HomeAndLiving = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]");
	Actions actions = new Actions(driver);
	actions.moveToElement(driver.findElement(HomeAndLiving)).perform();
	}
}

