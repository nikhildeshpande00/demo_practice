package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	//here we strore only login page web Element
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement txt_email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement Txt_Password;
	
	//step2 generate getter and setter method and remove setter method
	
	
	
	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_Password() {
		return Txt_Password;}
}
