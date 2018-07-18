import org.testng.annotations.Test;

public class TestNGPriority {

	@Test(priority = 2,description = "This test case will verify the test2")
	public void HelloWorl() {
		
		System.out.println("Hi Lakshaya");
	}
	
	@Test(priority = 1 ,description = "This test case will verify the test1")
	public void NHelloWorl() {
		
		System.out.println("Hi Lakshaya");
	}
}
