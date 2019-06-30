package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//driver.navigate().refresh();
		
		//driver.navigate().forward();
		
		//driver.navigate().back();
		
		//String s= driver.getCurrentUrl();
		//System.out.println("The current URL:" +s);
		
		driver.close();
		
	}
}
