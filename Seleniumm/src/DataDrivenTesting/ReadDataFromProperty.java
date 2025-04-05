package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProperty {
	public static void main(String[] args) throws IOException {
		//s1:create FileInputStream object
		FileInputStream fis=new FileInputStream("./Testdata/CommonData.properties");
		
		//s2:create respective file type object
		Properties prop=new Properties();
		
		//s3:call read methods
		prop.load(fis);
		String URL=prop.getProperty("url");
		String email=prop.getProperty("email");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		
		
		
	}

}
