package EmailBroadcast;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import EmailBroadcast.LoginPAge.BroadCast;

public class EmailIntegration  {

	
	public static void main(WebDriver driver) throws Throwable {
		
			By Gmail = By.xpath(("//input[@value='Connect']"));
			By Enter_email = By.id("identifierId");
			By Password = By.xpath("//input[@name='password']");
			By advanced =By.xpath("//a[contains(text(), 'Advanced')]");
			By betaout_unsafe = By.xpath("//a[contains(text(), 'Go to betaout.com (unsafe)')]");
			By allow = By.xpath("//span[contains(text(), 'ALLOW')]");
			By Next = By.xpath("//span[contains(text(), 'Next')]");
			
			// Get Current Window in String
			
			Thread.sleep(5000);
			driver.findElement(Gmail).click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String Email_integration = driver.getWindowHandle();
			
			// return Set of Strings
		
			Set<String> s1 = driver.getWindowHandles();
				
			//  Now we will iterate using Iterator
				Iterator<String> I1 = s1.iterator();
				
				while(I1.hasNext()) {
					
					String gmail_tab = I1.next();
					
					if(!Email_integration.equals(gmail_tab)){
							
						driver.switchTo().window(gmail_tab);
			System.out.println(driver.switchTo().window(gmail_tab).getTitle());
					}
				}
			
			//Enter Email 
			driver.findElement(Enter_email).sendKeys("lakshaya@getamplify.com");
		
			//After Entering Click Next button
			driver.findElement(Next).click();
			
			//Enter Password
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(Password).sendKeys("babu@123");
			
			
				Thread.sleep(5000);
			driver.findElement(Next).click();
			
			//Click Advanced
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			Thread.sleep(5000);
			driver.findElement(advanced).click();
			
			//Click unsafe betaout
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			Thread.sleep(5000);
			driver.findElement(betaout_unsafe).click();
			
			//Click Allow button
			Thread.sleep(5000);	
			driver.findElement(allow).click();
				
			Thread.sleep(5000);
			
			BroadCast campaign = new BroadCast();
			
			campaign.EmailBroadCast(driver);
			
			
			
			
	}

}
