package com.qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countPrintlist {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/htmlQsp/institute.html");
		driver.manage().window().maximize();
		
		//to store the address of all the link
		 List<WebElement> alllist = driver.findElements(By.xpath("//a"));
		 
		 //to get the number of links
		 int count = alllist.size();
		 System.out.println(count);
		 
		 //to get the text in links
		 for(int i=0; i<count ;i++)
		 {
			WebElement text = alllist.get(i);
			System.out.println(text);
		 }
		driver.close();

	}

}
