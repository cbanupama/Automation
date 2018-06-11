package com.qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class actions {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("Title :" + title);
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.println("URL :" + url);
		Thread.sleep(1000);
		String pg = driver.getPageSource();
		System.out.println("PageSource: "+pg);
		Thread.sleep(1000);
		
		
		Dimension d = new Dimension(500,500);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Thread.sleep(1000);
		Point p = new Point(250,250);
		Thread.sleep(1000);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().to("https://www.hackerrank.com");
		Thread.sleep(1000);
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		

	}

}
