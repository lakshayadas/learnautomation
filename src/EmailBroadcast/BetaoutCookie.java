package EmailBroadcast;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BetaoutCookie {
	@Test
	public static void betacookie(WebDriver driver) {

		Cookie _amplifyClientId = new Cookie("_amplifyClientId", "nvN4BSoi8pQ%3D");

		Cookie amplifyTeamMemberId = new Cookie("_amplifyTeamMemberId", "Loi3dIXpOBk%3D");

		Cookie st = new Cookie("_s_t", "3jcetjko");

		Cookie projectId = new Cookie("projectId", "xOhsrbOCaZg%3D");
		driver.manage().addCookie(_amplifyClientId);

		driver.manage().addCookie(amplifyTeamMemberId);

		driver.manage().addCookie(st);

		driver.manage().addCookie(projectId);

		WebElement Login = driver.findElement(By.xpath("//a[@href='/login/']"));

		Login.click();

	//	 ScreenShot.captureScreenshot(driver, "Login Clicked");

	}

}
