package com.qsp;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckSortedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.get("file:///D:/htmlQsp/selectlist.html");
		WebElement hotel = driver.findElement(By.id("empire"));
		
		
		
		ArrayList<String> alltexts = new ArrayList<>();
		Select sel = new Select(hotel);
		
		List<WebElement> alloptions = sel.getOptions();
		
		for(WebElement options : alloptions)
		{
			String text = options.getText();
			alltexts.addAll(alltexts);
			System.out.println(text);
		}
		
		Collections.sort(alltexts);
		
		for( String s : alltexts)
		{
			System.out.println(s);
		}
		//If( lstDropdownOption.equals(sortedlist)){System.out.println(“is sorted”); }
		
		if(alloptions.equals(alltexts))
		{
			System.out.println("is sorted");
		}
		else
		{
			System.out.println("not Sorted");
		}
		
		driver.close();
		

	}


}
