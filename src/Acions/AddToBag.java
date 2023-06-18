package Acions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AddToBag {
	public void addToBag(WebDriver driver) throws InterruptedException {
		By addToBag = By.xpath("//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]");
		driver.findElement(addToBag).click();
		Thread.sleep(2000);
		char addedToCart = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]")).getText().charAt(0);
		if(addedToCart=='1') {
			System.out.println("Added to Cart");
		}
		else {
			System.out.println(" Not Added to Cart");
		}
	}
}

