package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenersDemo.TestNGListerners.class)
public class MyFirstTestCase {

	@Test
	public void GoogleTitleVerify() {
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.co.in/");
			
			System.out.println(driver.getTitle());
			
		
	}
	
}


