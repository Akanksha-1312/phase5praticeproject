package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prateek\\Phase 5 Workspace\\selenium_one_program\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();	
//		wd.get("file:///C:/Users/Prateek/Phase%205%20Workspace/selenium_one_program/index.html");  // load static or dynamic web page 
		wd.get("http://127.0.0.1:5500/index.html");
//		String titleTagContent	=wd.getTitle();
//		String url=wd.getCurrentUrl();
//		String pageContent=wd.getPageSource();
//		System.out.println(url);
//		System.out.println(pageContent);
//		System.out.println(titleTagContent);
		WebElement h2TagRef	 = wd.findElement(By.tagName("h2"));
		WebElement pTagRef	 = wd.findElement(By.tagName("p"));
		WebElement divTagRef	 = wd.findElement(By.tagName("div"));
		System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
		System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
		System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
	
	
	
	}

}
