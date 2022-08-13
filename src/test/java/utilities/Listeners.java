package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class Listeners extends BaseTest implements ITestListener{
	public void OnTestFailture(ITestResult result) {
		try {
			Screenshot.captureScreen(driver, result.getName());
			
		}
		catch(IOException e) {
			e.printStackTrace();
		
		}
	}
	

}
