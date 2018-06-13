package com.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class naukari {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\anupama\\Desktop\\resume\\Anupama C B (22nd MARCH 2018).doc");
		Thread.sleep(2000);
		driver.findElement(By.id("bd_adv_workExp_year")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[.='Fresher']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("bd_adv_workExp_month")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("//li[text()='0']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("bd_password")).sendKeys("$Actitime@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		
		
		
		
		
	}
	
}
