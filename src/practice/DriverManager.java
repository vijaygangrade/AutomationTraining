package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager 
{
	public WebDriver driver;
	void openBrowser()
	{
	 System.setProperty("webdriver.chrome.driver", "D:\\Self Learning\\Selenium\\BROWSER DRIVER\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();	
	}
	
	void closeBrowser()
	{
	 driver.quit();
	}
}