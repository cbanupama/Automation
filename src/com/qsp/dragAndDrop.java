package com.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement src = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.clickAndHold().dragAndDrop(src, target).perform();
		
		
		
		
	}

}
