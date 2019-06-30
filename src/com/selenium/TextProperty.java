package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextProperty {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html");
		
		 WebElement text = driver.findElement(By.xpath("//h1[contains(.,'Example Login Page')]"));
		 String fontSize = text.getCssValue("font-size");
		  System.out.println("Font Size -> "+fontSize);
		
	}

}
