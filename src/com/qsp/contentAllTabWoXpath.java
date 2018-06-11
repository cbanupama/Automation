package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contentAllTabWoXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/tables.html");
	    List<WebElement> allcontent = driver.findElements(By.tagName("table"));
	    int count = allcontent.size();
	    System.out.println(count);
	    
	    for(int i=0;i<allcontent.size();i++)
	    {
	    	System.out.println(allcontent.get(i).getText());
	    	
	    }
	    
	    driver.close();

	}

}
