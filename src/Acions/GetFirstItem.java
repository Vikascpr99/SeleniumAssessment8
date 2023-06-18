package Acions;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class GetFirstItem {
	public void getFirstItem(WebDriver driver) {
		List<WebElement> items = driver.findElements(By.xpath("//body[1]/div[2]/div[1]/div[1]/main[1]/div[3]/div[2]/div[1]/div[2]/section[1]/ul[1]/li/a[1]"));
		items.get(0).click();
	}
}

