package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumOfElements {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			List<WebElement> l = driver.findElements(By.tagName("a"));
			System.out.println(l);
			System.out.println(l.size());

			driver.close();

		}

	}


	
