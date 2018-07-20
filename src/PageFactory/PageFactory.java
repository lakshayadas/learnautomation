package PageFactory;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class PageFactory {

	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
		@Test
		public void WordPressLogin() {
			
			
			driver.get("https://wordpress.com/log-in");
			String Current_url = driver.getCurrentUrl();
			String Title = driver.getTitle();
			System.out.println("My Title is "+Current_url+ " and url is "+Title);

		
	 	AssertJUnit.assertEquals(Title, "Log In  WordPress.com", "Check With developer");
			System.out.println("Test Case 1 Passed");
			
		}
		
		@Test
		public void WordPressLogin2() {
			
			
			driver.get("https://wordpress.com/log-in");
			String Current_url = driver.getCurrentUrl();
			String Title = driver.getTitle();
			System.out.println("My Title is "+Current_url+ " and url is "+Title);

		
	 	AssertJUnit.assertEquals(Title, "Log In — WordPress.com", "Check With developer");
	 	System.out.println("Test Case 2 Passed");
			
		}
	

}
