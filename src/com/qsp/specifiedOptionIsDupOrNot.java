package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class specifiedOptionIsDupOrNot {

	public static void main(String[] args) {
		int count=0;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/selectlist.html");
		WebElement hotel = driver.findElement(By.id("empire"));
		Select sel = new Select(hotel);
		
	List<WebElement> alloptions = sel.getOptions();
	for(WebElement alltext: alloptions)
	{
		String text = alltext.getText();
		if(text.equals("Fish"))
		{
			count++;
		}
	}
	if(count >1)
	{
		System.out.println("Duplcate");
	}
	else
	{
		System.out.println("Not Duplicate");
	}
	
	driver.close();
	}

}
