package EmailBroadcast;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserSegmentClick {

	By list = By.xpath("//ul[@class='dropdown-menu usersegmentclickabledropdown']//a");

	WebDriver driver;

	public UserSegmentClick(WebDriver driver) {

		this.driver=driver;

	}
	@Test
	public void selectcon(String condition) {

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		List<WebElement> dropdownoptions = driver.findElements(list);

		int count = dropdownoptions.size();

		System.out.println("Segment Options " + dropdownoptions.size());

		for (int i = 0; i < count; i++) {

			WebElement segdrop = dropdownoptions.get(i);

			String segment_options = segdrop.getText();

			System.out.println("List of segment are " + segdrop.getText());

			if (segment_options.equalsIgnoreCase(condition)) {

				segdrop.click();
			}
		}
	}

}
