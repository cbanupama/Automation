package com.qsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBoxContainDuplicateOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/selectlist.html");
		WebElement hotel = driver.findElement(By.id("empire"));
		Select sel = new Select(hotel);
		
		ArrayList<String> alltext= new ArrayList<>();
		
		List<WebElement> alloptions = sel.getOptions();
		
		for(WebElement options : alloptions)
		{
			String texts = options.getText();
			alltext.add(texts);
		}
		
		HashSet<String> allcopyoptions = new HashSet<>(alltext);
		
		if(allcopyoptions.size() == alloptions.size())
		{
			System.out.println("No Duplicate");
		}
		else
		{
			System.out.println("Duplicate");
		}
		

	}

}
