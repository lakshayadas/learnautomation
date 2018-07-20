package EmailBroadcast;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TargettingPage {
	
	
	
	WebDriver driver;
	
	
		By Add_new = By.xpath("//a[contains(text(), 'ADD NEW')]");
		By Select_dropdown = By.xpath("//span[contains(text(), 'Select')]");
	
		public TargettingPage(WebDriver driver) {
			
			this.driver=driver;
			
		}
		@Test
		public void conditons() {
			
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			List<WebElement> conditions = driver.findElements(Add_new);
			
			int count = conditions.size();
			
			System.out.println("No of Conditions are "+count);
				
			WebElement select_conditions = conditions.get(0);
			
			Actions actions = new Actions(driver);
			
			actions.moveToElement(select_conditions).click().perform();
			
		}
		@Test
		public void dropdown() {
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.findElement(Select_dropdown).click();
			
			
		}
		
		
		
				
				
			}
		

