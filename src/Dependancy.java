import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dependancy {
		WebDriver driver ;
	
	
	@BeforeClass
	public void StartBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		System.out.println("Browser Started");
	}
	@Test
	public void StartApp()

	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	
		
		String current_url = driver.getCurrentUrl();
		Assert.assertTrue(current_url.contains("facebook"));
		System.out.println("Application Loaded");
	}

	@Test(dependsOnMethods = "StartApp")

	public void LoginApp() throws InterruptedException

	{

		driver.findElement(By.id("email")).sendKeys("lakshaya.das@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("*****");
		driver.findElement(By.id("loginbutton")).click();
		
		Thread.sleep(5000);
		boolean status = driver.findElement(By.id("navItem_4748854339")).isDisplayed();
		
		Assert.assertTrue(status);
		
		
	}

	@Test(dependsOnMethods = "LoginApp")
	public void LogoutApp() throws InterruptedException

	{
		Thread.sleep(5000);
		driver.findElement(By.id("pageLoginAnchor")).click();
		
	
		List<WebElement> menue = driver.findElements(By.xpath("//a[@role='menuitem']"));
		
		// int count = menue.size();
		
		for(WebElement count : menue) {
			
			System.out.println("list are "+count);
		}
		
		Assert.assertTrue(driver.findElement(By.id("pageLoginAnchor")).isDisplayed());
				
	}
	@AfterClass
	public void Logout() {
		
		driver.quit();
		System.out.println("Quit");
		
		
	}
}
