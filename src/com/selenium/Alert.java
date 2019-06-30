package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://jsbin.com/usidix/1");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		Thread.sleep(3000);
		
		String s= driver.switchTo().alert().getText();
		System.out.println(s);
		
		if (s.equals("This is an alert box."))
		{
			System.out.println("Correct alert message");
		}
		else
		{
			System.out.println("Incorrect alert message");
		}

		driver.switchTo().alert().accept();	
		
		driver.close();
	}
}
