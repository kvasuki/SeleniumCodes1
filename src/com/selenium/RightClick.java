package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions ac= new Actions(driver);
		
		ac.contextClick(element).perform();
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
	}

}
