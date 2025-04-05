package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class webb {
	public static void main(String[] args) throws IOException, InterruptedException {
		String timestamp=LocalDateTime.now().toString().replace(":", "-");
		System.out.println(timestamp);
		
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com/");
			Thread.sleep(2000);
	
			TakesScreenshot ts=(TakesScreenshot)driver;
			File temp=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Screenshots/"+timestamp+".png");
			FileHandler.copy(temp, dest);
	}

}
