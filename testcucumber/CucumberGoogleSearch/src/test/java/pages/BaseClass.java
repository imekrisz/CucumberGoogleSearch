package pages;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public BaseClass()
	{
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("This is the driver-----"+ driver);
			driver.manage().window().maximize();
		}
	}
	public void openURL() {
		driver.get("http://google.com");
	}
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
	}
}
