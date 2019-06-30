package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");

		// driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.id("u_0_j"));
		Boolean b= element.isDisplayed();
		System.out.println(b);
		//element.sendKeys("vasuki");
		
		WebElement element1= driver.findElement(By.id("u_0_11"));
		Boolean b1=element1.isEnabled();
		System.out.println(b1);
		
		WebElement element2= driver.findElement(By.id("u_0_a"));
		element2.click();
		Boolean b2=element2.isSelected();
		System.out.println(b2);
		
		driver.close();

	}


}
