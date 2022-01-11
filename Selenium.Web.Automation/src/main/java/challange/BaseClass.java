package challange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;

	@BeforeTest
	public void intialzeBrowser()
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmanGupta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	

}
