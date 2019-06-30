package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		//myExecutor.executeScript("document.getElementsByName('q')[0].value='vasuki'");
		
		js.executeScript("document.getElementsByName('firstname')[0].value='vasuki'");
	}
}
