package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnImage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get( "https://www.facebook.com/login/identify?ctx=recover");
		
		driver.findElement(By.xpath("//i[@class='fb_logo img sp_iICNCrZgHFe sx_240b73']")).click();
		
		Thread.sleep(3000);
		
        driver.navigate().back();
        
        String s=driver.getTitle();
        System.out.println(s);
        
       if(driver.getTitle().equals(s))
        {
        	System.out.println("we r in initial page");
        }
        else
        {
        	System.out.println("we r at registration page");
        }
       
       driver.close();
	}
}
