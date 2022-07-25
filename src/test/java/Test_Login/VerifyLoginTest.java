package Test_Login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPom;
import Utility.BaseClass;

public class VerifyLoginTest extends BaseClass {

	@Test
	public void TC_001(){
		//call PageFactory.initElements //pageFactory is a class ie className.methodname//initElements is method
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);  //loginpom is class where we store login page webelement
		login.getTxt_email().sendKeys("nikhildeshpande");
		login.getTxt_Password().sendKeys("123345");
		
	}
}
