package EmailBroadcast;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CampaignPage {

	WebDriver driver;
	

	By campaign_name = By.id("news_letter_name");
	By sender_id = By.id("senderSelected");
	By sender_emails = By.xpath("//li[@class='senderSelect']");
	By subject = By.cssSelector("div.emoji-wysiwyg-editor.BO_inputbox");
	By campaign_tag = By.id("campaignTag");
	By Click_tag = By.xpath("//a[@class='campaign_tag'][@href='javascript:void(0)']");
	By save_next = By.id("news_letter_sub_button");

	public CampaignPage(WebDriver driver) {
		// This will initialize Webdriver to Start
		this.driver = driver;

	}
	@Test
	public void typeCampaignName(String EnterCampaignName) {

		driver.findElement(campaign_name).sendKeys(EnterCampaignName);
	}
	@Test
	public void selectSenderId(String EnterEmail) throws Throwable {

		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		driver.findElement(sender_id).click();
		
		

		List<WebElement> Sender_email = driver.findElements(sender_emails);
		int count = Sender_email.size();

		System.out.println("All Email ids are " + Sender_email.size());

		
		if(count==0) {
			
			driver.get("https://urza.betaout.com/email/server-setup/");
		
			
			// will Switch to the Email integration Page.
				EmailIntegration.main(driver);
			
			}
		
		for (int i = 0; i < count; i++) {

			
			WebElement email = Sender_email.get(i);

			String emails = email.getText();

			boolean status= email.isEnabled();
			
			
			System.out.println("All Email ids are " + emails+ "is " +status);
			
			if(emails.equalsIgnoreCase(EnterEmail)) {
				
				email.click();
				break;
			}
		}

	}

	@Test
	  public void typeSubjectName(String SubJectName) {
	  
	  driver.findElement(subject).sendKeys(SubJectName); }
	  
	@Test
	  	
		public void typeCampaignTag(String []add_tag) {
	  
//	  String []add_tag = {"Cars","Bikes","Air"};
	  
	  for(int i =0; i<add_tag.length;i++) {
	  
	  System.out.println(add_tag[i]);
	  
	  driver.findElement(campaign_tag).sendKeys(add_tag[i]);
	  driver.findElement(Click_tag).click();
	  
	  
	  }
	  
	  }
	@Test
	public void clickOnSaveAndNext() {

		driver.findElement(save_next).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

}
