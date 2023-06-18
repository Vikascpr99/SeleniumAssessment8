package Acions;
import java.time.Duration;import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser{
	public static WebDriver driver;
	public WebDriver driverSetup() {
		
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			return driver;
		}
	
	public WebDriver driverSetupEdge() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		return driver;
	}
}
	
	
		
	

