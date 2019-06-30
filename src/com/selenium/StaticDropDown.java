package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to(
				"https://www.facebook.com/?stype=lo&jlou=AfeKFZg-hXV8WBvDOV2yUs0RdpkSNzFgL8dYqYuRtoM-4o8-GADi7_7b2I1C_4azkdvDr0XC6PqxMQrAUEUV_KWQpecH6XWLKYZ9uycC2FqS9Q&smuh=25447&lh=Ac_ipEaRj9U1DdZX");
		driver.findElement(By.xpath("//*[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Keshav");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Kshirsagar");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("54518721456");
		driver.findElement(By.xpath("//*[@autocomplete='new-password']")).sendKeys("qqqqqqqqqq");

		Select slt = new Select(driver.findElement(By.xpath("//*[@name='birthday_day']")));

		slt.selectByVisibleText("3");

		// Select slt=new
		// Select(driver.findElement(By.xpath("//*[@name='birthday_day']")));
		// slt.selectByVisibleText("3");
		Select slt1 = new Select(driver.findElement(By.xpath("//*[@name='birthday_month']")));
		slt1.selectByValue("1");
		Select slt2 = new Select(driver.findElement(By.id("year")));
		slt2.selectByVisibleText("2019");
		// driver.findElement(By.xpath("//*[@name='birthday_day']")).sendKeys("3");
		// driver.findElement(By.xpath("//*[@name='birthday_month']")).sendKeys("Jan");
		// driver.findElement(By.xpath("//*[@name='birthday_month']")).sendKeys("2019");
		driver.findElement(By.xpath("(//*[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//*[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		// Select slt=new Select(driver.findElement(By.id("//*[@id='day']")));
		// slt.selectByVisibleText("3");
		
		if(slt.isMultiple())
		{
			System.out.println("allow multiple options");
		}
		else
		{
			System.out.println("does not allow multiple options");
		}
		
		driver.quit();
		// driver.close();

	}

}
