package com.qsp;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numOfTabPresent {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/tables.html");
		List<WebElement> alltables = driver.findElements(By.xpath("//table"));
		int	count =alltables.size();
		System.out.println(count);
	


		driver.close();

	}

}
