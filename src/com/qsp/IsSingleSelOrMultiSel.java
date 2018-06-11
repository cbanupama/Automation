package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSingleSelOrMultiSel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/multipleSelectlist.html");
		WebElement hotel = driver.findElement(By.id("empire"));
		Select sel =new Select(hotel);
	//	List<WebElement> alloptions = sel.getOptions();
		if(sel.isMultiple())
		{
			System.out.println("Multiple Selected");
		}
		else
		{
			System.out.println("single selected");
		}
		driver.close();
		
	}

}
