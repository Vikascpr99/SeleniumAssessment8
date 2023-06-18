package Acions;


import org.openqa.selenium.WebDriver;
public class OpenApp {
	public static WebDriver driver;
	public void open(WebDriver driver) {
		driver.get("https://www.myntra.com/");
	}
}


