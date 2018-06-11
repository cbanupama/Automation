package com.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class confirmPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("file:///D:/htmlQsp/jspopup.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("c")).click();
		Thread.sleep(1000);
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println(text);
		
		
		alt.dismiss();
		
		
		

	}

}
