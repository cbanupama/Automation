package com.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jsPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///D:/htmlQsp/jspopup.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("p")).click();
		try
		{
		Alert a1 = driver.switchTo().alert();
		System.out.println("js popup is present");
		a1.sendKeys("Anupama");
		a1.accept();
		String actual = "welcome Anupama";
		String str = driver.findElement(By.id("demo")).getText();
			if(str.equals(actual))
			{
				System.out.println("msg is displayed");
			}
			else
			{
				System.out.println("msg is not displayed");
			}
		}
		catch(Exception e)
		{
			System.out.println("js popup is not present");
			
		}
		
		
	}

}
