package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println(loginBtn.isDisplayed());
		System.out.println(loginBtn.isEnabled());
	}
}
		
