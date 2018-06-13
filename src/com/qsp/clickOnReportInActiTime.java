package com.qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clickOnReportInActiTime {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='REPORTS']/..")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Monthly Team Performance']")).click();
		
		Thread.sleep(4000);
		String xp = "//td[@class='reportFormBlockBodyCell']/../../../../..//td[@class='headerFooterCell clickableCell exportToCSV cellWithBorder']";
		driver.findElement(By.xpath(xp)).click();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		
		Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
