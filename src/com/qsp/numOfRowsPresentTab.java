package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numOfRowsPresentTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/tables.html");
		List<WebElement> allrows = driver.findElements(By.xpath("//tr"));
		int count = allrows.size();
		System.out.println(count);
		
		driver.close();
		

	}

}
