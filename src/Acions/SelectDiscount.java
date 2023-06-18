package Acions;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class SelectDiscount {
	public void selectDiscount(WebDriver driver) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[text()[contains(.,'30% and above')]]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(3000);element.click();
	}
}

