package screenshotFailTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	/*@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCCESS TEST");
		failed(result.getMethod().getMethodName());
	}*/

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED TEST");
		failed(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
}
/*
 * I got an error at "ITestListner" and then imported "ITestListner(org.testng).After this it was 
 * expected that I will get an error for "Listener" but I didn't get any error.The expectation is 
 * when I move the cursor over "Listeners" I should get "Add unimplemented methods" option.
 * Ans:Right click(on the Listeners class ) -> go to source-> click on overide/implement methods -> 
 * select the check boxes for the ITest listener (make sure all check box inside it should be checked )
 * ->click on oK. That's it !!!
 */
