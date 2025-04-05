package Listners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImpli  extends BaseClass1 implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("testscript is failed",true);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/error.png");
		try {
			FileHandler.copy(temp, dest);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testscript is passed",true);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("testscript is skipped",true);

	}	
}


