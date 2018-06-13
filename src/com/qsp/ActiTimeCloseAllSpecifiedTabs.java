package com.qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeCloseAllSpecifiedTabs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		String ptab = driver.getWindowHandle();
		Set<String> alltabs = driver.getWindowHandles();
		for(String tab : alltabs)
		{
			driver.switchTo().window(tab);
			if(!ptab.equals(tab))
			{
				driver.close();
				Thread.sleep(2000);
			}
		}

	}

}
