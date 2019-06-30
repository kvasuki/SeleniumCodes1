package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		
		String title= driver.getTitle();
		System.out.println("The title is: " +title);
		
		if(title.equals(driver.getTitle()))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
	}
}
