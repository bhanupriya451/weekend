package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.flipkart.com/");
			WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
			
			Actions act=new Actions(driver);
			act.moveToElement(electronics).perform();
			
			WebElement gaming=driver.findElement(By.linkText("gaming"));
			act.moveToElement(gaming).perform();
			
			driver.findElement(By.linkText("games")).click();
	}
			

}
