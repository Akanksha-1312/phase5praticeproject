package com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "P:\\javafsd\\web_driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("http://127.0.0.1:5500/regist.html");
		WebElement fnameRef = wd.findElement(By.id("m1"));
		WebElement lnameRef = wd.findElement(By.id("m2"));
		WebElement emailIdRef = wd.findElement(By.id("m3"));
		WebElement passwordRef = wd.findElement(By.id("m4"));
		WebElement submitButtonRef = wd.findElement(By.id("c1"));
		submitButtonRef.click();
		Alert alertRef	= wd.switchTo().alert();	
		System.out.println(alertRef.getText());
		alertRef.accept();

	
	
	}
}
