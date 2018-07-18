package EmailBroadcast;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Property {
	@Test
	public static void property(WebDriver driver) {

		By property = By.xpath("//span[contains(text(), 'Property')]");
		By dropdown_submenu = By.xpath("//li[@class='dropdown-submenu']");

		driver.findElement(property).click();

		List<WebElement> submenu = driver.findElements(dropdown_submenu);

		int count2 = submenu.size();

		for (int j = 0; j < count2; j++) {

			WebElement property_menue = submenu.get(j);

			String user_property = property_menue.getText();

			System.out.println("Segment Properties are " + user_property);

			if (user_property.equalsIgnoreCase("user")) {

				property_menue.click();
			}

		}

	}
	@Test
	public static void search(WebDriver driver) {

		By select_property = By.xpath("//a[@data-parentkey='userproperty']");
		List<WebElement> userproperty = driver.findElements(select_property);

		int count = userproperty.size();

		System.out.println("No of Properties " + count);

		for (int i = 0; i < count; i++) {

			WebElement propert_text = userproperty.get(i);

			String user_text = propert_text.getText();

			System.out.println("User Property are " + user_text);

			if (user_text.equalsIgnoreCase("email")) {

				// Scroll until element is visible
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", propert_text);

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				propert_text.click();
			}
		}

	}
	@Test
	public static void filter(WebDriver driver) {

		By where = By.xpath("//span[contains(text(),'Where')]");
		By select = By.xpath(("//span[contains(text(), 'Select : ')]"));
		By filter = By.xpath("//div[@class='dropdown-menu usersegmentclickabledropdown']//ul/li");
		
		driver.findElement(where).click();
		driver.findElement(select).click();

		List<WebElement> type = driver.findElements(filter);

		int count = type.size();

		System.out.println("No of Filters " + count);

		for (int l = 0; l < count; l++) {

			WebElement filter_text = type.get(l);
			String filter_select = filter_text.getText();

			System.out.println("filters are " + filter_select);
			if (filter_select.equalsIgnoreCase("Exactly As")) {

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				filter_text.click();
				
				

			}
		}
	}
	@Test
	public static void enteremail(WebDriver driver) {
		By input = By.xpath("//input[@placeholder='Enter']");
		
			driver.findElement(input).sendKeys("lakshaya@getamplify.com");
		
	}
}
