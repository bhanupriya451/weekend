package Listners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnerImplementation implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
   Reporter.log("testscript is paased",true);
}

	@Override
	public void onTestFailure(ITestResult result) {
		   Reporter.log("testscript is failed",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		   Reporter.log("testscript is skipped",true);
	}
	
	

}
