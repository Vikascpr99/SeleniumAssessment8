package Acions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
public class Login {
	public void Login(WebDriver driver,Excel excel) throws InterruptedException {
		By Profile = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(Profile)).perform();
		By login = By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a");
		driver.findElement(login).click();
		By mobileNumber = By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input");
		driver.findElement(mobileNumber).sendKeys(String.valueOf(excel.number).replace(".","").substring(0,9));
		Thread.sleep(2000);
		By Continue = By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[3]");
		driver.findElement(Continue).click();
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/div"));
		String errormsg = error.getText();if(errormsg.equals(errormsg)) {
			Reporter.log(errormsg);
		}
	}
}

