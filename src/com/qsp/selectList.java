package com.qsp;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class selectList {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/selectlist.html");
		//To get address of listbox
		WebElement hotel = driver.findElement(By.id("empire"));
		
		Select sel = new Select(hotel);
		Thread.sleep(1000);
		
		//select by using index
		sel.selectByIndex(1);
		Thread.sleep(1000);
		
		//select by using value
		sel.selectByValue("f");
		Thread.sleep(1000);
		
		//select by using text
		sel.selectByVisibleText("prawns");
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
