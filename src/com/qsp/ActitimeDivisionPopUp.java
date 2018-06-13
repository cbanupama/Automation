package com.qsp;

import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeDivisionPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http://127.0.0.1:8080/user/submit_tt.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Tasks']/..")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Create New Tasks']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='     Cancel     ']")).click();
		
		driver.findElement(By.xpath("//a [text()='write system testcase']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete This Task']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("deleteAttention")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@id='deleteAttention']/../..//input[@value='Cancel']")).click();
		
	
		
	}

}
