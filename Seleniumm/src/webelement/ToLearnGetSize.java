package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	
	Rectangle rect=driver.findElement(By.xpath("//input[@value='search']")).getRect();
	System.out.println(rect.getHeight());
	System.out.println(rect.getWidth());
	System.out.println(rect.getX());
	System.out.println(rect.getY());
	
//	Dimension size=driver.findElement(By.xpath("//input[@value='search']")).getSize();
//	System.out.println(size.getHeight());
//	System.out.println(size.getWidth());
	
//	Point position=driver.findElement(By.xpath("//input[@value='search']")).getLocation();
//	System.out.println(position);
}
}
