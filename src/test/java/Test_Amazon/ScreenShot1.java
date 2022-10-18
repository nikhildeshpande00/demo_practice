package Test_Amazon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.HomePagePomAmazon;
import com.Utility.BaseClass1_Amazon;
import com.Utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenShot1 extends BaseClass1_Amazon {

	@Test
public void TC001() throws Exception {

	HomePagePomAmazon Homepage=PageFactory.initElements(driver,HomePagePomAmazon.class);
	Library.custom_Sendkeys(Homepage.getSearchBox(),excel.getExcelData("Sheet2", 1,0 ));
	Library.custom_click(Homepage.getSearchBox());
	
	
	}
}

