package Listners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerImplementation.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("open browser",true);
		Reporter.log("Enter url",true);
		Reporter.log("click on login link",true);
		Reporter.log("enter credentials",true);
		Reporter.log("click on login button",true);
		Assert.assertEquals(true, false);		
	}

}
