package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class countAndPrintSelectopt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/multipleSelectlist.html");
		 WebElement hotel = driver.findElement(By.id("empire"));
		Select sel = new Select(hotel);
		
		//To select the option
		
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		 
		//to get address of all selected options
		
		List<WebElement> alloptions = sel.getAllSelectedOptions();
		
		//to count number of selected options
		
		int count = alloptions.size();
		System.out.println(count);
		
		//to print all selected options
		
		for(int i=0 ;i<count;i++)
		{
		WebElement option = alloptions.get(i);
		String text = option.getText();
		System.out.println(text);
		
		}
		
		driver.close();
		
	}

}
