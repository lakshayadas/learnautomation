package EmailBroadcast;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPAge {

	
	@Test
	public static void main(String[] args) throws Throwable {

		System.setProperty(".webdriver.chrome.driver",
				"/home/lakshaya/eclipse-workspace/learnautomation/chromedriver_linux64.zip");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://urza.betaout.com/");
	
		
		// Using Cookie Class From BetaoutCookie

		BetaoutCookie.betacookie(driver);
		
		BroadCast abcd = new BroadCast();
		
		abcd.EmailBroadCast(driver);
		
		
	}	
		public static class BroadCast {
			@Parameters({"WebDriver driver"})
			@Test
			public void EmailBroadCast(WebDriver driver) {
		
		
		driver.get("https://urza.betaout.com/email/choose-campaign-type/nv/campaignType/broadcast");
		
		CampaignPage broadcast = new CampaignPage(driver);

		broadcast.typeCampaignName();
		try {
			broadcast.selectSenderId();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		broadcast.typeSubjectName();
		broadcast.typeCampaignTag();
		broadcast.clickOnSaveAndNext(); 
		
		
		TemplatePage Bo_editor = new TemplatePage(driver);
		
		try {
			Bo_editor.select_template();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Bo_editor.changeTemplate();
		Bo_editor.save_next();
		Bo_editor.link_confirm();
		 
		
		TargettingPage target = new TargettingPage(driver);
		
		target.conditons();
		target.dropdown();
		
		UserSegmentClick segment = new UserSegmentClick(driver);
		segment.selectcon();
		
		Property.property(driver);
		Property.search(driver);
		Property.filter(driver);
		Property.enteremail(driver);
		Bo_editor.save_next();
		
		SendEmail.SendBEmail(driver);
		
		// Verify Broken Links
		// VerifyLinks.main(driver);
		
			}}}
