package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://demoapp.skillrary.com/");
			Thread.sleep(2000);
			
			JavascriptExecutor js=(JavascriptExecutor) driver;
		//	js.executeScript("window.scrollBy(0,500)");//co-ordinate calculated from scroll bar position
		//	js.executeScript("window.scrollTo(2000,200");//co-ordinates calculated from origin
		//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll till bottom of webpage
	        js.executeScript("history.go()");
	
	}
	}


