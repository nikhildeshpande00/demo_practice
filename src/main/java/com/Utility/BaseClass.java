package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
//here we create a object of exeldata prover,configDataProvide class used to call in test cases
	
	public static WebDriver driver;  //instance declare
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	@BeforeSuite
	public void BS() throws Exception {
		 excel=new ExcelDataProvider();
		 config=new ConfigDataProvider();
	}
	@Parameters({"BrowserName"})
	
	@BeforeMethod
	public void setup(String BrowserName) {
	if (BrowserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else if(BrowserName.equalsIgnoreCase("FireFox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.get(config.getBase_URL_QA1());  //fetch url by configDataProvder
		driver.manage().window().maximize();
		
		
		
	}
	
	@AfterMethod
	public void AM() {
		driver.quit();
	}
	
}
