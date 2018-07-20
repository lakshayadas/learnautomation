package EmailBroadcast;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		BroadCast campaign = new BroadCast();
		
		campaign.EmailBroadCast(driver);
		
	}	
		public static class BroadCast {
			
			@Test
			public void EmailBroadCast(WebDriver driver) {
		
		
		driver.get("https://urza.betaout.com/email/choose-campaign-type/nv/campaignType/broadcast");
		//		driver.get("https://urza.betaout.com/email/choose-recepients/nv/cTypeId/127580/ucId/986514/re/0");
		
		// This is Campaign Page which has all object and methods.
		
		CampaignPage broadcast = new CampaignPage(driver);

		broadcast.typeCampaignName("Test Campaign");
		try {
			broadcast.selectSenderId("Lakshaya@getamplify.com(gmail)");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String []Tag = {"Nitin","Bikes","Air"};
		
		broadcast.typeSubjectName("This is Test Email");
		broadcast.typeCampaignTag(Tag);
		broadcast.clickOnSaveAndNext(); 
		
	
		// This is Template Page which has all object and methods.
		
		TemplatePage Bo_editor = new TemplatePage(driver);
		
		try {
			Bo_editor.select_template("THEME");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Bo_editor.changeTemplate();
		Bo_editor.save_next();
		Bo_editor.link_confirm();
		 
		// // This is Targeting Page which has all object and methods.
		TargettingPage target = new TargettingPage(driver);
		
		target.conditons();
		target.dropdown();
		
		// This is SegmentClick options Page which has all object and methods.
		UserSegmentClick segment = new UserSegmentClick(driver);
		segment.selectcon("have");
		
		Property.property(driver, "User");
		Property.search(driver, "email");
		Property.filter(driver, "Exactly As");
		Property.enteremail(driver , "lakshaya@getamplify.com");
		Bo_editor.save_next();
		
		// // This is Send Email Page which has all object and methods.
		SendEmail.main(driver);
		
		// Verify Broken Links
		// VerifyLinks.main(driver);
		
			}}}
