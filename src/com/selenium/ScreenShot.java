package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {

		WebDriver driver;

		public void takeScreehot(String screenshotname) throws IOException {

			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);

			File dest = new File("E:\\New folder\\SeleniumProject\\ScreenShot" + screenshotname + ".jpeg");
			FileUtils.copyFile(src, dest);
		}

		public void amazonAccess() throws InterruptedException, IOException 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			
			driver = new ChromeDriver();

			
			driver.get("https://www.amazon.in/");
			takeScreehot("screenone");
	        
			WebElement link = driver.findElement(By.xpath("//a[text()='Your Amazon.in']"));
			link.click();
			Thread.sleep(3000);

			WebElement text = driver.findElement(By.id("ap_email"));
			text.sendKeys("7896058765");
			Thread.sleep(3000);

			WebElement click = driver.findElement(By.xpath("//input[@class='a-button-input']"));
			click.click();
			Thread.sleep(3000);
			takeScreehot("screentwo");
			
			WebElement password = driver.findElement(By.name("password"));
			password.sendKeys("123456");

			WebElement click1 = driver.findElement(By.xpath("//input[@type='submit']"));
			click1.click();
			Thread.sleep(3000);

			driver.close();

		}
		
		public static void main(String args[]) throws InterruptedException, IOException {
			ScreenShot ax = new ScreenShot();
			ax.amazonAccess();
		}

	}

