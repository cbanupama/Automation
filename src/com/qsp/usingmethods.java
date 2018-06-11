package com.qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingmethods {

	public static void main(String[] args) throws InterruptedException
	{
		//open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//enter the URL
		driver.get("https://www.facebook.com/");
		
		//get the title of current WebPage
		String tittle = driver.getTitle();
		System.out.println("Tittle: "+ tittle);
		
		//get the URL of current WebPage
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		
		//get the current page source code
		String pageSrc = driver.getPageSource();
		System.out.println(pageSrc);
		

	}

}
