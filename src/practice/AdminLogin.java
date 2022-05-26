package practice;

import org.openqa.selenium.By;

public class AdminLogin extends DriverManager 
{
	
	void adminLogin() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.get("https://dieselbarbershop-qa.unchainedsystems.com/admin");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("store.owner@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Amplify@123");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/div[3]/button/span[1]")).click();
	}
	
}