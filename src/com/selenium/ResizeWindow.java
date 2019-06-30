package com.selenium;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeWindow 
{

	public static void main(String args[])  
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
		
		System.out.println(driver.manage().window().getSize());
		
		int width=500;
		int height=400;
		
		Dimension d= new Dimension(width,height);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
	}
}