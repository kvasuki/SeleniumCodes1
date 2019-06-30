package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ResizeWindow1 {
	
	public static void main(String args[]) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions op= new ChromeOptions();
		op.addArguments("window-size=800,480");
		
		DesiredCapabilities cp= DesiredCapabilities.chrome();
		cp.setCapability(ChromeOptions.CAPABILITY, op);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:.//www.google.com");
	}
}
