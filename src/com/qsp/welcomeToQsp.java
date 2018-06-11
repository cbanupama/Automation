package com.qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class welcomeToQsp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.get("file:///D:/htmlQsp/qsp.html");
		WebElement Qspiders = driver.findElement(By.id("qsp"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(Qspiders).perform();
		
		WebElement message = driver.findElement(By.id("p"));
		String text = message.getText();
		
		System.out.println(text);
		
		if(text.equals("WELCOME TO QSPIDERS"))
		{
			System.out.println("message is displayed"); 
		}
		else
		{
			System.out.println("not displayed");
		}
		driver.close();
	}

}
