package com.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class ='inputtext']")).sendKeys("Xyz");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Xyz");
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[tabindex='4']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']")).sendKeys("Abc");
		
		//driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Abc");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys("Abc");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("hello@example.com");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("select#day")).sendKeys("01");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("select#month")).sendKeys("jun");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("select#year")).sendKeys("2016");
		//Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#u_0_9")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#u_0_a")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button#u_0_15")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
