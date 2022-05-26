package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class MultiUserLogin 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Self Learning\\Selenium\\BROWSER DRIVER\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
			
			String user_role="admin";
			
			if (user_role.equals("admin")) 
				{
					System.out.println("True");
					driver.get("https://dieselbarbershop-qa.unchainedsystems.com/admin");
					Thread.sleep(5000);
					driver.findElement(By.name("email")).sendKeys("store.owner@yopmail.com");
					driver.findElement(By.name("password")).sendKeys("Amplify@123");
					driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/div[3]/button/span[1]")).click();
				}
			else
				{
					System.out.println("False");
					driver.get("https://dieselbarbershop-qa.unchainedsystems.com/customer");
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[1]/div[2]/button/span[1]")).click();
					driver.findElement(By.name("userName")).sendKeys("+917879727476");
					driver.findElement(By.name("password")).sendKeys("Amplify@123");
					driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/div[3]/button/span[1]")).click();
					//ff
				}
		
		}
}
