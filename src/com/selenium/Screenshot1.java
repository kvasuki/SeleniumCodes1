package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	WebDriver driver;

	public void takeScreehot(String screenshotname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);

		File dest = new File("E:\\New folder\\SeleniumProject\\ScreenShot" + screenshotname + ".jpeg");
		FileUtils.copyFile(src, dest);
	}

	public void a() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com");
		takeScreehot("screenone");
	}

	public static void main(String args[]) throws InterruptedException, IOException {
		Screenshot1 s = new Screenshot1();
		s.a();

	}
}