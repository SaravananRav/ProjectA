package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.graph.ElementOrder.Type;

public class A extends BaseClass {
	public static void main(String[] args) {
		getDriver();
       loadurl("https://www.facebook.com/");
       WebElement txt = driver.findElement(By.id("email"));
      
       type(txt,"smartsaran");
       WebElement txtpass = driver.findElement(By.id("pass"));
       type(txtpass,"askdfj");
	}

}
