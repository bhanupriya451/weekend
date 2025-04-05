package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
  @Test()
  public void register() {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://demowebshop.tricentis.com/register");
	  Reporter.log("register test case executed",true);
	  
  }
  
  @Test(dependsOnMethods = "register")
  public void login() {
	  //test steps
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://demowebshop.tricentis.com/login");
	  Reporter.log("login test case executed",true);
  }  
	  @Test(dependsOnMethods= {"register","login"})
	  public void addToCart() {
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://demowebshop.tricentis.com/cart");
		  Reporter.log("addToCart test case executed",true);
		  

		  
	  }
 
}