package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","E:\\seleniumJars\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//JavascriptExecutor jsx = (JavascriptExecutor)driver;
		//jsx.executeScript("window.scrollBy(0,450)", "");
		
		
		//location 0f 5000  webelement
		WebElement src= driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		//location of amount webelement
		WebElement dest= driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		//WebElement scr=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		 // WebElement dest=driver.findElement(By.xpath("//*[@id='bank']/li"));	
		
		Actions ac= new Actions(driver);
		//ac.dragAndDrop(src, dest).build().perform();
		ac.clickAndHold(src).moveToElement(dest).release().build().perform();
		
	}
}
