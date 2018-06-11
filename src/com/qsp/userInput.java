package com.qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class userInput {

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Enter Browser Name");
		Scanner scan = new Scanner(System.in);
		String browser = scan.nextLine();
		WebDriver driver =null;
		if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
			if(browser.equalsIgnoreCase("gc"))
		{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
		}
		Thread.sleep(2000);
		driver.close();
		

	}

}
