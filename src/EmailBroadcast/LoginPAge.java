package EmailBroadcast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.VerifyLinks;

public class LoginPAge {
	@Test
	public static void main(String[] args) throws Exception {

		System.setProperty("driver.chrome.webdriver",
				"C:\\Users\\lakshaya\\eclipse\\java-oxygen\\eclipse\\eclipse-workspace\\LearnJava\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://urza.betaout.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Using Cookie Class From BetaoutCookie

			BetaoutCookie.betacookie(driver);

	

		// Verify Broken Links
		//	VerifyLinks.main(driver);
			

		
	}

}
