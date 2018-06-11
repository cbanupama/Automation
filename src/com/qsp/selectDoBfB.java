package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDoBfB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//To select the Day
		
		WebElement allDays = driver.findElement(By.id("day"));
		
		Select day = new Select(allDays);
		
		day.selectByValue("21");
		Thread.sleep(1000);
		
		//To select the month
		WebElement allmonths = driver.findElement(By.id("month"));
		Select month = new Select(allmonths);
		month.selectByIndex(3);
		Thread.sleep(1000);
		
		//To select the year
		WebElement allyears = driver.findElement(By.id("year"));
		Select year = new Select(allyears);
		year.selectByVisibleText("1994");
		Thread.sleep(1000);
			
				

	}

}
