package com.qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(2000);
		f.close();

	}

}
