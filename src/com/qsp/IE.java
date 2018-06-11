package com.qsp;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		

	}

}
