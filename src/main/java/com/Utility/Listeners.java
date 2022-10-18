package com.Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners extends BaseClass implements ITestListener {
	ExtentReports extents =ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
		Library.test=extents.createTest(result.getTestClass().getName()+"--"+result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test case Pass");
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test case Fail");
		extenttest.get().addScreenCaptureFromBase64String(getCapture()); //if fail then capture screenshot
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test case Skipped");
	}

	public void onFinish(ITestContext context) {
		extents.flush();
	}
public static String getCapture() {
	TakesScreenshot ts=(TakesScreenshot) driver;
	return ts.getScreenshotAs(OutputType.BASE64);
}
}
