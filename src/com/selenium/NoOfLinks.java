package com.selenium;

//import java.awt.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",  "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> ls = driver.findElements(By.tagName("*"));
		System.out.println(ls);
		System.out.println(ls.size());

	}

}
