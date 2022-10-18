package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	//here we store only login page web Element
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement txt_email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement Txt_Password;
	@FindBy(how=How.XPATH,using="//button[@type='submit']") private WebElement login_button;
	
	//step2 generate getter and setter method and remove setter method
	
	
	
	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_Password() {
		return Txt_Password;}

	public WebElement getLogin_button() {
		return login_button;
	}

	
}
