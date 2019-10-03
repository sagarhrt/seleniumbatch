package selenium;

import org.seleniumhq.jetty9.server.handler.ContextHandler.Context;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnrDemo implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getEndDate());
		System.out.println(context.getFailedTests());
		System.out.println(context.getPassedTests());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context.getOutputDirectory());
		System.out.println(context.getStartDate());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getName());
		System.out.println(result.getStatus());
	}
	
	

}
