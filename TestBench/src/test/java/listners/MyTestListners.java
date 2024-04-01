package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;

public class MyTestListners implements ITestListener{
	@Override
	public void onStart(ITestContext context) {
	    Allure.addAttachment("Test Suite Name", context.getSuite().getName());
	    Allure.addAttachment("Start Time", context.getStartDate().toString());
	}

	@Override
	public void onFinish(ITestContext context) {
	    Allure.addAttachment("End Time", context.getEndDate().toString());
	}
	@Override
	public void onTestStart(ITestResult result) {
		Allure.addAttachment("Test Method Name", result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Allure.addAttachment("Test Status", "Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Allure.addAttachment("Test Status", "Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Allure.addAttachment("Test Status", "Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Allure.addAttachment("Test Status", "Failed (within success percentage)");
		
	}



}
