package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePomAmazon {
@FindBy(how=How.XPATH,using= "//input[@name='field-keywords']") private WebElement searchBox;

public WebElement getSearchBox() {
	return searchBox;
}

}


