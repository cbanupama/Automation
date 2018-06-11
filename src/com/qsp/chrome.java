package com.qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		Thread.sleep(3000);
		c.close();

	}

}
