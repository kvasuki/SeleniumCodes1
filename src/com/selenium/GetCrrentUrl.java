package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCrrentUrl {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		String s=driver.getCurrentUrl();
		System.out.println("The current URL is:" + s);
		
		if(s.equals(driver.getCurrentUrl()))
		{
			System.out.println("Url is valid");
		}
		else
		{
			System.out.println("Url is invalid");
		}
	}

}
