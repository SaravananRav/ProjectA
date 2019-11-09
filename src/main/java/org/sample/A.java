package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class A extends BaseClass {
	public static void main(String[] args) {
		getDriver();
       loadurl("https://www.facebook.com/");
       WebElement txt = driver.findElement(By.id("email"));
      
       type(txt,"smartsaran");
      
  
       WebElement pass = driver.findElement(By.id("pass"));
       type(pass, "nisha");
       
       WebElement btn = driver.findElement(By.xpath("//input[@id='u_0_2']"));
       click(btn);
	}

}
