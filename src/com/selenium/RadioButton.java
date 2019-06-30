package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
				
		//Female radio button
		//driver.findElement(By.id("u_0_9")).click();
				
		//male radio button
		driver.findElement(By.id("u_0_a")).click();

			}


}
