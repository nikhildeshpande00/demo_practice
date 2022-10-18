package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1_Amazon {

	public static  WebDriver driver;
public static ExcelDataProvider excel;
	
	@BeforeSuite
public void BS() throws Exception {
	 excel=new ExcelDataProvider();
	
	
}
	
	
	
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
}
		@AfterMethod
		public void AM() {
			
			//driver.quit();
			
		}
		
		
		
	}

