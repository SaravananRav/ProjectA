package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\smart saran\\Downloads\\eclipse-committers-oxygen-3a-win32\\eclipse\\saro\\New\\driverr\\chromedriver.exe");
		  driver=new ChromeDriver();
		return driver;
	}
	public static void loadurl(String url) {
    driver.get(url);
	}
	public static void type(WebElement e,String value) {
		e.sendKeys(value);
	

	}
<<<<<<< HEAD
	public static void click(WebElement e) {
		e.click();
	}
=======
	
>>>>>>> 5b22327153ec7e613ae6d7f8dae37506c29c1d53

}
