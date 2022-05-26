package practice;

import org.openqa.selenium.By;

public class CustomerLogin extends AdminLogin
{
	
	void customerLogin() throws InterruptedException
	{
		driver.get("https://dieselbarbershop-qa.unchainedsystems.com/customer");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[1]/div[2]/button/span[1]")).click();
		driver.findElement(By.name("userName")).sendKeys("+917879727476");
		driver.findElement(By.name("password")).sendKeys("Amplify@123");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/div[3]/button/span[1]")).click();
		
	}
	
}