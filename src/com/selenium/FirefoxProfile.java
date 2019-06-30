package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxProfile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		FirefoxProfile  profile= new FirefoxProfile();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
		profile.setAccepttrustedCertificate(false);
		
		WebDriver driver= new FireFoxDriver(profile);
		driver.get("www.google.com");
		

	}

}
