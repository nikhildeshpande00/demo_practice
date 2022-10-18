package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test001 extends BaseClass{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver.get("config.getBase_URL_QA1()");
		driver.manage().window().maximize();
		

	}

}
