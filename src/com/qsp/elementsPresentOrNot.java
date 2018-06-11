package com.qsp;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class elementsPresentOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("file:///D:/htmlQsp/selectlist.html");
		 WebElement hotel = driver.findElement(By.id("empire"));
		 
		 Select sel = new Select(hotel);
		 
		 ArrayList<String> alltext = new ArrayList<>();
		 
		List<WebElement> alloptions = sel.getOptions();
		
		for(WebElement option : alloptions)
		{
			String text = option.getText();
			alltext.add(text);
		}
		
		if(alltext.contains("Fish"))
		{
			System.out.println("option is present");
		}
		else
		{
			System.out.println("option is not present");
		}
		 
		driver.close();
	}

}
