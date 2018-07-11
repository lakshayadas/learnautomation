package EmailBroadcast;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BetaoutCookie {
	
	
	@Test
	public static void betacookie(WebDriver driver) throws Exception {
	
		Cookie PHPSESSID = new Cookie("PHPSESSID", "eckjj6ggj8kl39kjqmkm2p0mv5");

		Cookie ampid = new Cookie("_ampDI", "1531157874496");

		Cookie ampNV = new Cookie("_ampNV", "0");

		Cookie _ampSES = new Cookie("_ampSES", "e9cce82f0bSES6e2ae003f8ef-30081-1531163068570");

		Cookie ampUSER = new Cookie("_ampUSER",
				"eyJkZXZpY2VfaWQiOiIxNTMxMTU3ODc0NDk2IiwiZW1haWwiOiJsYWtzaGF5YUB5MHYuaW4ifQ%3D%3D");

		Cookie _amplifyClientId = new Cookie("_amplifyClientId", "nvN4BSoi8pQ%3D");

		Cookie amplifyTeamMemberId = new Cookie("_amplifyTeamMemberId", "Loi3dIXpOBk%3D");

		Cookie _b_c_n = new Cookie("_b_c_n", "3");

		Cookie _ga = new Cookie("_ga", "GA1.2.477683736.1531157857");

		Cookie _gid = new Cookie("_gid", "GA1.2.720505943.1531157857");

		Cookie st = new Cookie("_s_t", "3jcetjko");

		Cookie intercomid = new Cookie("intercom-id-ry8byjc4", "4e8a915d-564e-45f7-b75b-b4ca5781bb47");

		Cookie intercomloury8byjc4 = new Cookie("intercom-lou-ry8byjc4", "1");

		Cookie visitorunique = new Cookie("sc_is_visitor_unique",
				"rx9443501.1531157876.2F7D12D9853C4FF10C485235F7652E62.1.1.1.1.1.1.1.1.1");

		Cookie intercomsessionry8byjc4 = new Cookie("intercom-session-ry8byjc4",
				"bmNnbkNQMWxvdDNudWhlRWRibjhSU2RjWmk4TWVsZXZaNW1ndHZWaUorNi91WEJMVjN0R2tEY0FnSDRRNEtyVC0tZEROK1pETkhEREJrNUpScjNFbnFadz09--7fdbc2a8590945936d48b44854205bdfe5112d3f");

		Cookie projectId = new Cookie("projectId", "xOhsrbOCaZg%3D");

		driver.manage().addCookie(PHPSESSID);
		driver.manage().addCookie(ampid);
		driver.manage().addCookie(ampNV);

		driver.manage().addCookie(_ampSES);
		driver.manage().addCookie(ampUSER);
		driver.manage().addCookie(_amplifyClientId);

		driver.manage().addCookie(amplifyTeamMemberId);

		driver.manage().addCookie(_b_c_n);

		driver.manage().addCookie(_ga);
		driver.manage().addCookie(st);

		driver.manage().addCookie(_gid);
		driver.manage().addCookie(intercomid);
		driver.manage().addCookie(intercomloury8byjc4);
		driver.manage().addCookie(intercomsessionry8byjc4);

		driver.manage().addCookie(projectId);

		driver.manage().addCookie(visitorunique);
		
	WebElement	Login = driver.findElement(By.xpath("//a[@href='/login/']"));
			
		Login.click();
		
		// ScreenShot.captureScreenshot(driver, "Login Clicked");
		
	
	
	
	}

	
	
}
