package Listners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerImpli.class)
public class TestScript1 extends BaseClass1{
  @Test
  public void login() {
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("bp4500183@gmail.com");
      driver.findElement(By.id("Password")).sendKeys("BHAN@123");
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
      Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Home page is not displayed");
		Reporter.log("Home page is displayed",true);
  }
}
