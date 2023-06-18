package Testng;
import java.io.IOException;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Acions.*;
public class testng {
	public static WebDriver driver;
	
	@BeforeTest
	
	public void test1() {
		System.out.println("Open Browser in different Browser.....");
	}@Test(priority=1)
	public void chromeBrowser() throws InterruptedException, IOException {
		Browser browser = new Browser();
		driver=browser.driverSetup();
		//Opening Application
		OpenApp openapp = new OpenApp();
		openapp.open(driver);
		//Moving to HomeAndLiving
		HomeAndLiving homeandliving = new HomeAndLiving();
		homeandliving.homeandLiving(driver);
		//Selecting Gift and Set
		GiftAndSet homegiftssets = new GiftAndSet();
		homegiftssets.homegiftsSets(driver);
		CheckPage checkpage = new CheckPage();
		checkpage.checkPage(driver);
		Thread.sleep(1000);
		//Selecting Category
		SelectCategory selectcategory = new SelectCategory();
		selectcategory.selectCategory(driver);
		Thread.sleep(1000);
		//Selecting discount
		SelectDiscount selectdiscount = new SelectDiscount();
		selectdiscount.selectDiscount(driver);
		Thread.sleep(2000);
		//Selecting country
		SelectCountryOfOrigin selectcountryoforigin = new SelectCountryOfOrigin();
		selectcountryoforigin.selectCountryOfOrigin(driver);
		Thread.sleep(1000);
		//Choosing from dropdown
		SortByDropDown sortbydropdown = new SortByDropDown();
		sortbydropdown.sortByDropDown(driver);
		Thread.sleep(3000);
		//Writing data to Excel
		Excel excel = new Excel();
		excel.write(driver);
		Thread.sleep(1000);
		WriteToExel writetoexcel = new WriteToExel();
		writetoexcel.writeToExcel(driver,excel);
		Thread.sleep(1000);
		//Getting first item and 
		GetFirstItem getfirstitem = new GetFirstItem();
		getfirstitem.getFirstItem(driver);
		Thread.sleep(1000);
		String parenwindow = driver.getWindowHandle(); 
		//Window handling
		Set<String> childwindow =driver.getWindowHandles();
		for(String value:childwindow) {
			driver.switchTo().window(value);
		}
		Thread.sleep(1000);
		// Adding to bag
		AddToBag addtobag = new AddToBag();
		addtobag.addToBag(driver);
		Thread.sleep(1000);driver.close();
		//Switching Window
		driver.switchTo().window(parenwindow);
		Thread.sleep(1000);
		Login login = new Login();
		login.Login(driver, excel);
		}
	
	@Test
	public void edgeBrowser() throws InterruptedException, IOException {
		Browser browser = new Browser();
		driver=browser.driverSetupEdge();
		//Opening Application
		OpenApp openapp = new OpenApp();
		openapp.open(driver);
		//Moving to HomeAndLiving
		HomeAndLiving homeandliving = new HomeAndLiving();
		homeandliving.homeandLiving(driver);
		//Selecting Gift and Set
		GiftAndSet homegiftssets = new GiftAndSet();
		homegiftssets.homegiftsSets(driver);
		CheckPage checkpage = new CheckPage();
		checkpage.checkPage(driver);
		Thread.sleep(1000);
		//Selecting Category
		SelectCategory selectcategory = new SelectCategory();
		selectcategory.selectCategory(driver);
		Thread.sleep(1000);
		//Selecting discount
		SelectDiscount selectdiscount = new SelectDiscount();
		selectdiscount.selectDiscount(driver);
		Thread.sleep(2000);
		//Selecting country
		SelectCountryOfOrigin selectcountryoforigin = new SelectCountryOfOrigin();
		selectcountryoforigin.selectCountryOfOrigin(driver);
		Thread.sleep(1000);
		//Choosing from dropdown
		SortByDropDown sortbydropdown = new SortByDropDown();
		sortbydropdown.sortByDropDown(driver);
		Thread.sleep(3000);
		//Writing data to Excel
		Excel excel = new Excel();
		excel.write(driver);
		Thread.sleep(1000);
		WriteToExel writetoexcel = new WriteToExel();
		writetoexcel.writeToExcel(driver,excel);
		Thread.sleep(1000);
		//Getting first item and 
		GetFirstItem getfirstitem = new GetFirstItem();
		getfirstitem.getFirstItem(driver);
		Thread.sleep(1000);
		String parenwindow = driver.getWindowHandle(); 
		//Window handling
		Set<String> childwindow =driver.getWindowHandles();
		for(String value:childwindow) {
			driver.switchTo().window(value);
		}
		Thread.sleep(1000);
		// Adding to bag
		AddToBag addtobag = new AddToBag();
		addtobag.addToBag(driver);
		Thread.sleep(1000);driver.close();
		//Switching Window
		driver.switchTo().window(parenwindow);
		Thread.sleep(1000);
		Login login = new Login();
		login.Login(driver, excel);}
	
	
	
	@AfterTest
	public void test3() {
		driver.quit();
	}
}

