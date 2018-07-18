package EmailBroadcast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SendEmail {
	@Test
	public static void SendBEmail(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		By send_email = By.id("btnSendEmail");
		By final_send = By.cssSelector("button.btn-submit-green-new.btndisabledAfterClick.validateUpdateProp");
		
		driver.findElement(send_email).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		};
	
			WebElement send = 	driver.findElement(final_send);
		
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", send);
			
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //not sure why the sleep was needed, but it was needed or it wouldnt work :(
		send.click();
		
		
		
	}
	
}
