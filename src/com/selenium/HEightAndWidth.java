package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HEightAndWidth {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");

		// driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("u_0_j"));
		int a=element.getSize().getHeight();
		System.out.println(a);
		
		WebElement element1=driver.findElement(By.id("u_0_j"));
		int b=element1.getSize().getWidth();
		System.out.println(a);

	}


}
