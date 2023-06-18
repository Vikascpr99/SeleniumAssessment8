package Acions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GiftAndSet {
	public void homegiftsSets(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[4]/div/div/div/div/li[3]/ul/li[14]/a")).click();
	}
}

