package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiMethod {

	 WebDriver driver;

	
		public void Browser()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Self Learning\\Selenium\\BROWSER DRIVER\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		
		public void closeBrowser()
		{
		driver.quit();
		}
		
		
		public void admin() throws InterruptedException 
		{
			System.out.println("True");
			driver.get("https://dieselbarbershop-qa.unchainedsystems.com/admin");
			Thread.sleep(5000);
			driver.findElement(By.name("email")).sendKeys("store.owner@yopmail.com");
			driver.findElement(By.name("password")).sendKeys("Amplify@123");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/div[3]/button/span[1]")).click();
		} 
		
		
		public void customer() throws InterruptedException  
		{
			System.out.println("False");
			driver.get("https://dieselbarbershop-qa.unchainedsystems.com/customer");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[1]/div[2]/button/span[1]")).click();
			driver.findElement(By.name("userName")).sendKeys("+917879727476");
			driver.findElement(By.name("password")).sendKeys("Amplify@123");
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/div[3]/button/span[1]")).click();
			
		}
		
		
		public static void main(String[] args) throws InterruptedException 
		{
			MultiMethod obj = new MultiMethod();
			obj.Browser();
			String user_role = "admin";
			if (user_role.equals("admin")) 
			{
				obj.admin();
			}
			else
			{
				obj.customer();
			}
			
			obj.closeBrowser();
	System.out.println("Maven Repo added");
	//11
	}

}
