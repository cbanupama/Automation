package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/tables.html");
	    List<WebElement> allcells = driver.findElements(By.xpath("//table[@id='t1']//td"));
	    int count = allcells.size();
	    System.out.println(count);
	    
	    for(int i=0;i<allcells.size();i++)
	    {
	    	System.out.println(allcells.get(i).getText());
	    	
	    }
	    
	    driver.close();

	}

}
