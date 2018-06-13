package com.qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeBreakControlSpecifiedTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	
		Set<String> alltabs = driver.getWindowHandles();
		for(String tab : alltabs)
		{
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			if(title.equals("actiTIME - Login"))
			{
				break;
			}
		}

	}

}
