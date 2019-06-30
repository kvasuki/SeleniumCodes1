package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AunthenticationPopUp {
	
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement element=driver.findElement(By.cssSelector("p"));
		
		String pagemessage=element.getText();
		System.out.println(pagemessage);
		
		if(pagemessage.equals(element.getText()))
		{
			System.out.println("correct message");
		}
		else
		{
			System.out.println("Incorrect message");
		}
	}
}
