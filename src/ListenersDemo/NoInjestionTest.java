package ListenersDemo;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;

import com.sun.tools.javac.resources.ct;

public class NoInjestionTest {
	
	@DataProvider(name = "provider")
	  public Object[][] provide() throws Exception {

	      return new Object[][] { { ct.class.getMethod("f") } };
	  }


	  @Test(dataProvider = "provider")

	  public void withoutInjection(@NoInjection Method m) {
	      AssertJUnit.assertEquals(m.getName(), "f");

	  }


	  @Test(dataProvider = "provider")
	  public void withInjection(Method m) {

	      AssertJUnit.assertEquals(m.getName(), "withInjection");
	  }

	


}
