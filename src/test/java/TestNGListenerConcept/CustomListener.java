package TestNGListenerConcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

/*
 * Author: Jayanta Kumar Panda
 */
public class CustomListener extends Base implements ITestListener {
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED Test");
		failed(result.getMethod().getMethodName());
	}
	
	
}
