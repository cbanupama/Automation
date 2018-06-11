package com.qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextClickRightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement Link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		//to right click on element 
		act.contextClick(Link).perform();
		
		Thread.sleep(2000);
		
		//to press 'w' in keyboard
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		
		

	}

}
