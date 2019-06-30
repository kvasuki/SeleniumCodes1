package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/yahoo.html");
		
		driver.findElement(By.xpath("//a[@id='messenger-download']")).click();
		
		String s= driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		
	}
}
