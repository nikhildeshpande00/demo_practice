package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
//ExtentSparkReporter used for making reports is used for make decorative reports. 
	//ExtentReports-is a--class
	public static ExtentReports extents;
	
	
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\DEMO\\Reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("Demo Reports");
		reporter.config().setTheme(Theme.STANDARD);

		 extents=new ExtentReports();
		extents.attachReporter(reporter);
	extents.setSystemInfo("Poject Name","batch 11 Demo reports");
	extents.setSystemInfo("Module Name","Module_login");
	extents.setSystemInfo("BrowserName", "Chrome");
	extents.setSystemInfo("Version Selenium", "3.141.59");
	extents.setSystemInfo("QA","Nikhil D");
	
	return extents;
	
	}
}
