package com.test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginTest extends BaseClass {

	@Test
	public void TC_001(){
		//call PageFactory.initElements //pageFactory is a class ie className.methodname//initElements is method
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);  //loginpom is class where we store login page webelement
		
	Library.custom_Sendkeys(login.getTxt_email(),excel.getExcelData("Sheet1", 1, 0));
	Library.custom_Sendkeys(login.getTxt_Password(), excel.getExcelData("Sheet1", 1, 1));
	Library.custom_click(login.getLogin_button());
	
	// Assert.assertTrue(false);; if we have to fail this test case that why we use this assert
	}
}
