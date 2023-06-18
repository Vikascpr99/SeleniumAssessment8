package MyntraMain;

	import java.io.IOException;
	import java.util.Set;
	
	import org.openqa.selenium.WebDriver;
	
	import Acions.*;
	
	public class Myntra { 
		public static WebDriver driver;
		
		public static void main(String[] args)throws InterruptedException, IOException {

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
			driver.switchTo().window(parenwindow);
			Thread.sleep(1000);
			//Login 
			Login login = new Login();
			login.Login(driver, excel);
			
			Thread.sleep(1000);
			driver.quit();
		
		}
		}
	
	




