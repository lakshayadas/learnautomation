import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PhpTravels {
	
	WebDriver driver ;
	
	@Test
	public void loginApp () {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://phptravels.org/register.php");
		
	}
	
	
}
