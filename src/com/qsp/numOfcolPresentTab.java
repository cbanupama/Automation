package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numOfcolPresentTab {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///D:/htmlQsp/tables.html");
			WebElement element = driver.findElement(By.id("t1"));
		    List<WebElement> allcolumn = element.findElements(By.tagName("td"));
		    int count = allcolumn.size();
		    System.out.println(count);
		 
		    driver.close();


	}

}
