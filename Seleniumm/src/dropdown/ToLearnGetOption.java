package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		//	driver.get("https://demoapp.skillrary.com/");
		//	WebElement priceListbox=driver.findElement(By.id("cars"));
		//	Select priceSelect=new Select(priceListbox);
	//		List<WebElement> allOptions=priceSelect.getOptions();
	//		System.out.println(allOptions.size());
		//	for(WebElement ele:allOptions) 
	//	System.out.println(ele.getText());
			
			
			driver.get("https://www.facebook.com/reg");
			WebElement monthListbox=driver.findElement(By.id("month"));
			Select monthSelect=new Select(monthListbox);
			List<WebElement> allOptions=monthSelect.getOptions();
			System.out.println(allOptions.size());
		//	monthSelect.selectByIndex(allOptions.size()-1);to select last option
			for(WebElement ele:allOptions) {
				System.out.println(ele.getText());	
			
			
	}
	}
}
