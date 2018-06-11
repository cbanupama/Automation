package com.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("cbanupama03@gmail.com");
		
		driver.findElement(By.xpath("div[@class='ZFr60d CeoRYc']")).click();
		
		
		driver.findElement(By.cssSelector("input['name=password ']")).sendKeys("password");
		
	}

}
