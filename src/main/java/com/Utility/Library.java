package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import net.bytebuddy.utility.RandomString;

public class Library {
//in library class we create a method for catching a exception
	
	public static ExtentTest test;
	public static void custom_Sendkeys(WebElement element,String value) {

try {
element.sendKeys(value);	
}
   catch(Exception e) {
	System.out.println(e.getMessage());
}
}

public static void custom_click(WebElement element) {
	try {element.click();
}catch(Exception t) {
	System.out.println(t.getMessage());
}
}

public static void custom_handleDropDown(WebElement element,String text) {
	try {
	Select select=new Select(element);
   select.selectByVisibleText(text);
}catch(Exception e) {
	System.out.println(e.getMessage());
}
}

public static void custom_mouseMoment(WebDriver driver,WebElement element) {
	try {
	Actions act=new Actions(driver);
	act.moveToElement(element).click().build().perform(); //becoz 2 actions are performed.
}catch(Exception e) {
	System.out.println(e.getMessage());
}
}

public static void custom_getScreenShot(WebDriver driver) throws Exception {
	try {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String name=RandomString.make(4);
	File destination=new File("C:\\Users\\ADMIN\\eclipse-workspace\\DEMO\\Screenshots\\"+name+".png");
	
	FileUtils.copyDirectory(source, destination);
}catch(Exception e) {
	System.out.println(e.getMessage());
}
}
public static Alert custom_handleAlert(WebDriver driver) {
	Alert alt=driver.switchTo().alert();
	return alt;
}


}