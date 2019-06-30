package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("(//span[@class='nav-line-2'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("8956982003");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("amazonavg");
		
		driver.findElement(By.xpath("//span[@class='a-button a-button-span12 a-button-primary']")).click();
		
		Actions ac=new Actions(driver);
				
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-shop']"));
		ac.moveToElement(element).build().perform();
		
		WebElement element1=driver.findElement(By.xpath("(//span[text()='Echo & Alexa'])[1]"));
		ac.moveToElement(element1).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Amazon Echo']")).click();
		
		driver.close();
	}
}
