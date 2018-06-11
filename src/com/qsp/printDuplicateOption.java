package com.qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printDuplicateOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.get("file:///D:/htmlQsp/selectlist.html");
		WebElement hotel = driver.findElement(By.id("empire"));
		
		Select sel = new Select(hotel);
		
		ArrayList<String> alltexts = new ArrayList<>();
	
		LinkedHashMap<String,Integer> eachoccur = new LinkedHashMap<>();
		
		List<WebElement> alloptions = sel.getOptions();
		
		for(WebElement options : alloptions)
		{
			String text = options.getText();
			alltexts.add(options.getText());
			//System.out.println(text);
		}
		
		
		for(int i=0; i<=alltexts.size()-1; i++)
		{
			int count = 1;
			for(int j= i+1;j<=alltexts.size()-1;j++)
			{
				if(alltexts.get(i).equals(alltexts.get(j)))
				{
				count++;
				}
			}
			if(!(eachoccur.containsKey(alltexts.get(i))))
			{
				eachoccur.put(alltexts.get(i),count);
			}
		}
	
		System.out.println(eachoccur);
		driver.close();

  	
		

	}

}
