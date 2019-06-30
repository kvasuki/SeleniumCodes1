package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='uploadfile_0']")).sendKeys("E://Selenium-Framework-Design-in-Data-Driven-Testing-eBook.pdf");
		
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
		element.click();
		Boolean b= element.isSelected();
		System.out.println(b);
		
		driver.close();
		
	}

}
