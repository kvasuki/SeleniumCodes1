package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame("a077aa5e"); // switching the frame by ID
		
		driver.findElement(By.xpath("html/body/a/img")).click();
		
		driver.switchTo().defaultContent();
	
	}

}
