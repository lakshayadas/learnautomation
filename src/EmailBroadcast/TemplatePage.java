package EmailBroadcast;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TemplatePage {

	WebDriver driver;

	By dragtemplates = By.cssSelector("div.boEditor_subCategoryElementsImage");
	By drop_template = By.className("template_preview_section_wrap");
	By change_template = By.xpath("//button[@class='btn-submit-blue changetemplateAlertBtn']");
	By save_next = By.cssSelector("a#saveNNext.pull-left.btn-submit-blue.saveTemplate.save-data");
	
	By link_Confirmation = By.id("okButton");
	By template_types = By.xpath("//li[@class='boEditor_categoryClassesInner  animate']");
	
	By contact_found = By.xpath("//i[@class='iconNew-refresh refresh_total_user_count']");

	public TemplatePage(WebDriver driver) {

		this.driver = driver;
	}
	@Test
	public void select_template(String ChooseTemplateType) throws Throwable {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> Bo_template_types = driver.findElements(template_types);

		int tem_size = Bo_template_types.size();
		
		System.out.println("No of Types " + tem_size);
		

		for (int i = 0; i < tem_size; i++) {

			WebElement templates = Bo_template_types.get(i);
		
			String Template = templates.getText();
			
			System.out.println("Template are " + Template);
	
		
		if(Template.equalsIgnoreCase(ChooseTemplateType)) {
			
			Thread.sleep(5000);
			
			Actions actions = new Actions(driver);
			
			actions.click(templates).perform();
			
			
		}
		
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> alltemplates = driver.findElements(dragtemplates);

		int count = alltemplates.size();

		System.out.println("No of Templates " + count);
		for (int i = 0; i < count;) {

			Thread.sleep(5000);
			WebElement listTemplates = alltemplates.get(4);
			
			String aaaa= listTemplates.getText();

			System.out.println("Hey there " + listTemplates+ "and are  " +aaaa);

			WebElement drop = driver.findElement(drop_template);

			Actions action = new Actions(driver);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			action.dragAndDrop(listTemplates, drop).click().perform();
			break;
		}

	}
	@Test
	public void changeTemplate() {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='btn-submit-blue changetemplateAlertBtn']")));
		driver.findElement(change_template).click();
	}
	@Test
	public void save_next() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		driver.findElement(save_next).click();
	}
	@Test
	public void link_confirm() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(link_Confirmation).click();

	}
}
